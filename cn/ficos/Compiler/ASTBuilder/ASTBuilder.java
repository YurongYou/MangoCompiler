package cn.ficos.Compiler.ASTBuilder;

import cn.ficos.Compiler.AST.*;
import cn.ficos.Compiler.Exceptions.*;
import cn.ficos.Compiler.Gadgets.*;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.Symbol;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;
import cn.ficos.Compiler.Gadgets.Type.ClassType;
import cn.ficos.Compiler.Gadgets.Type.Type;
import cn.ficos.Compiler.Syntax.MangoBaseVisitor;
import cn.ficos.Compiler.Syntax.MangoParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static cn.ficos.Compiler.Gadgets.Name.getName;
import static cn.ficos.Compiler.Gadgets.TypeParser.parseType;

/**
 * This class is intended to fully build up an AST from the parsetree generated by ANTLR v4.
 * <p> node that ClassFuncAccess also represents the BuiltInType
 * Created by Ficos on 16/4/2.
 */
public class ASTBuilder extends MangoBaseVisitor<AST> {
    private SymbolTable global = new SymbolTable();
    private String nowClass = null;
    private Stack<LoopScope> nowLoop = new Stack<>();
    private FuncDecl nowFunc = null;
//    private Boolean finelyReturned = false;

    public ASTBuilder(org.antlr.v4.runtime.tree.ParseTree ctx) {
        // collect information before visit.
        ClassCollector classCollector = new ClassCollector(global);
        Field_FunctionCollector field_functionCollector = new Field_FunctionCollector(global);

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(classCollector, ctx);
        walker.walk(field_functionCollector, ctx);

        if (!(classCollector.isAllCorrect() &&
                field_functionCollector.isAllCorrect()))
            throw new SemanticError();
    }

    private Boolean suit(Type base, Type rhs) {
        if (rhs == null) {
            return (base instanceof ArrayType || base instanceof ClassType);
        }
        return rhs.isSuitableAs(base);
    }

