package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.AST.*;
import cn.ficos.Compiler.Gadgets.BinaryOp;
import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.LogBinaryOp;
import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;
import cn.ficos.Compiler.Gadgets.Type.BuiltInType;
import cn.ficos.Compiler.Gadgets.Type.ClassType;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * This class can be used to build up an IR using the AST.
 * Created by Ficos on 16/4/20.
 */
public class IRBuilder {
    AST root;
    LinkedList<LinkedList<IRNode>> functions = new LinkedList<>();
    LinkedList<IRNode> nowFunction = null;
    //    true means needing to read, false means needing to write
    private boolean RW = true;

    public IRBuilder(AST root) {
        this.root = root;
    }

    public LinkedList<LinkedList<IRNode>> buildIR() {
        visit(root);
        return functions;
    }

    public void print() {
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

    }

    //    If the creation expression is null then there is no need to represent this expression in the IR
    void visit(VarDeclStmt ast) {
        if (ast.getCreation() != null) {
            // if it's a declaration of built-in type, just move the creation result to the register
            if (ast.getVarInfo().getType() instanceof BuiltInType) {
                visit(ast.getCreation());
                nowFunction.add(new Move(ast.getVarInfo().getReg(), ast.getCreation().getOperand()));
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

    void visit(FuncDecl ast) {
        functions.add(new LinkedList<>());
        nowFunction = functions.getLast();
        nowFunction.add(ast.getFuncInfo().getFuncLabel());
        for (Stmt s : ast.getStmts()) {
            visit(s);
        }
    }

    void visit(CallExpr ast) {
//        System.err.println("meet call!!!!!!");
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
            nowFunction.add(new Binary((Register) size, ast.getDim().getOperand(),
                    new Constant(((ArrayType) ast.getType()).getBaseType().sizeOf()), IRBinaryOp.MUL));
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
                nowFunction.add(new Neg((Register) ast.getOperand(), ast.getBase().getOperand()));
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
    }

    void visit(StringExpr ast) {
        // left empty intendedly
        LocalRegister temp = new LocalRegister();
        nowFunction.add(new LoadLabel(temp, ast.getLabel()));
        nowFunction.add(new Load(CONSTANT.wordSize, (Register) ast.getOperand(), temp, 0));
    }

    void visit(BitNotExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Not((Register) ast.getOperand(), ast.getBase().getOperand()));
    }

    void visit(LogNotExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Binary((Register) ast.getOperand(), ast.getBase().getOperand(), new Constant(1), IRBinaryOp.BXOR));
    }

    void visit(LogBinaryExpr ast) {
        visit(ast.getLhs());
        visit(ast.getRhs());
        LogBinaryOp ori = ast.getOp();
        IRBinaryOp op;
        if (ori == LogBinaryOp.LESS) op = IRBinaryOp.LESS;
        else if (ori == LogBinaryOp.LARGE) op = IRBinaryOp.LARGE;
        else if (ori == LogBinaryOp.LEQ) op = IRBinaryOp.LEQ;
        else if (ori == LogBinaryOp.GEQ) op = IRBinaryOp.GEQ;
        else if (ori == LogBinaryOp.EQ) op = IRBinaryOp.EQ;
        else op = IRBinaryOp.NEQ;
        nowFunction.add(new Binary((Register) ast.getOperand(),
                ast.getLhs().getOperand(),
                ast.getRhs().getOperand(),
                op));
    }

    void visit(BinaryExpr ast) {
        visit(ast.getLhs());
        visit(ast.getRhs());
        IRBinaryOp op;
        BinaryOp ori = ast.getOp();
        if (ori == BinaryOp.MULT) op = IRBinaryOp.MUL;
        else if (ori == BinaryOp.DIV) op = IRBinaryOp.DIV;
        else if (ori == BinaryOp.MOD) op = IRBinaryOp.REM;
        else if (ori == BinaryOp.PLUS) op = IRBinaryOp.ADD;
        else if (ori == BinaryOp.MINUS) op = IRBinaryOp.SUB;
        else if (ori == BinaryOp.SHIFT_L) op = IRBinaryOp.SLL;
        else if (ori == BinaryOp.SHIFT_R) op = IRBinaryOp.SRL;
        else if (ori == BinaryOp.BIT_AND) op = IRBinaryOp.BAND;
        else if (ori == BinaryOp.BIT_XOR) op = IRBinaryOp.BXOR;
        else op = IRBinaryOp.BOR;

        nowFunction.add(new Binary((Register) ast.getOperand(),
                ast.getLhs().getOperand(),
                ast.getRhs().getOperand(),
                op));
    }

    void visit(FieldAccessExpr ast) {
        visit(ast.getLhs());
        nowFunction.add(new Load(ast.getType().sizeOf(), (Register) ast.getOperand(), ast.getLhs().getOperand(), ast.getShift()));
    }

    void visit(IndexExpr ast) {
        visit(ast.getBase());
        if (!(ast.getIndex() instanceof IntExpr)) {
            visit(ast.getIndex());
            LocalRegister shift = new LocalRegister();
            LocalRegister address = new LocalRegister();
            nowFunction.add(new Binary(shift, ast.getIndex().getOperand(),
                    new Constant(ast.getType().sizeOf()), IRBinaryOp.MUL));
            nowFunction.add(new Binary(address, ast.getBase().getOperand(),
                    shift, IRBinaryOp.ADD));
            nowFunction.add(new Load(ast.getType().sizeOf(), (Register) ast.getOperand(),
                    address, 0));
        } else {
            nowFunction.add(new Load(ast.getType().sizeOf(), (Register) ast.getOperand(),
                    ast.getBase().getOperand(),
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
                nowFunction.add(new Binary(shift, ((IndexExpr) ast).getIndex().getOperand(),
                        new Constant(((IndexExpr) ast).getType().sizeOf()), IRBinaryOp.MUL));
                nowFunction.add(new Binary(address, ((IndexExpr) ast).getBase().getOperand(),
                        shift, IRBinaryOp.ADD));
                nowFunction.add(new Store(((IndexExpr) ast).getType().sizeOf(), source,
                        address, 0));
            } else {
                nowFunction.add(new Store(((IndexExpr) ast).getType().sizeOf(), source,
                        (Register) ((IndexExpr) ast).getBase().getOperand(),
                        ((IntExpr) ((IndexExpr) ast).getIndex()).getValue() * ((IndexExpr) ast).getType().sizeOf()));
            }
            nowFunction.add(new Move((Register) ((IndexExpr) ast).getOperand(), source));
        } else {
            visit(((FieldAccessExpr) ast).getLhs());
            nowFunction.add(new Store(((FieldAccessExpr) ast).getType().sizeOf(), source,
                    (Register) ((FieldAccessExpr) ast).getLhs().getOperand(),
                    ((FieldAccessExpr) ast).getShift()));
            nowFunction.add(new Move((Register) ((FieldAccessExpr) ast).getOperand(), source));
        }
    }

    void visit(AssignExpr ast) {
        visit(ast.getRhs());
        if (ast.getLhs() instanceof AddressFetch) {
//            visitAddress((AddressFetch) ast.getLhs());
//            new Store(((AddressFetch) ast.getLhs()).getAddressOperand(), ast.getRhs().getOperand())
            getStoreIR((AddressFetch) ast.getLhs(), ast.getRhs().getOperand());
        } else {
            nowFunction.add(new Move((Register) ast.getLhs().getOperand(), ast.getRhs().getOperand()));
        }
//        !!! Note that the result operand of the AssignExpr is the lhs's operand
        ast.changeOperand(ast.getLhs().getOperand());
    }

    void visit(SelfOpPostExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Move((Register) ast.getOperand(), ast.getBase().getOperand()));
        if (ast.getOp()) nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                ast.getBase().getOperand(),
                new Constant(1), IRBinaryOp.ADD));
        else nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                ast.getBase().getOperand(),
                new Constant(1), IRBinaryOp.SUB));
    }

    void visit(SelfOpPreExpr ast) {
        visit(ast.getBase());
        if (ast.getOp())
            nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                ast.getBase().getOperand(),
                    new Constant(1), IRBinaryOp.ADD));
        else nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                ast.getBase().getOperand(),
                new Constant(1), IRBinaryOp.SUB));
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
            nowFunction.add(new Binary((Register) ast.getOperand(),
                    ast.getLhs().getOperand(), ast.getRhs().getOperand(),
                    IRBinaryOp.BAND));
        } else {
            nowFunction.add(new Binary((Register) ast.getOperand(),
                    ast.getLhs().getOperand(), ast.getRhs().getOperand(),
                    IRBinaryOp.BOR));
        }
    }

    void buildCondition(Label T, Label F, ExprStmt condition) {
        if (condition instanceof LogRelationExpr) {
            Label temp = new Label("temp");
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
        Label LT = new Label("if_true");
        Label LF = new Label("if_false");
        buildCondition(LT, LF, ast.getCondition());
        nowFunction.add(LT);
        visit(ast.getThenStmt());
        nowFunction.add(LF);
        if (ast.getSubSelectionConditions() != null) {
            ListIterator<ExprStmt> condI = ast.getSubSelectionConditions().listIterator(0);
            ListIterator<Stmt> stmtI = ast.getSubSelectionThenStmts().listIterator(0);
            while (condI.hasNext()) {
                LT = new Label("elseif_true");
                LF = new Label("elseif_false");
                buildCondition(LT, LF, condI.next());
                nowFunction.add(LT);
                visit(stmtI.next());
                nowFunction.add(LF);
            }
        }
        if (ast.getElseStmt() != null) {
            visit(ast.getElseStmt());
            nowFunction.add(new Label("exitElse"));
        }
    }

    void visit(ForStmt ast) {
        if (ast.getInit() != null) visit(ast.getInit());
        Label begin = new Label("For_Begin");
        if (ast.getCondition() != null) buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(begin);
        visit(ast.getLoop());
        nowFunction.add(ast.getBegin());
        if (ast.getAfter() != null) visit(ast.getAfter());
        if (ast.getCondition() != null) buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(ast.getEnd());
    }

    void visit(WhileStmt ast) {
        Label begin = new Label("While_Begin");
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
