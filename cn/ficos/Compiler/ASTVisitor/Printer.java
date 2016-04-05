package cn.ficos.Compiler.ASTVisitor;

import cn.ficos.Compiler.AST.*;
import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Type.Type;

import java.io.PrintStream;
import java.util.ListIterator;

/**
 * This class will visit a AST tree and print out all information
 * Created by Ficos on 16/4/3.
 */
public class Printer {
    AST root;
    PrintStream out;

    public Printer(AST root, PrintStream out) {
        this.root = root;
        this.out = out;
    }

    public static void main(String[] args) {
        Printer p = new Printer(null, System.out);
        p.indent(2);
    }

    public void print() {
        visit(root, 0);
    }

//    void visit(ExprStmt node){
//
//    }

    void visit(AST node, int d) {
        if (node instanceof Program) {
            visit((Program) node, d);
            return;
        }
        if (node instanceof VarDecl) {
            visit((VarDecl) node, d);
            return;
        }
        if (node instanceof VarDeclStmt) {
            visit((VarDeclStmt) node, d);
            return;
        }
        if (node instanceof ClassDecl) {
            visit((ClassDecl) node, d);
            return;
        }
        if (node instanceof FuncDecl) {
            visit((FuncDecl) node, d);
            return;
        }
        if (node instanceof VarExpr) {
            visit((VarExpr) node, d);
            return;
        }
        if (node instanceof IndexExpr) {
            visit((IndexExpr) node, d);
            return;
        }
        if (node instanceof CallExpr) {
            visit((CallExpr) node, d);
            return;
        }
        if (node instanceof AtomCreationExpr) {
            visit((AtomCreationExpr) node, d);
            return;
        }
        if (node instanceof ArrayCreationExpr) {
            visit((ArrayCreationExpr) node, d);
            return;
        }
        if (node instanceof SignExpr) {
            visit((SignExpr) node, d);
            return;
        }
        if (node instanceof IntExpr) {
            visit((IntExpr) node, d);
            return;
        }
        if (node instanceof BoolExpr) {
            visit((BoolExpr) node, d);
            return;
        }
        if (node instanceof ClassFuncAccessExpr) {
            visit((ClassFuncAccessExpr) node, d);
            return;
        }
        if (node instanceof BitNotExpr) {
            visit((BitNotExpr) node, d);
            return;
        }
        if (node instanceof LogNotExpr) {
            visit((LogNotExpr) node, d);
            return;
        }
        if (node instanceof StringExpr) {
            visit((StringExpr) node, d);
            return;
        }
        if (node instanceof LogBinaryExpr) {
            visit((LogBinaryExpr) node, d);
            return;
        }
        if (node instanceof BinaryExpr) {
            visit((BinaryExpr) node, d);
            return;
        }
        if (node instanceof AssignExpr) {
            visit((AssignExpr) node, d);
            return;
        }
        if (node instanceof SelfOpPostExpr) {
            visit((SelfOpPostExpr) node, d);
            return;
        }
        if (node instanceof SelfOpPreExpr) {
            visit((SelfOpPreExpr) node, d);
            return;
        }
        if (node instanceof ReturnStmt) {
            visit((ReturnStmt) node, d);
            return;
        }
        if (node instanceof ContinueStmt) {
            visit((ContinueStmt) node, d);
            return;
        }
        if (node instanceof SelectionStmt) {
            visit((SelectionStmt) node, d);
            return;
        }
        if (node instanceof ForStmt) {
            visit((ForStmt) node, d);
            return;
        }
        if (node instanceof WhileStmt) {
            visit((WhileStmt) node, d);
            return;
        }
        if (node instanceof CompoundStmt) {
            visit((CompoundStmt) node, d);
            return;
        }
        if (node instanceof FieldAccessExpr) {
            visit((FieldAccessExpr) node, d);
            return;
        }
        if (node instanceof BreakStmt) {
            visit((BreakStmt) node, d);
        }
        if (node instanceof NullExpr) {
            visit((NullExpr) node, d);
        }
    }

    void visit(Program node, int d) {
        indent(d);
        out.print("Program:\n");
        ListIterator<Decl> itr = node.getDecls().listIterator();
        while (itr.hasNext()) {
            visit(itr.next(), d);
            out.print("\n");
        }
    }

    void visit(VarDecl node, int d) {
        indent(d);
        out.print("Variable Declaration:\n");
        indent(d + 1);
        out.print("Name: " + node.getVar().getName() + "\n");
        indent(d + 1);
        out.print("Type: " + node.getVar().getType() + "\n");
        if (node.getCreation() != null) {
            indent(d + 1);
            out.print("creation: ");
            visit(node.getCreation(), 0);
        }
        out.print("\n");
    }

