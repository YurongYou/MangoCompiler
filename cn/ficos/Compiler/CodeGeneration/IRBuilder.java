package cn.ficos.Compiler.CodeGeneration;

import cn.ficos.Compiler.AST.*;
import cn.ficos.Compiler.Gadgets.BinaryOp;
import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.LogBinaryOp;
import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;
import cn.ficos.Compiler.Gadgets.Type.BuiltInType;
import cn.ficos.Compiler.Gadgets.Type.ClassType;
import cn.ficos.Compiler.IR.*;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * This class can be used to build up an IR using the AST.
 * Created by Ficos on 16/4/20.
 */
public class IRBuilder {
    private AST root;
    private LinkedList<LinkedList<IRNode>> functions = new LinkedList<>();
    private LinkedList<FuncSymbol> funcInfo = new LinkedList<>();
    private LinkedList<IRNode> nowFunction = null;
    private LinkedList<IRNode> initialization = new LinkedList<IRNode>();
    private LinkedList<String> data = new LinkedList<>();
    private FuncDecl main = null;
    public IRBuilder(AST root) {
        this.root = root;
    }

    public LinkedList<LinkedList<IRNode>> getFunctions() {
        return functions;
    }

    public LinkedList<String> getData() {
        return data;
    }

    public LinkedList<IRNode> getInitialization() {
        return initialization;
    }

    public LinkedList<LinkedList<IRNode>> buildIR() {
        initialization.add(new Label("main", false));
        visit(root);
        if (main != null) {
            initialization.add(new Call(main.getFuncInfo(), null, null));
        }
        return functions;
    }

    public void print() {
        System.out.println("Initialization:");
        for (IRNode e : initialization) {
            System.out.println(e);
        }
        System.out.println();
        for (List<IRNode> list : functions) {
            for (IRNode e : list) {
                System.out.println(e);
            }
            System.out.println();
        }
    }

    void visit(AST node) {
        if (node instanceof Program) {
            visit((Program) node);
            return;
        }
        if (node instanceof VarDecl) {
            visit((VarDecl) node);
            return;
        }
        if (node instanceof VarDeclStmt) {
            visit((VarDeclStmt) node);
            return;
        }
        if (node instanceof ClassDecl) {
            visit((ClassDecl) node);
            return;
        }
        if (node instanceof FuncDecl) {
            visit((FuncDecl) node);
            return;
        }
        if (node instanceof VarExpr) {
            visit((VarExpr) node);
            return;
        }
        if (node instanceof FieldAccessExpr) {
            visit((FieldAccessExpr) node);
            return;
        }
        if (node instanceof IndexExpr) {
            visit((IndexExpr) node);
            return;
        }

        if (node instanceof CallExpr) {
            visit((CallExpr) node);
            return;
        }
        if (node instanceof AtomCreationExpr) {
            visit((AtomCreationExpr) node);
            return;
        }
        if (node instanceof ArrayCreationExpr) {
            visit((ArrayCreationExpr) node);
            return;
        }
        if (node instanceof SignExpr) {
            visit((SignExpr) node);
            return;
        }
        if (node instanceof IntExpr) {
            visit((IntExpr) node);
            return;
        }
        if (node instanceof BoolExpr) {
            visit((BoolExpr) node);
            return;
        }

        if (node instanceof BitNotExpr) {
            visit((BitNotExpr) node);
            return;
        }
        if (node instanceof LogNotExpr) {
            visit((LogNotExpr) node);
            return;
        }
        if (node instanceof StringExpr) {
            visit((StringExpr) node);
            return;
        }
        if (node instanceof LogBinaryExpr) {
            visit((LogBinaryExpr) node);
            return;
        }
        if (node instanceof LogRelationExpr) {
            visit((LogRelationExpr) node);
            return;
        }
        if (node instanceof BinaryExpr) {
            visit((BinaryExpr) node);
            return;
        }
        if (node instanceof AssignExpr) {
            visit((AssignExpr) node);
            return;
        }
        if (node instanceof SelfOpPostExpr) {
            visit((SelfOpPostExpr) node);
            return;
        }
        if (node instanceof SelfOpPreExpr) {
            visit((SelfOpPreExpr) node);
            return;
        }
        if (node instanceof ReturnStmt) {
            visit((ReturnStmt) node);
            return;
        }
        if (node instanceof ContinueStmt) {
            visit((ContinueStmt) node);
            return;
        }
        if (node instanceof SelectionStmt) {
            visit((SelectionStmt) node);
            return;
        }
        if (node instanceof ForStmt) {
            visit((ForStmt) node);
            return;
        }
        if (node instanceof WhileStmt) {
            visit((WhileStmt) node);
            return;
        }
        if (node instanceof CompoundStmt) {
            visit((CompoundStmt) node);
            return;
        }
        if (node instanceof BreakStmt) {
            visit((BreakStmt) node);
        }
        if (node instanceof NullExpr) {
            visit((NullExpr) node);
        }
    }

