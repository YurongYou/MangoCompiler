package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.AST.*;
import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
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
        if (node instanceof ClassFuncAccessExpr) {
            visit((ClassFuncAccessExpr) node);
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
        if (node instanceof FieldAccessExpr) {
            visit((FieldAccessExpr) node);
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

    void visit(VarDeclStmt ast) {
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
        functions.getLast().add(new Label("Function:" + ast.getFuncInfo().getName()));
        for (Stmt s : ast.getStmts()) {
            visit(s);
        }
    }

    void visit(VarExpr ast) {
    }

    void visit(IndexExpr ast) {
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
        functions.getLast().add(new Call(ast.getFuncInfo(), aps, (Register) ast.getOperand()));
    }

    void visit(AtomCreationExpr ast) {
        functions.getLast().add(new New((Register) ast.getOperand(),
                new Constant(((ClassType) ast.getType()).totalSize())));
    }

    void visit(ArrayCreationExpr ast) {
        visit(ast.getDim());
        functions.getLast().add(new New((Register) ast.getOperand(), ast.getDim().getOperand()));
    }
}