    @Override
    public AST visitProg(MangoParser.ProgContext ctx) {
        List<Decl> decls = new LinkedList<>();
        for (ParserRuleContext child : ctx.decl()) {
            decls.add((Decl) visit(child));
        }
        return new Program(decls, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitVarDecl(MangoParser.VarDeclContext ctx) {
        Type varType;
        ExprStmt rhs = null;
        Name varName = getName(ctx.ID().getText());
        try {
            varType = parseType(ctx.type().getText(), global);
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined class type <" +
                    ctx.type().getText() + '>');
            throw new SemanticError();
        }
        if (ctx.expr() != null) {
            rhs = (ExprStmt) visit(ctx.expr());
            if (!suit(varType, rhs.getType())) {
                System.err.println("line " + ctx.getStart().getLine() + ": Unsuitable type in variable declaration, expect <" +
                        varType + "> but meet <" + rhs.getType() + ">");
                throw new SemanticError();
            }
        }
        VarSymbol varInfo = new VarSymbol(varName, varType);
        try {
            global.define(varName, varInfo);
        } catch (Redefine err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Redefining variable <" + ctx.ID().getText() +
                    ">");
            throw new SemanticError();
        }
        // currentScope == 0 means it's now in global
        if (global.getCurrentScope() == 0) {
            return new VarDecl(varInfo, rhs, new Position(ctx.getStart().getLine()));
        } else {
            return new VarDeclStmt(varInfo, rhs, new Position(ctx.getStart().getLine()));
        }
    }

//    @Override
//    public AST visitAtom(MangoParser.AtomContext ctx) {
//
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public AST visitArrayType(MangoParser.ArrayTypeContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public AST visitAtomType(MangoParser.AtomTypeContext ctx) {
//        return visitChildren(ctx);
//    }

    @Override
    public AST visitFuncDecl(MangoParser.FuncDeclContext ctx) {
        Name funcName;
        if (nowClass != null) {
            funcName = Name.getName(nowClass + '.' + ctx.ID().getText());
        } else funcName = Name.getName(ctx.ID().getText());

        FuncSymbol funcInfo;
        try {
            funcInfo = (FuncSymbol) global.resolve(funcName);
        } catch (Undefined err) {
            throw new Bug_FuncNotDefine();
        }


        if (funcName.toString().equals("main")) {
            if (funcInfo.getReturnType() != SymbolTable.INT) {
                System.err.println("line " + ctx.getStart().getLine() + ": Wrong main function return type");
                throw new SemanticError();
            }
            if (funcInfo.getFormalParametersName() != null) {
                System.err.println("line " + ctx.getStart().getLine() + ": Main function should not have any formal parameters");
                throw new SemanticError();
            }
        }
        global.beginScope();
        if (funcInfo.getFormalParametersType() != null) {
            ListIterator<Type> APTitr = funcInfo.getFormalParametersType().listIterator();
            ListIterator<Name> APNitr = funcInfo.getFormalParametersName().listIterator();

            Name varName = null;
            try {
                while (APTitr.hasNext()) {
                    varName = APNitr.next();
                    global.define(varName, new VarSymbol(varName, APTitr.next()));
                }
            } catch (Redefine err) {
                System.err.println("line " + ctx.getStart().getLine() + ": Redefined variable <" + varName +
                        ">");
                throw new SemanticError();
            }
        }
        FuncDecl func = new FuncDecl(funcInfo, null, new Position(ctx.getStart().getLine()));


        nowFunc = func;
//        finelyReturned = false;
        List<Stmt> stmts = null;
        if (ctx.block().stmt() != null) {
            stmts = new LinkedList<>();
            for (MangoParser.StmtContext s : ctx.block().stmt()) {
                Stmt temp = (Stmt) visit(s);
                // if it is an empty statement
                if (temp == null) continue;
                stmts.add(temp);
            }
        }


//        if (funcInfo.getReturnType() != null && !finelyReturned && !(funcInfo.getReturnType() == SymbolTable.INT && funcName.toString().equals("main"))) {
//            System.err.println("line " + ctx.getStart().getLine() + ": Function return not found, expecting return type <" + funcInfo.getReturnType() + ">");
//            throw new SemanticError();
//        }
        global.endScope();
        nowFunc = null;


        func.fillStmts(stmts);
        return func;
    }

//    @Override public AST visitFormalParameterList(MangoParser.FormalParameterListContext ctx) { return null; }
//
//    @Override public AST visitFormalParameter(MangoParser.FormalParameterContext ctx) { return null; }


    @Override
    public AST visitBlock(MangoParser.BlockContext ctx) {
        List<Stmt> stmts = null;
        if (ctx.stmt() != null) {
            stmts = new LinkedList<>();
            global.beginScope();
            for (MangoParser.StmtContext s : ctx.stmt()) {
                Stmt temp = (Stmt) visit(s);
                // if it is an empty statement
                if (temp == null) continue;
                stmts.add(temp);
            }
        }
        global.endScope();
        return new CompoundStmt(stmts, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitEmptyStmt(MangoParser.EmptyStmtContext ctx) {
        return null;
    }

    @Override
    public AST visitExprStmt(MangoParser.ExprStmtContext ctx) {
        return visit(ctx.expr());
    }

//    @Override
//    public AST visitCompoundStmt(MangoParser.CompoundStmtContext ctx) {
//        return visitChildren(ctx);
//    }

    @Override
    public AST visitSelectionStmt(MangoParser.SelectionStmtContext ctx) {
        MangoParser.SelectionContext info = ctx.selection();
        ExprStmt condition = (ExprStmt) visit(info.expr());

        if (!suit(condition.getType(), SymbolTable.BOOL)) {
            System.err.println("line " + ctx.getStart().getLine() + ": False if condition of type <" + condition.getType() + ">, expecting bool type");
            throw new SemanticError();
        }
//        finelyReturned = false;
        Stmt then;
        if (info.stmt(0) instanceof MangoParser.CompoundStmtContext)
            then = (Stmt) visit(info.stmt(0));
        else {
            global.beginScope();
            then = (Stmt) visit(info.stmt(0));
            global.endScope();
        }

        List<ExprStmt> subSelectionConditions = new LinkedList<>();
        List<Stmt> subSelectionThenStmts = new LinkedList<>();

        List<MangoParser.SubSelectionContext> elseif = info.subSelection();
        ListIterator<MangoParser.SubSelectionContext> elseifItr = elseif.listIterator();

        MangoParser.SubSelectionContext tempElseIf;
        while (elseifItr.hasNext()) {
            tempElseIf = elseifItr.next();
//            finelyReturned = false;
            ExprStmt elseIfCondition = (ExprStmt) visit(tempElseIf.expr());
            if (!suit(condition.getType(), SymbolTable.BOOL)) {
                System.err.println("line " + tempElseIf.getStart().getLine() + ": False else-if condition of type <" + elseIfCondition.getType() + ">, expecting bool type");
                throw new SemanticError();
            }
            subSelectionConditions.add(elseIfCondition);
            if (tempElseIf.stmt() instanceof MangoParser.CompoundStmtContext)
                subSelectionThenStmts.add((Stmt) visit(tempElseIf.stmt()));
            else {
                global.beginScope();
                subSelectionThenStmts.add((Stmt) visit(tempElseIf.stmt()));
                global.endScope();
            }
        }

        Stmt elseStmt = null;
        // if there is a else expression at the end
        if (info.stmt().size() > 1) {
//            finelyReturned = false;
            if (info.stmt(1) instanceof MangoParser.CompoundStmtContext)
                elseStmt = (Stmt) visit(info.stmt(1));
            else {
                global.beginScope();
                elseStmt = (Stmt) visit(info.stmt(1));
                global.endScope();
            }
        }

        return new SelectionStmt(condition, then,
                subSelectionConditions, subSelectionThenStmts,
                elseStmt, new Position(ctx.getStart().getLine()));
    }

//    @Override
//    public AST visitIterationStmt(MangoParser.IterationStmtContext ctx) {
//        return visitChildren(ctx);
//    }

//    @Override
//    public AST visitJumpStmt(MangoParser.JumpStmtContext ctx) {
//        return visitChildren(ctx);
//    }

//    @Override
//    public AST visitVarDeclStmt(MangoParser.VarDeclStmtContext ctx) {
//        return visitChildren(ctx);
//    }

    @Override
    public AST visitReturnStmt(MangoParser.ReturnStmtContext ctx) {
        ExprStmt returnExpr = null;
        if (ctx.expr() != null) {
            returnExpr = (ExprStmt) visit(ctx.expr());
        }
        // Checking whether the return type is suitable
        if (returnExpr == null) {
            if (nowFunc.getFuncInfo().getReturnType() != null) {
                System.err.println("line " + ctx.getStart().getLine() + ": Non-<void> function <" + nowFunc.getFuncInfo().getName() + "> expecting a return of type <" + nowFunc.getFuncInfo().getReturnType() +
                        ">, but found a pure return");
                throw new SemanticError();
            }
        } else if (returnExpr.getType() == null) {
            if (nowFunc.getFuncInfo().getReturnType() == null) {
                System.err.println("line " + ctx.getStart().getLine() + ": <void> function <" + nowFunc.getFuncInfo().getName() + "> found a <null> return");
                throw new SemanticError();
            } else {
                if (!((nowFunc.getFuncInfo().getReturnType() instanceof ArrayType) ||
                        (nowFunc.getFuncInfo().getReturnType() instanceof ClassType))) {
                    System.err.println("line " + ctx.getStart().getLine() + ": Improper function return, expecting a return of type <" +
                            nowFunc.getFuncInfo().getReturnType() +
                            ">, but found a return of <null>");
                    throw new SemanticError();
                }
            }
        } else {
            if (nowFunc.getFuncInfo().getReturnType() == null) {
                System.err.println("line " + ctx.getStart().getLine() + ": <void> function <" + nowFunc.getFuncInfo().getName() + "> found a return of type <" + returnExpr.getType() +
                        ">");
                throw new SemanticError();
            } else {
                if (!suit(nowFunc.getFuncInfo().getReturnType(), returnExpr.getType())) {
                    System.err.println("line " + ctx.getStart().getLine() + ": Improper function return, expecting type <" +
                            nowFunc.getFuncInfo().getReturnType() +
                            ">, but found a return of type <" + returnExpr.getType() + ">");
                    throw new SemanticError();
                }
            }
        }
//        finelyReturned = true;
        return new ReturnStmt(returnExpr, nowFunc, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitBreakStmt(MangoParser.BreakStmtContext ctx) {
        if (nowLoop.isEmpty()) {
            System.err.println("Unexpected break statement, at line " + ctx.getStart().getLine());
            throw new SemanticError();
        }
        return new BreakStmt(nowLoop.peek(), new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitContinueStmt(MangoParser.ContinueStmtContext ctx) {
        if (nowLoop.isEmpty()) {
            System.err.println("line " + ctx.getStart().getLine() + ": Unexpected <continue> statement");
            throw new SemanticError();
        }
        return new ContinueStmt(nowLoop.peek(), new Position(ctx.getStart().getLine()));
    }

//    @Override
//    public AST visitSelection(MangoParser.SelectionContext ctx) {
//        return visitChildren(ctx);
//    }
//
//    @Override
//    public AST visitSubSelection(MangoParser.SubSelectionContext ctx) {
//        return visitChildren(ctx);
//    }

    @Override
    public AST visitWhileLoop(MangoParser.WhileLoopContext ctx) {
        ExprStmt condition = (ExprStmt) visit(ctx.expr());
        if (!suit(SymbolTable.BOOL, condition.getType())) {
            System.err.println("line " + ctx.getStart().getLine() + ": False while-loop condition of type <" + condition.getType() + ">, expecting bool type");
            throw new SemanticError();
        }
        WhileStmt whileLoop = new WhileStmt(condition, null, new Position(ctx.getStart().getLine()));


        // The following code intends to avoid
        // while(condition) int a = 1;
        // if in-while is not compound-statement, the declaration will occur in wrong scope
        nowLoop.push(whileLoop);
        Stmt loop;
        if (ctx.stmt() instanceof MangoParser.CompoundStmtContext)
            loop = (Stmt) visit(ctx.stmt());
        else {
            global.beginScope();
            loop = (Stmt) visit(ctx.stmt());
            global.endScope();
        }
        nowLoop.pop();


        whileLoop.fillLoop(loop);
        return whileLoop;
    }

    @Override
    public AST visitForLoop(MangoParser.ForLoopContext ctx) {
        ExprStmt init = null;
        if (ctx.init != null) {
            init = (ExprStmt) visit(ctx.init);
        }
        ExprStmt condition = null;
        if (ctx.condition != null) {
            condition = (ExprStmt) visit(ctx.condition);
            if (!suit(SymbolTable.BOOL, condition.getType())) {
                System.err.println("line " + ctx.getStart().getLine() + ": False for-loop condition of type <" + condition.getType() + ">, expecting bool type");
                throw new SemanticError();
            }
        }
        ExprStmt after = null;
        if (ctx.after != null) {
            after = (ExprStmt) visit(ctx.after);
        }
        ForStmt forLoop = new ForStmt(init, condition, after, null, new Position(ctx.getStart().getLine()));

        // The following code intends to avoid
        // for(conditions) int a = 1;
        // if in-for is not compound-statement, the declaration will occur in wrong scope
        nowLoop.push(forLoop);
        Stmt loop;
        if (ctx.stmt() instanceof MangoParser.CompoundStmtContext)
            loop = (Stmt) visit(ctx.stmt());
        else {
            global.beginScope();
            loop = (Stmt) visit(ctx.stmt());
            global.endScope();
        }
        nowLoop.pop();

        forLoop.fillLoop(loop);
        return forLoop;
    }

    @Override
    public AST visitBracket(MangoParser.BracketContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public AST visitCall(MangoParser.CallContext ctx) {
        FuncSymbol funcInfo;
        try {
            if (nowClass != null) {
                try {
                    funcInfo = (FuncSymbol) global.resolve(getName(nowClass + '.' + ctx.ID().getText()));
                } catch (Undefined notClassFunction) {
                    Symbol test = global.resolve(getName(ctx.ID().getText()));
                    if (!(test instanceof FuncSymbol)) throw new Undefined();
                    else funcInfo = (FuncSymbol) test;
                }
            } else {
                funcInfo = (FuncSymbol) global.resolve(getName(ctx.ID().getText()));
            }
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined function <" +
                    ctx.ID().getText() + ">");
            throw new SemanticError();
        } catch (java.lang.ClassCastException err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using variable <" + ctx.ID().getText() +
                    "> as a function");
            throw new SemanticError();
        }

        // if the actual function call have no parameters
        // note that exprList might be null
        if (ctx.exprList() == null) {
            // P n, A n
            if (funcInfo.getFormalParametersName() == null) {
                return new CallExpr(funcInfo, null, new Position(ctx.getStart().getLine()));
            }
            // P nn, A n,Fault
            else {
                System.err.println("line " + ctx.getStart().getLine() + ": Wrong function call, see function declaration at <" + funcInfo.getName() + ">");
                throw new SemanticError();
            }
        }
        // P n, A nn, fault
        if (funcInfo.getFormalParametersName() == null && ctx.exprList() != null) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong function call, see function declaration at <" + funcInfo.getName() + ">");
            throw new SemanticError();
        }
        // check P nn, A nn
        if (ctx.exprList().expr().size() != funcInfo.getFormalParametersName().size()) {
            System.err.println("line " + ctx.getStart().getLine() + ": Function call parameter mismatching, see function declaration at <" + funcInfo + ">");
            throw new SemanticError();
        }
        // compare AP and FP
        List<MangoParser.ExprContext> APc = ctx.exprList().expr();
        List<Type> APT = new LinkedList<>();
        List<ExprStmt> AP = new LinkedList<>();
        ListIterator<MangoParser.ExprContext> APcItr = APc.listIterator(0);
        ListIterator<ExprStmt> APItr = AP.listIterator(0);
        while (APcItr.hasNext()) {
            APItr.add((ExprStmt) visit(APcItr.next()));
            APT.add(APItr.previous().getType());
        }
        if (!funcInfo.isValidParameters(APT)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Function call parameter mismatching, see function declaration at <" + funcInfo.getName() + ">");
            throw new SemanticError();
        }

        return new CallExpr(funcInfo, AP, new Position(ctx.getStart().getLine()));
    }

//    @Override
//    public AST visitCreation(MangoParser.CreationContext ctx) {
//        return visitChildren(ctx);
//    }

    @Override
    public AST visitSelfOpPost(MangoParser.SelfOpPostContext ctx) {
        ExprStmt lv = (ExprStmt) visit(ctx.expr());
        if (!((lv instanceof LValue) && suit(SymbolTable.INT, lv.getType()))) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong operation on non-Lvalue <" +
                    ctx.expr().getText() + ">");
            throw new SemanticError();
        }
        Boolean op;
        if (ctx.op.getType() == MangoParser.PPLUS) op = true;
        else op = false;
        return new SelfOpPostExpr(op, lv, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitIDLeaf(MangoParser.IDLeafContext ctx) {
        VarSymbol varInfo;
        try {
            if (nowClass != null) {
                try {
                    varInfo = (VarSymbol) global.resolve(getName(nowClass + '.' + ctx.ID().getText()));
                } catch (Undefined notClassField) {
                    // try resolve it in the outer scope
                    Symbol test = global.resolve(getName(ctx.ID().getText()));
                    if (!(test instanceof VarSymbol)) throw new Undefined();
                    else varInfo = (VarSymbol) test;
                }
            } else {
                varInfo = (VarSymbol) global.resolve(getName(ctx.ID().getText()));
            }
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined variable <" +
                    ctx.ID().getText() + ">");
            throw new SemanticError();
        }
        return new VarExpr(varInfo, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitIndex(MangoParser.IndexContext ctx) {
        ExprStmt base = (ExprStmt) visit(ctx.expr(0));
        if (!(base.getType() instanceof ArrayType)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong indexing <" + ctx.getText() + ">");
            throw new SemanticError();
        }
        if (!(base instanceof LValue)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong operation on non-Lvalue <" + ctx.getText() + ">");
            throw new SemanticError();
        }
        ExprStmt index = (ExprStmt) visit(ctx.expr(1));
        if (!(suit(SymbolTable.INT, index.getType()))) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong indexing <" + ctx.getText() + ">");
            throw new SemanticError();
        }

//        System.out.println("detected index on ");
//        System.out.print(base.getType());
//        System.out.print(((IntExpr)index).getValue());

        return new IndexExpr(base, index, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitLogNot(MangoParser.LogNotContext ctx) {
        ExprStmt context = (ExprStmt) visit(ctx.expr());
        if (!suit(SymbolTable.BOOL, context.getType())) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong Logical-Not Expression <" + ctx.getText() + ">");
            throw new SemanticError();
        }
        return new LogNotExpr(context, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitConstantLeaf(MangoParser.ConstantLeafContext ctx) {
        return visit(ctx.constant());
    }


    @Override
    public AST visitConstant(MangoParser.ConstantContext ctx) {
        if (ctx.BOOL() != null) {
            return new BoolExpr(ctx.getText(), new Position(ctx.getStart().getLine()));
        } else if (ctx.STRING() != null) {
            String temp = ctx.getText();
            temp = temp.substring(1, temp.lastIndexOf('"'));
            return new StringExpr(temp, new Position(ctx.getStart().getLine()));
        } else if (ctx.INT() != null) {
            return new IntExpr(ctx.getText(), new Position(ctx.getStart().getLine()));
        } else if (ctx.NULL() != null) {
            return new NullExpr(new Position(ctx.getStart().getLine()));
        } else throw new Bug_TextError();
    }

    @Override
    public AST visitSelfOpPre(MangoParser.SelfOpPreContext ctx) {
        ExprStmt lv = (ExprStmt) visit(ctx.expr());
        if (!((lv instanceof LValue) && suit(SymbolTable.INT, lv.getType()))) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong operation on non-Lvalue <" + ctx.expr().getText() + ">");
            throw new SemanticError();
        }
        Boolean op;
        if (ctx.op.getType() == MangoParser.PPLUS) op = true;
        else op = false;
        return new SelfOpPreExpr(op, lv, new Position(ctx.getStart().getLine()));

    }

    @Override
    public AST visitLogBinary(MangoParser.LogBinaryContext ctx) {
        ExprStmt lhs = (ExprStmt) visit(ctx.expr(0));
        ExprStmt rhs = (ExprStmt) visit(ctx.expr(1));
        LogBinaryOp op = null;
        switch (ctx.op.getType()) {
            case MangoParser.LESS:
                op = LogBinaryOp.LESS;
                break;
            case MangoParser.LARGE:
                op = LogBinaryOp.LARGE;
                break;
            case MangoParser.LEQ:
                op = LogBinaryOp.LEQ;
                break;
            case MangoParser.GEQ:
                op = LogBinaryOp.GEQ;
                break;
            case MangoParser.EQ:
                op = LogBinaryOp.EQ;
                break;
            case MangoParser.NEQ:
                op = LogBinaryOp.NEQ;
                break;
            case MangoParser.LOG_AND:
                op = LogBinaryOp.LOG_AND;
                break;
            case MangoParser.LOG_OR:
                op = LogBinaryOp.LOG_OR;
                break;
        }
        switch (ctx.op.getType()) {
            case MangoParser.LARGE:
            case MangoParser.LEQ:
            case MangoParser.GEQ:
            case MangoParser.NEQ: {
                if (!(suit(SymbolTable.INT, lhs.getType()) &&
                        suit(SymbolTable.INT, rhs.getType()))) {
                    System.err.println("line " + ctx.getStart().getLine() + ": Logical operation on wrong operands <" + ctx.getText() + ">");
                    throw new SemanticError();
                }
            }
            break;
            case MangoParser.EQ:
                if (!(suit(SymbolTable.INT, lhs.getType()) &&
                        suit(SymbolTable.INT, rhs.getType())) &&
                        !(suit(SymbolTable.STRING, lhs.getType()) &&
                                suit(SymbolTable.STRING, rhs.getType())) &&
                        !((lhs.getType() instanceof ClassType) && rhs.getType() == null) &&
                        !(suit(SymbolTable.BOOL, lhs.getType()) &&
                                suit(SymbolTable.BOOL, rhs.getType()))) {

                    System.err.println("line " + ctx.getStart().getLine() + ": Logical operation on wrong operands <" + ctx.getText() + ">");
                    throw new SemanticError();
                }
                break;
            case MangoParser.LESS: {
                if (!(suit(SymbolTable.INT, lhs.getType()) &&
                        suit(SymbolTable.INT, rhs.getType())) &&
                        !(suit(SymbolTable.STRING, lhs.getType()) &&
                                suit(SymbolTable.STRING, rhs.getType()))) {
                    System.err.println("line " + ctx.getStart().getLine() + ": Logical operation on wrong operands <" + ctx.getText() + ">");
                    throw new SemanticError();
                }
            }
            break;
            case MangoParser.LOG_AND:
            case MangoParser.LOG_OR: {
                if (!(suit(SymbolTable.BOOL, lhs.getType()) &&
                        suit(SymbolTable.BOOL, rhs.getType()))) {
                    System.err.println("line " + ctx.getStart().getLine() + ": Logical operation on wrong operands " + ctx.getText() + ">");
                    throw new SemanticError();
                }
            }
        }
        return new LogBinaryExpr(lhs, op, rhs, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitBinary(MangoParser.BinaryContext ctx) {
        ExprStmt lhs = (ExprStmt) visit(ctx.expr(0));
        ExprStmt rhs = (ExprStmt) visit(ctx.expr(1));
        BinaryOp op = null;
        switch (ctx.op.getType()) {
            case MangoParser.MULT:
                op = BinaryOp.MULT;
                break;
            case MangoParser.DIV:
                op = BinaryOp.DIV;
                break;
            case MangoParser.MOD:
                op = BinaryOp.MOD;
                break;
            case MangoParser.PLUS:
                op = BinaryOp.PLUS;
                break;
            case MangoParser.MINUS:
                op = BinaryOp.MINUS;
                break;
            case MangoParser.SHIFT_L:
                op = BinaryOp.SHIFT_L;
                break;
            case MangoParser.SHIFT_R:
                op = BinaryOp.SHIFT_R;
                break;
            case MangoParser.BIT_AND:
                op = BinaryOp.BIT_AND;
                break;
            case MangoParser.BIT_XOR:
                op = BinaryOp.BIT_XOR;
                break;
            case MangoParser.BIT_OR:
                op = BinaryOp.BIT_OR;
                break;
        }
        switch (ctx.op.getType()) {
            case MangoParser.MULT:
            case MangoParser.DIV:
            case MangoParser.MOD:
            case MangoParser.MINUS:
            case MangoParser.SHIFT_L:
            case MangoParser.SHIFT_R:
            case MangoParser.BIT_AND:
            case MangoParser.BIT_XOR:
            case MangoParser.BIT_OR: {
                if (!(suit(SymbolTable.INT, lhs.getType()) &&
                        suit(SymbolTable.INT, rhs.getType()))) {
                    System.err.println("line " + ctx.getStart().getLine() + ": Operation on wrong operands <" + ctx.getText() + ">");
                    throw new SemanticError();
                }
            }
            break;
            case MangoParser.PLUS: {
                if (!(suit(SymbolTable.INT, lhs.getType()) &&
                        suit(SymbolTable.INT, rhs.getType())) &&
                        !(suit(SymbolTable.STRING, lhs.getType()) &&
                                suit(SymbolTable.STRING, rhs.getType()))) {
                    System.err.println("line " + ctx.getStart().getLine() + ": Operation on wrong operands <" + ctx.getText() + ">");
                    throw new SemanticError();
                }
            }
        }
        return new BinaryExpr(lhs, op, rhs, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitSign(MangoParser.SignContext ctx) {
        ExprStmt base = (ExprStmt) visit(ctx.expr());
        if (!base.getType().isSuitableAs(SymbolTable.INT)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong sign operation <" + ctx.expr().getText() + ">");
            throw new SemanticError();
        }
        Boolean op;
        if (ctx.op.getType() == MangoParser.PLUS) op = true;
        else op = false;
        return new SignExpr(op, base, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitAssign(MangoParser.AssignContext ctx) {
        ExprStmt lv = (ExprStmt) visit(ctx.expr(0));
        if (!(lv instanceof LValue)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong assignment operation on non-Lvalue <" + ctx.expr(0).getText() + ">");
            throw new SemanticError();
        }
        ExprStmt rhs = (ExprStmt) visit(ctx.expr(1));
        if (!suit(lv.getType(), rhs.getType())) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong type matching on assignment <" + ctx.getText() + ">");
            throw new SemanticError();
        }
        return new AssignExpr(lv, rhs, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitBitNot(MangoParser.BitNotContext ctx) {
        ExprStmt context = (ExprStmt) visit(ctx.expr());
        if (!context.getType().isSuitableAs(SymbolTable.INT)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Invalid operation operand <" + ctx.expr().getText() + ">");
            throw new SemanticError();
        }
        return visitChildren(ctx);
    }

    @Override
    public AST visitFieldAccess(MangoParser.FieldAccessContext ctx) {
        ExprStmt lhs = (ExprStmt) visit(ctx.expr());
        if (!(lhs.getType() instanceof ClassType)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong class field accessing");
            throw new SemanticError();
        }
        if (!(lhs instanceof LValue)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong operation on non-Lvalue <" + ctx.getText() + ">");
            throw new SemanticError();
        }
        Name field = getName(lhs.getType().toString() +
                '.' + ctx.ID().getText());
        VarSymbol varInfo;
        try {
            varInfo = (VarSymbol) global.resolve(field);
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined class field <" + ctx.getText() + ">");
            throw new SemanticError();
        }
        return new FieldAccessExpr(varInfo.getType(), lhs, field, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitClassFuncAccess(MangoParser.ClassFuncAccessContext ctx) {
        // It will also recognize builtin String and Array Function
        ExprStmt lhs = (ExprStmt) visit(ctx.expr());
        if (!((lhs.getType() instanceof ClassType) || (lhs.getType() == SymbolTable.STRING) || (lhs.getType() instanceof ArrayType))) {
            System.err.println("line " + ctx.getStart().getLine() + ": Wrong class function access");
            throw new SemanticError();
        }
        Name func;
        if (lhs.getType() instanceof ArrayType) {
            func = getName("~array." + ctx.ID().getText());
        } else func = getName(lhs.getType() + "." + ctx.ID().getText());
        FuncSymbol funcInfo = null;
        try {
            funcInfo = (FuncSymbol) global.resolve(func);
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined class function <" + func + ">");
        }
        return new ClassFuncAccessExpr(lhs, funcInfo, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitArrayCreate(MangoParser.ArrayCreateContext ctx) {
        ArrayType base;
        try {
            base = (ArrayType) parseType(ctx.getText().substring(3), global);
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined type to create new variable");
            throw new SemanticError();
        }
        ExprStmt index = (ExprStmt) visit(ctx.expr());
        if (!index.getType().isSuitableAs(SymbolTable.INT)) {
            System.err.println("line " + ctx.getStart().getLine() + ": Unexpected indexing <" + ctx.expr().getText() + ">");
            throw new SemanticError();
        }
        return new ArrayCreationExpr(base, index, new Position(ctx.getStart().getLine()));
    }

    @Override
    public AST visitAtomCreate(MangoParser.AtomCreateContext ctx) {
        Type base;
        try {
            base = global.lookUpType(ctx.atom().getText());
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined type to create new variable");
            throw new SemanticError();
        }
        return new AtomCreationExpr(base, new Position(ctx.getStart().getLine()));
    }

//    @Override
//    public AST visitExprList(MangoParser.ExprListContext ctx) {
//
//        return visitChildren(ctx);
//    }

    @Override
    public AST visitClassDecl(MangoParser.ClassDeclContext ctx) {
        nowClass = ctx.ID().getText();
        List<VarDecl> variables = null;
        List<FuncDecl> functions = null;

        List<MangoParser.MemberDeclContext> decls = ctx.classBlock().memberDecl();
        ListIterator<MangoParser.MemberDeclContext> declsItr = decls.listIterator();

        while (declsItr.hasNext()) {
            Decl temp = (Decl) visit(declsItr.next());
            if (temp instanceof VarDecl) {
                if (variables == null) variables = new LinkedList<>();
                variables.add((VarDecl) temp);
            } else if (temp instanceof FuncDecl) {
                if (functions == null) functions = new LinkedList<>();
                functions.add((FuncDecl) temp);
            } else throw new Bug_WrongReturn();
        }
        ClassDecl classDecl;
        try {
            classDecl = new ClassDecl(variables, functions,
                    (ClassType) global.lookUpType(nowClass), new Position(ctx.getStart().getLine()));
        } catch (Undefined err) {
            throw new Bug_TextError();
        }
        nowClass = null;
        return classDecl;
    }

//    @Override
//    public AST visitClassBlock(MangoParser.ClassBlockContext ctx) {
//        return visitChildren(ctx);
//    }


    // remember to return a VarDecl
    @Override
    public AST visitClassField(MangoParser.ClassFieldContext ctx) {
        VarSymbol classVar;
        try {
            classVar = (VarSymbol) global.resolve(getName(nowClass + '.' + ctx.ID().getText()));
        } catch (Undefined err) {
            throw new Bug_TextError();
        }
        return new VarDecl(classVar, null, new Position(ctx.getStart().getLine()));
    }


//    @Override
//    public AST visitClassFunction(MangoParser.ClassFunctionContext ctx) {
//        return visitChildren(ctx);
//    }

}