    void visit(Program ast) {
        ListIterator<Decl> itr = ast.getDecls().listIterator();
        while (itr.hasNext()) {
            visit(itr.next());
        }
    }

    void visit(VarDecl ast) {
        data.add(ast.getVar().getGlobalLabel() + ": " + ".word 0");
        if (ast.getCreation() != null) {
//            LinkedList<IRNode> temp = nowFunction;
            nowFunction = initialization;
            visit(ast.getCreation());
            if (ast.getCreation().getOperand() instanceof Constant) {
                LocalRegister temp = new LocalRegister();
                nowFunction.add(new LoadImm(temp, ((Constant) ast.getCreation().getOperand()).getValue()));
                nowFunction.add(new StoreLabel(ast.getVar().getGlobalLabel(), temp, CONSTANT.wordSize));
            } else
                nowFunction.add(new StoreLabel(ast.getVar().getGlobalLabel(), (Register) ast.getCreation().getOperand(), CONSTANT.wordSize));
            nowFunction = null;
        }
    }

    //    If the creation expression is null then there is no need to represent this expression in the IR
    void visit(VarDeclStmt ast) {
        if (ast.getCreation() != null) {
            // if it's a declaration of built-in type, just move the creation result to the register
            if (ast.getVarInfo().getType() instanceof BuiltInType) {
                visit(ast.getCreation());
                if (ast.getCreation().getOperand() instanceof Constant) {
                    nowFunction.add(new LoadImm((LocalRegister) (ast.getVarInfo().getReg()), ((Constant) ast.getCreation().getOperand()).getValue()));
                } else {
                    nowFunction.add(new Move(ast.getVarInfo().getReg(), (Register) ast.getCreation().getOperand()));
                }
            }
            // if it's a declaration of array type or class type, the creation part can only
            // be "new" expression, just call the new function
            else {
                // Change the result of the creation to the target variable register
                ast.getCreation().changeOperand(ast.getVarInfo().getReg());
                visit(ast.getCreation());
            }
        }
    }

    void visit(ClassDecl ast) {
        if (ast.getFunctions() != null) {
            for (FuncDecl e : ast.getFunctions()) {
                visit(e);
            }
        }
    }

    public LinkedList<FuncSymbol> getFuncInfo() {
        return funcInfo;
    }

    void visit(FuncDecl ast) {
        functions.add(new LinkedList<>());
        funcInfo.add(ast.getFuncInfo());
        if (ast.getFuncInfo().getName().equals(Name.getName("main"))) {
            main = ast;
        }
        nowFunction = functions.getLast();
        nowFunction.add(ast.getFuncInfo().getFuncLabel());
        for (Stmt s : ast.getStmts()) {
            visit(s);
        }
    }

    void visit(CallExpr ast) {
        LinkedList<Operand> aps = null;
        if (ast.getActualParameter() != null) {
            aps = new LinkedList<>();
            for (ExprStmt e : ast.getActualParameter()) {
                visit(e);
                aps.add(e.getOperand());
            }
        }
        nowFunction.add(new Call(ast.getFuncInfo(), aps, (Register) ast.getOperand()));
    }

    void visit(AtomCreationExpr ast) {
        nowFunction.add(new New((Register) ast.getOperand(),
                new Constant(((ClassType) ast.getType()).totalSize())));
    }