    void visit(VarDeclStmt node, int d) {
        indent(d);
        out.print("Variable Declaration Statement:\n");
        indent(d + 1);
        out.print("Name: " + node.getVarInfo().getName() + "\n");
        indent(d + 1);
        out.print("Type: " + node.getVarInfo().getType());
        if (node.getCreation() != null) {
            out.print("\n");
            indent(d + 1);
            out.print("creation: ");
            visit(node.getCreation(), 0);
        }
    }

    void visit(ClassDecl node, int d) {
        indent(d);
        out.print("Class Declaration:\n");
        indent(d + 1);
        if (node.getVariables() != null) {
            out.print("Fields:\n");
            for (VarDecl e : node.getVariables()) {
                visit(e, d + 2);
                out.print("\n");
            }
        }
        if (node.getFunctions() != null) {
            indent(d + 1);
            out.print("Functions:\n");
            for (FuncDecl e : node.getFunctions()) {
                visit(e, d + 2);
                out.print("\n");
            }
        }
    }

    void visit(FuncDecl node, int d) {
        indent(d);
        out.print("Function " + node.getFuncInfo().getName() + "\n");
        if (node.getFuncInfo().getFormalParametersName() != null) {
            indent(d + 1);
            out.print("Parameters:\n");
            ListIterator<Type> Titr = node.getFuncInfo().getFormalParametersType().listIterator();
            ListIterator<Name> Nitr = node.getFuncInfo().getFormalParametersName().listIterator();
            while (Titr.hasNext()) {
                indent(d + 2);
                out.print("Type: " + Titr.next() + ", Name: " + Nitr.next() + "\n");
            }
        }
        for (Stmt s : node.getStmts()) {
            visit(s, d + 1);
            out.print("\n");
        }
    }

    void visit(VarExpr node, int d) {
        indent(d);
        out.print("<ID:(" + node.getVar().getType() + ")" + node.getVar().getName() + ">");
    }

    void visit(IndexExpr node, int d) {
        indent(d);
        out.print("<Index:");
        visit(node.getBase(), 0);
        out.print("[");
        visit(node.getIndex(), 0);
        out.print("]>");
    }

    void visit(FieldAccessExpr node, int d) {
        indent(d);
        out.print("<FieldAccess:");
        visit(node.getLhs(), 0);
        out.print("." + node.getField() + ">");
    }

    void visit(CallExpr node, int d) {
        indent(d);
        out.print("<FuncCall:" + node.getFuncInfo().getName());
        if (node.getActualParameter() != null) {
            out.print("|");
            ListIterator<Type> Titr = node.getFuncInfo().getFormalParametersType().listIterator();
            ListIterator<ExprStmt> Nitr = node.getActualParameter().listIterator();
            while (Titr.hasNext()) {
                out.print("(" + Titr.next() + ")");
                visit(Nitr.next(), 0);
            }
        }
        out.print(">");
    }

    void visit(AtomCreationExpr node, int d) {
        indent(d);
        out.print("<New:" + node.getType() + ">");
    }

    void visit(ArrayCreationExpr node, int d) {
        indent(d);
        out.print("<New:" + node.getType() + "| dim = ");
        visit(node.getDim(), 0);
        out.print(">");
    }

    void visit(SignExpr node, int d) {
        indent(d);
        if (node.getOp()) out.print("+");
        else out.print("-");
        visit(node.getBase(), 0);
    }

    void visit(IntExpr node, int d) {
        indent(d);
        out.print(node.getValue());
    }

    void visit(BoolExpr node, int d) {
        indent(d);
        out.print(node.getValue());
    }

    void visit(ClassFuncAccessExpr node, int d) {
        indent(d);
        out.print("<ClassFunc:");
        visit(node.getClassExpr(), 0);
        out.print("|" + node.getFuncInfo().getName() + ">");
    }

    void visit(BitNotExpr node, int d) {
        indent(d);
        out.print("<BitwiseNot:");
        visit(node.getBase(), 0);
        out.print(">");
    }

    void visit(LogNotExpr node, int d) {
        indent(d);
        out.print("<LogicalNot:");
        visit(node.getBase(), 0);
        out.print(">");
    }

    void visit(StringExpr node, int d) {
        indent(d);
        out.print("<string:\"" + node.getText() + "\">");
    }

    void visit(LogBinaryExpr node, int d) {
        indent(d);
        out.print("<LogicalBinaryExpr|lhs:");
        visit(node.getLhs(), 0);
        out.print(", op:");
        switch (node.getOp()) {
            case LESS:
                out.print("<");
                break;
            case LARGE:
                out.print(">");
                break;
            case LEQ:
                out.print("<=");
                break;
            case GEQ:
                out.print(">=");
                break;
            case EQ:
                out.print("==");
                break;
            case NEQ:
                out.print("!=");
                break;
            case LOG_AND:
                out.print("&&");
                break;
            case LOG_OR:
                out.print("||");
                break;
        }
        out.print(", rhs:");
        visit(node.getRhs(), 0);
        out.print(">");
    }

