package cn.ficos.Compiler.ASTVisitor;

import cn.ficos.Compiler.AST.*;

import java.util.ListIterator;

/**
 * Created by Ficos on 16/5/3.
 */
public class ASTRefiner {
    AST root;
    boolean isRead = true;

    public ASTRefiner(AST _root) {
        root = _root;
    }

    public void refine() {
        visit(root);
    }

    private void visit(AST node) {
        if (node instanceof Program) {
            visit((Program) node);
        } else if (node instanceof VarDecl) {
            visit((VarDecl) node);
        } else if (node instanceof VarDeclStmt) {
            visit((VarDeclStmt) node);
        } else if (node instanceof ClassDecl) {
            visit((ClassDecl) node);
        } else if (node instanceof FuncDecl) {
            visit((FuncDecl) node);

        } else if (node instanceof VarExpr) {
            visit((VarExpr) node);
        } else if (node instanceof IndexExpr) {
            visit((IndexExpr) node);
        } else if (node instanceof CallExpr) {
            visit((CallExpr) node);
        } else if (node instanceof AtomCreationExpr) {
            visit((AtomCreationExpr) node);
        } else if (node instanceof ArrayCreationExpr) {
            visit((ArrayCreationExpr) node);
        } else if (node instanceof SignExpr) {
            visit((SignExpr) node);
        } else if (node instanceof IntExpr) {
            visit((IntExpr) node);
        } else if (node instanceof BoolExpr) {
            visit((BoolExpr) node);
        } else if (node instanceof BitNotExpr) {
            visit((BitNotExpr) node);
        } else if (node instanceof LogNotExpr) {
            visit((LogNotExpr) node);
        } else if (node instanceof LogBinaryExpr) {
            visit((LogBinaryExpr) node);
        } else if (node instanceof StringExpr) {
            visit((StringExpr) node);
        } else if (node instanceof LogRelationExpr) {
            visit((LogRelationExpr) node);
        } else if (node instanceof CalcBinaryExpr) {
            visit((CalcBinaryExpr) node);
        } else if (node instanceof AssignExpr) {
            visit((AssignExpr) node);
        } else if (node instanceof SelfOpPostExpr) {
            visit((SelfOpPostExpr) node);
        } else if (node instanceof SelfOpPreExpr) {
            visit((SelfOpPreExpr) node);
        } else if (node instanceof ReturnStmt) {
            visit((ReturnStmt) node);
        } else if (node instanceof ContinueStmt) {
            visit((ContinueStmt) node);
        } else if (node instanceof SelectionStmt) {
            visit((SelectionStmt) node);
        } else if (node instanceof ForStmt) {
            visit((ForStmt) node);
        } else if (node instanceof WhileStmt) {
            visit((WhileStmt) node);
        } else if (node instanceof CompoundStmt) {
            visit((CompoundStmt) node);
        } else if (node instanceof FieldAccessExpr) {
            visit((FieldAccessExpr) node);
        } else if (node instanceof BreakStmt) {
            visit((BreakStmt) node);
        } else if (node instanceof NullExpr) {
            visit((NullExpr) node);
        }
    }

    private void visit(ArrayCreationExpr node) {
        visit(node.getDim());
    }

    private void visit(AssignExpr node) {
        visit(node.getRhs());
        isRead = false;
        visit(node.getLhs());
        isRead = true;
    }

    private void visit(AtomCreationExpr node) {
    }

    private void visit(BitNotExpr node) {
        visit(node.getBase());
    }

    private void visit(BoolExpr node) {
    }

    private void visit(BreakStmt node) {
    }

    private void visit(CalcBinaryExpr node) {
        visit(node.getRhs());
        visit(node.getLhs());
    }

    private void visit(CallExpr node) {
        if (node.getActualParameter() != null) {
            for (AST e : node.getActualParameter()) visit(e);
        }
    }

    private void visit(ClassDecl node) {
        if (node.getFunctions() != null) {
            for (AST e : node.getFunctions()) visit(e);
        }
    }

    private void visit(CompoundStmt node) {
        if (node.getStmts() != null)
            for (AST e : node.getStmts()) visit(e);
    }

    private void visit(ContinueStmt node) {
    }

    private void visit(FieldAccessExpr node) {
        visit(node.getBase());
    }

    private void visit(ForStmt node) {
        visit(node.getInit());
        visit(node.getCondition());
        visit(node.getAfter());
        visit(node.getLoop());
    }

    private void visit(FuncDecl node) {
        if (node.getStmts() != null)
            for (AST e : node.getStmts()) visit(e);
    }

    private void visit(IndexExpr node) {
        visit(node.getBase());
        visit(node.getIndex());
    }

    private void visit(IntExpr node) {
    }

    private void visit(LogBinaryExpr node) {
        visit(node.getLhs());
        visit(node.getRhs());
    }

    private void visit(LogNotExpr node) {
        visit(node.getBase());
    }

    private void visit(LogRelationExpr node) {
        visit(node.getRhs());
        visit(node.getLhs());
    }

    private void visit(NullExpr node) {
    }

    private void visit(Program node) {
        if (node.getDecls() != null)
            for (AST e : node.getDecls()) visit(e);
    }

    private void visit(ReturnStmt node) {
        visit(node.getReturnExpr());
    }

    private void visit(SelectionStmt node) {
        visit(node.getCondition());
        visit(node.getThenStmt());
        visit(node.getElseStmt());
        if (node.getSubSelectionConditions() != null) {
            ListIterator<ExprStmt> ConItr = node.getSubSelectionConditions().listIterator();
            ListIterator<Stmt> stmtItr = node.getSubSelectionThenStmts().listIterator();
            while (ConItr.hasNext()) {
                visit(ConItr.next());
                visit(stmtItr.next());
            }
        }
    }

    private void visit(SelfOpPostExpr node) {
        isRead = false;
        visit(node.getBase());
        isRead = true;
    }

    private void visit(SelfOpPreExpr node) {
        isRead = false;
        visit(node.getBase());
        isRead = true;
    }

    private void visit(SignExpr node) {
        visit(node.getBase());
    }

    private void visit(StringExpr node) {
    }

    private void visit(VarDecl node) {
        visit(node.getCreation());
    }

    private void visit(VarDeclStmt node) {
        visit(node.getCreation());
    }

    private void visit(VarExpr node) {
        if (node.getVar().isGlobal()) {
            if (isRead) {

            }
        }
    }

    private void visit(WhileStmt node) {
        visit(node.getCondition());
        visit(node.getLoop());
    }
}