    void visit(ArrayCreationExpr ast) {
        visit(ast.getDim());
        Operand size;
        if (ast.getDim() instanceof IntExpr) {
            size = new Constant(((IntExpr) ast.getDim()).getValue() * ((ArrayType) ast.getType()).getBaseType().sizeOf());
        } else {
            size = new LocalRegister();
            nowFunction.add(new Binary((Register) size, (Register) ast.getDim().getOperand(),
                    new Constant(((ArrayType) ast.getType()).getBaseType().sizeOf()), IRBinaryOp.mult));
        }
        nowFunction.add(new New((Register) ast.getOperand(), size));
    }

    void visit(SignExpr ast) {
        if (ast.getOp()) {
            ast.changeOperand(ast.getBase().getOperand());
        } else {
            if (ast.getBase() instanceof IntExpr) {
                ast.changeOperand(new Constant(-1 * ((IntExpr) ast.getBase()).getValue()));
            } else {
                visit(ast.getBase());
                nowFunction.add(new Neg((Register) ast.getOperand(), (Register) ast.getBase().getOperand()));
            }
        }
    }

    void visit(IntExpr ast) {
        // left empty intendedly
    }

    void visit(BoolExpr ast) {
        // left empty intendedly
    }

    void visit(NullExpr ast) {
        // left empty intendedly
    }

    void visit(VarExpr ast) {
        // left empty intendedly
        if (ast.getVar().isGlobal()) {
            nowFunction.add(new LoadLabel(ast.getVar().getGlobalLabel(), (Register) ast.getOperand(), CONSTANT.wordSize));
        }
    }

    void visit(StringExpr ast) {
        // left empty intendedly
        nowFunction.add(new LoadAddress((Register) ast.getOperand(), ast.getLabel()));
        data.add(ast.getLabel() + ": " + ".asciiz \"" + ast.getText() + "\"");
    }