    void visit(BinaryExpr node, int d) {
        indent(d);
        out.print("<BinaryExpr|lhs:");
        visit(node.getLhs(), 0);
        out.print(", op:");
        switch (node.getOp()) {
            case MULT:
                out.print("*");
                break;
            case DIV:
                out.print("/");
                break;
            case MOD:
                out.print("%");
                break;
            case PLUS:
                out.print("+");
                break;
            case SHIFT_L:
                out.print("<<");
                break;
            case SHIFT_R:
                out.print(">>");
                break;
            case BIT_AND:
                out.print("&");
                break;
            case BIT_XOR:
                out.print("~");
                break;
            case BIT_OR:
                out.print("|");
                break;
        }
        out.print(", rhs:");
        visit(node.getRhs(), 0);
        out.print(">");
    }

    void visit(AssignExpr node, int d) {
        indent(d);
        out.print("<Assignment:");
        visit(node.getLhs(), 0);
        out.print("=");
        visit(node.getRhs(), 0);
        out.print(">");
    }

    void visit(SelfOpPreExpr node, int d) {
        indent(d);
        if (node.getOp()) {
            out.print("<SelfIncreasePre:");
            visit(node.getBase(), 0);
            out.print(">");
        } else {
            out.print("<SelfDecreasePre:");
            visit(node.getBase(), 0);
            out.print(">");
        }
    }

    void visit(SelfOpPostExpr node, int d) {
        indent(d);
        if (node.getOp()) {
            out.print("<SelfIncreasePost:");
            visit(node.getBase(), 0);
            out.print(">");
        } else {
            out.print("<SelfIecreasePost:");
            visit(node.getBase(), 0);
            out.print(">");
        }
    }

    void visit(ReturnStmt node, int d) {
        indent(d);
        out.print("<Return ");
        if (node.getReturnExpr() != null) {
            visit(node.getReturnExpr(), 0);
        }
        out.print("|dest : " + node.getReturnTo().getFuncInfo().getName() + ">");
    }

    void visit(ContinueStmt node, int d) {
        indent(d);
        out.print("Continue");
    }

    void visit(BreakStmt node, int d) {
        indent(d);
        out.print("Break");
    }

    void visit(SelectionStmt node, int d) {
        indent(d);
        out.print("IF conditional Statement\n");
        indent(d + 1);
        out.print("Condition:");
        visit(node.getCondition(), 0);
        out.print("\n");
        indent(d + 1);
        out.print("Then:\n");
        visit(node.getThenStmt(), d + 2);
        out.print("\n");
        if (node.getSubSelectionConditions() != null) {
            ListIterator<ExprStmt> elseif = node.getSubSelectionConditions().listIterator();
            ListIterator<Stmt> elseifthen = node.getSubSelectionThenStmts().listIterator();
            while (elseif.hasNext()) {
                indent(d + 1);
                out.print("Else If Condition: ");
                visit(elseif.next(), 0);
                out.print("\n");
                visit(elseifthen.next(), d + 2);
            }
        }
        if (node.getElseStmt() != null) {
            indent(d + 1);
            out.print("Else:\n");
            visit(node.getElseStmt(), d + 2);
        }
    }

    void visit(ForStmt node, int d) {
        indent(d);
        out.print("For-Loop:\n");
        indent(d + 1);
        out.print("init:");
        if (node.getInit() != null) visit(node.getInit(), 0);
        out.print("\n");
        indent(d + 1);
        if (node.getCondition() != null) out.print("condition:");
        visit(node.getCondition(), 0);
        out.print("\n");
        indent(d + 1);
        out.print("after:");
        if (node.getAfter() != null) visit(node.getAfter(), 0);
        out.print("\n");
        visit(node.getLoop(), d + 1);
    }

    void visit(WhileStmt node, int d) {
        indent(d);
        out.print("While-Loop:\n");
        indent(d + 1);
        out.print("condition:");
        visit(node.getCondition(), 0);
        out.print("\n");
        visit(node.getLoop(), d + 1);
    }

    void visit(CompoundStmt node, int d) {
        if (node.getStmts() != null) {
            for (Stmt s : node.getStmts()) {
                visit(s, d);
                out.print('\n');
            }
        }
    }

    void visit(NullExpr node, int d) {
        indent(d);
        out.print("NULL");
    }

    void indent(int d) {
        for (int i = 0; i < d; ++i) {
            out.print('\t');
        }
    }
}