    void visit(BitNotExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Not((Register) ast.getOperand(), (Register) ast.getBase().getOperand()));
    }

    void visit(LogNotExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Binary((Register) ast.getOperand(), (Register) ast.getBase().getOperand(), new Constant(1), IRBinaryOp.xor));
    }

    void visit(LogBinaryExpr ast) {
        visit(ast.getLhs());
        visit(ast.getRhs());
        LogBinaryOp ori = ast.getOp();
        IRBinaryOp op;
        if (ori == LogBinaryOp.LESS) op = IRBinaryOp.slt;
        else if (ori == LogBinaryOp.LARGE) op = IRBinaryOp.sgt;
        else if (ori == LogBinaryOp.LEQ) op = IRBinaryOp.sle;
        else if (ori == LogBinaryOp.GEQ) op = IRBinaryOp.sge;
        else if (ori == LogBinaryOp.EQ) op = IRBinaryOp.seq;
        else op = IRBinaryOp.sne;
        if (ast.getLhs().getOperand() instanceof Constant) {
            LocalRegister temp = new LocalRegister();
            nowFunction.add(new LoadImm(temp, ((Constant) ast.getLhs().getOperand()).getValue()));
            nowFunction.add(new Binary((Register) ast.getOperand(),
                    temp,
                    ast.getRhs().getOperand(),
                    op));
        }
        nowFunction.add(new Binary((Register) ast.getOperand(),
                (Register) ast.getLhs().getOperand(),
                ast.getRhs().getOperand(),
                op));
    }

    void visit(BinaryExpr ast) {
        visit(ast.getLhs());
        visit(ast.getRhs());
        IRBinaryOp op;
        BinaryOp ori = ast.getOp();
        if (ori == BinaryOp.MULT) op = IRBinaryOp.mult;
        else if (ori == BinaryOp.DIV) op = IRBinaryOp.div;
        else if (ori == BinaryOp.MOD) op = IRBinaryOp.rem;
        else if (ori == BinaryOp.PLUS) op = IRBinaryOp.add;
        else if (ori == BinaryOp.MINUS) op = IRBinaryOp.sub;
        else if (ori == BinaryOp.SHIFT_L) op = IRBinaryOp.sll;
        else if (ori == BinaryOp.SHIFT_R) op = IRBinaryOp.sra;
        else if (ori == BinaryOp.BIT_AND) op = IRBinaryOp.and;
        else if (ori == BinaryOp.BIT_XOR) op = IRBinaryOp.xor;
        else op = IRBinaryOp.or;
        if (ast.getLhs().getOperand() instanceof Constant) {
            LocalRegister temp = new LocalRegister();
            nowFunction.add(new LoadImm(temp, ((Constant) ast.getLhs().getOperand()).getValue()));
            nowFunction.add(new Binary((Register) ast.getOperand(),
                    temp,
                    ast.getRhs().getOperand(),
                    op));
        }
        nowFunction.add(new Binary((Register) ast.getOperand(),
                (Register) ast.getLhs().getOperand(),
                ast.getRhs().getOperand(),
                op));
    }

    void visit(FieldAccessExpr ast) {
        visit(ast.getLhs());
        nowFunction.add(new Load(ast.getType().sizeOf(), (Register) ast.getOperand(), (Register) ast.getLhs().getOperand(), ast.getShift()));
    }

    void visit(IndexExpr ast) {
        visit(ast.getBase());
        if (!(ast.getIndex() instanceof IntExpr)) {
            visit(ast.getIndex());
            LocalRegister shift = new LocalRegister();
            LocalRegister address = new LocalRegister();
            nowFunction.add(new Binary(shift, (Register) ast.getIndex().getOperand(),
                    new Constant(ast.getType().sizeOf()), IRBinaryOp.mult));
            nowFunction.add(new Binary(address, (Register) ast.getBase().getOperand(),
                    shift, IRBinaryOp.add));
            nowFunction.add(new Load(ast.getType().sizeOf(), (Register) ast.getOperand(),
                    address, 0));
        } else {
            nowFunction.add(new Load(ast.getType().sizeOf(), (Register) ast.getOperand(),
                    (Register) ast.getBase().getOperand(),
                    ((IntExpr) ast.getIndex()).getValue() * ast.getType().sizeOf()));
        }
    }

    void getStoreIR(AddressFetch ast, Operand source) {
        if (ast instanceof IndexExpr) {
            visit(((IndexExpr) ast).getBase());
            if (!(((IndexExpr) ast).getIndex() instanceof IntExpr)) {
                visit(((IndexExpr) ast).getIndex());
                LocalRegister shift = new LocalRegister();
                LocalRegister address = new LocalRegister();
                nowFunction.add(new Binary(shift, (Register) ((IndexExpr) ast).getIndex().getOperand(),
                        new Constant(((IndexExpr) ast).getType().sizeOf()), IRBinaryOp.mult));
                nowFunction.add(new Binary(address, (Register) ((IndexExpr) ast).getBase().getOperand(),
                        shift, IRBinaryOp.add));
                if (source instanceof Constant) {
                    LocalRegister temp = new LocalRegister();
                    nowFunction.add(new LoadImm(temp, ((Constant) source).getValue()));
                    nowFunction.add(new Store(((IndexExpr) ast).getType().sizeOf(), temp,
                            address, 0));
                } else nowFunction.add(new Store(((IndexExpr) ast).getType().sizeOf(), (Register) source,
                        address, 0));
            } else {
                if (source instanceof Constant) {
                    LocalRegister temp = new LocalRegister();
                    nowFunction.add(new LoadImm(temp, ((Constant) source).getValue()));
                    nowFunction.add(new Store(((IndexExpr) ast).getType().sizeOf(), temp,
                            (Register) ((IndexExpr) ast).getBase().getOperand(),
                            ((IntExpr) ((IndexExpr) ast).getIndex()).getValue() * ((IndexExpr) ast).getType().sizeOf()));
                } else nowFunction.add(new Store(((IndexExpr) ast).getType().sizeOf(), (Register) source,
                        (Register) ((IndexExpr) ast).getBase().getOperand(),
                        ((IntExpr) ((IndexExpr) ast).getIndex()).getValue() * ((IndexExpr) ast).getType().sizeOf()));
            }
            if (source instanceof Constant) {
                nowFunction.add(new LoadImm((LocalRegister) ((IndexExpr) ast).getOperand(), ((Constant) source).getValue()));
            } else nowFunction.add(new Move((Register) ((IndexExpr) ast).getOperand(), (Register) source));
        } else {
            visit(((FieldAccessExpr) ast).getLhs());
            if (source instanceof Constant) {
                LocalRegister temp = new LocalRegister();
                nowFunction.add(new LoadImm(temp, ((Constant) source).getValue()));
                nowFunction.add(new Store(((FieldAccessExpr) ast).getType().sizeOf(), temp,
                        (Register) ((FieldAccessExpr) ast).getLhs().getOperand(),
                        ((FieldAccessExpr) ast).getShift()));
                nowFunction.add(new LoadImm((LocalRegister) ((FieldAccessExpr) ast).getOperand(), ((Constant) source).getValue()));
            } else {
                nowFunction.add(new Store(((FieldAccessExpr) ast).getType().sizeOf(), (Register) source,
                        (Register) ((FieldAccessExpr) ast).getLhs().getOperand(),
                        ((FieldAccessExpr) ast).getShift()));
                nowFunction.add(new Move((Register) ((FieldAccessExpr) ast).getOperand(), (Register) source));
            }
        }
    }

    void visit(AssignExpr ast) {
        visit(ast.getRhs());
        if (ast.getLhs() instanceof AddressFetch) {
//            visitAddress((AddressFetch) ast.getLhs());
//            new Store(((AddressFetch) ast.getLhs()).getAddressOperand(), ast.getRhs().getOperand())
            getStoreIR((AddressFetch) ast.getLhs(), ast.getRhs().getOperand());
        } else if (ast.getLhs() instanceof VarExpr && ((VarExpr) ast.getLhs()).getVar().isGlobal()) {
            if (ast.getRhs().getOperand() instanceof Constant) {
                LocalRegister temp = new LocalRegister();
                nowFunction.add(new LoadImm(temp, ((Constant) ast.getRhs().getOperand()).getValue()));
                nowFunction.add(new StoreLabel(((VarExpr) ast.getLhs()).getVar().getGlobalLabel(),
                        temp, CONSTANT.wordSize));
            } else
                nowFunction.add(new StoreLabel(((VarExpr) ast.getLhs()).getVar().getGlobalLabel(), (Register) ast.getRhs().getOperand(), CONSTANT.wordSize));
        } else {
            if (ast.getRhs().getOperand() instanceof Constant) {
                nowFunction.add(new LoadImm((LocalRegister) ast.getLhs().getOperand(), ((Constant) ast.getRhs().getOperand()).getValue()));
            } else
                nowFunction.add(new Move((Register) ast.getLhs().getOperand(), (Register) ast.getRhs().getOperand()));
        }
//        !!! Note that the result operand of the AssignExpr is the lhs's operand
        ast.changeOperand(ast.getLhs().getOperand());
    }

    void visit(SelfOpPostExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Move((Register) ast.getOperand(), (Register) ast.getBase().getOperand()));
        if (ast.getOp()) nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                (Register) ast.getBase().getOperand(),
                new Constant(1), IRBinaryOp.add));
        else nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                (Register) ast.getBase().getOperand(),
                new Constant(1), IRBinaryOp.sub));
    }

    void visit(SelfOpPreExpr ast) {
        visit(ast.getBase());
        if (ast.getOp())
            nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                    (Register) ast.getBase().getOperand(),
                    new Constant(1), IRBinaryOp.add));
        else nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                (Register) ast.getBase().getOperand(),
                new Constant(1), IRBinaryOp.sub));
        ast.changeOperand(ast.getBase().getOperand());
//        nowFunction.add(new Move((Register) ast.getOperand(), ast.getBase().getOperand()));
    }

    void visit(ReturnStmt ast) {
        nowFunction.add(new Return(ast.getReturnExpr().getOperand()));
    }


    void visit(LogRelationExpr ast) {
        visit(ast.getLhs());
        visit(ast.getRhs());
        if (ast.isAnd()) {
            if (ast.getLhs().getOperand() instanceof Constant) {
                nowFunction.add(new Binary((Register) ast.getOperand(),
                        (Register) ast.getRhs().getOperand(), ast.getLhs().getOperand(),
                        IRBinaryOp.and));
            } else nowFunction.add(new Binary((Register) ast.getOperand(),
                    (Register) ast.getLhs().getOperand(), ast.getRhs().getOperand(),
                    IRBinaryOp.and));
        } else {
            if (ast.getLhs().getOperand() instanceof Constant) {
                nowFunction.add(new Binary((Register) ast.getOperand(),
                        (Register) ast.getRhs().getOperand(), ast.getLhs().getOperand(),
                        IRBinaryOp.or));
            } else nowFunction.add(new Binary((Register) ast.getOperand(),
                    (Register) ast.getLhs().getOperand(), ast.getRhs().getOperand(),
                    IRBinaryOp.or));
        }
    }

    void buildCondition(Label T, Label F, ExprStmt condition) {
        if (condition instanceof LogRelationExpr) {
            Label temp = new Label("temp", true);
            if (((LogRelationExpr) condition).isAnd()) {
                buildCondition(temp, F, ((LogRelationExpr) condition).getLhs());
                nowFunction.add(temp);
                buildCondition(T, F, ((LogRelationExpr) condition).getRhs());
            } else {
                buildCondition(T, temp, ((LogRelationExpr) condition).getLhs());
                nowFunction.add(temp);
                buildCondition(T, F, ((LogRelationExpr) condition).getRhs());
            }
        } else if (condition instanceof LogNotExpr) {
            visit(((LogNotExpr) condition).getBase());
            buildCondition(F, T, ((LogNotExpr) condition).getBase());
        } else if (condition instanceof LogBinaryExpr) {
            visit(condition);
            nowFunction.add(new Branch(condition.getOperand(), T, F));
        }
//        else {
//            visit(condition);
//            nowFunction.add(new Branch(condition.getOperand(), T, F));
//        }
    }

    void visit(SelectionStmt ast) {
        Label LT = new Label("if_true", true);
        Label LF = new Label("if_false", true);
        buildCondition(LT, LF, ast.getCondition());
        nowFunction.add(LT);
        visit(ast.getThenStmt());
        nowFunction.add(LF);
        if (ast.getSubSelectionConditions() != null) {
            ListIterator<ExprStmt> condI = ast.getSubSelectionConditions().listIterator(0);
            ListIterator<Stmt> stmtI = ast.getSubSelectionThenStmts().listIterator(0);
            while (condI.hasNext()) {
                LT = new Label("elseif_true", true);
                LF = new Label("elseif_false", true);
                buildCondition(LT, LF, condI.next());
                nowFunction.add(LT);
                visit(stmtI.next());
                nowFunction.add(LF);
            }
        }
        if (ast.getElseStmt() != null) {
            visit(ast.getElseStmt());
            nowFunction.add(new Label("exitElse", true));
        }
    }

    void visit(ForStmt ast) {
        if (ast.getInit() != null) visit(ast.getInit());
        Label begin = new Label("For_Begin", true);
        if (ast.getCondition() != null) buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(begin);
        visit(ast.getLoop());
        nowFunction.add(ast.getBegin());
        if (ast.getAfter() != null) visit(ast.getAfter());
        if (ast.getCondition() != null) buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(ast.getEnd());
    }

    void visit(WhileStmt ast) {
        Label begin = new Label("While_Begin", true);
        buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(begin);
        visit(ast.getLoop());
        nowFunction.add(ast.getBegin());
        buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(ast.getEnd());
    }

    void visit(CompoundStmt ast) {
        if (ast.getStmts() != null) {
            for (Stmt s : ast.getStmts()) {
                visit(s);
            }
        }
    }

    void visit(BreakStmt ast) {
        nowFunction.add(new Jump(ast.getBreakTo().getEnd()));
    }

    void visit(ContinueStmt ast) {
        nowFunction.add(new Jump(ast.getContinueTo().getBegin()));
    }
}
