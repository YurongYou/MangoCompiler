package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.AST.*;
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
        if (node instanceof AddressFetch) {
            visit((AddressFetch) node);
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
//        if (node instanceof ClassFuncAccessExpr) {
//            visit((ClassFuncAccessExpr) node);
//            return;
//        }
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

    void visit(VarExpr ast) {

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
            size = new Constant(((IntExpr) ast.getDim()).getValue() * ((ArrayType) ast.getType()).getBaseType().totalSize());
        } else {
            size = new LocalRegister();
            nowFunction.add(new Binary((Register) size, ast.getDim().getOperand(),
                    new Constant(((ArrayType) ast.getType()).getBaseType().totalSize()), BinaryOp.MUL));
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
                nowFunction.add(new Binary((Register) ast.getOperand(),
                        ast.getBase().getOperand(),
                        new Constant(-1), BinaryOp.MUL));
            }
        }
    }

    void visit(IntExpr ast) {
    }

    void visit(BoolExpr ast) {
    }

    void visit(NullExpr ast) {
    }

//    void visit(ClassFuncAccessExpr ast) {
//
//    }

    void visit(BitNotExpr ast) {

    }

    void visit(LogNotExpr ast) {

    }

    void visit(StringExpr ast) {

    }

    void visit(LogBinaryExpr ast) {

    }

    void visit(BinaryExpr ast) {

    }

    LocalRegister visitAddress(AddressFetch ast) {
        if (ast instanceof IndexExpr) {
            visit(((IndexExpr) ast).getBase());
            visit(((IndexExpr) ast).getIndex());

            LocalRegister address = ast.getAddressOperand();
            if (((IndexExpr) ast).getIndex() instanceof IntExpr) {
                nowFunction.add(new Binary(address, ((IndexExpr) ast).getBase().getOperand(),
                        new Constant(((IntExpr) ((IndexExpr) ast).getIndex()).getValue() * 4), BinaryOp.ADD));
            } else {
                LocalRegister shift = new LocalRegister();
                nowFunction.add(new Binary(shift, ((IndexExpr) ast).getIndex().getOperand(),
                        new Constant(4), BinaryOp.MUL));
                nowFunction.add(new Binary(address, ((IndexExpr) ast).getBase().getOperand(),
                        shift, BinaryOp.ADD));
            }
            return address;
        } else {
            visit(((FieldAccessExpr) ast).getLhs());
            LocalRegister address = ast.getAddressOperand();
            nowFunction.add(new Binary(address, ((FieldAccessExpr) ast).getLhs().getOperand(),
                    new Constant(((FieldAccessExpr) ast).getShift()), BinaryOp.ADD));
            return address;
        }
    }

    void visit(AddressFetch ast) {
        nowFunction.add(new Load(ast.getResultOperand(), visitAddress(ast)));
    }

    void visit(AssignExpr ast) {
        visit(ast.getRhs());
        if (ast.getLhs() instanceof AddressFetch) {
            visitAddress((AddressFetch) ast.getLhs());
            nowFunction.add(new Store(((AddressFetch) ast.getLhs()).getAddressOperand(), ast.getRhs().getOperand()));
        } else {
            nowFunction.add(new Move((Register) ast.getLhs().getOperand(), ast.getRhs().getOperand()));
        }
//        !!! Note that the result operand of the AssignExpr is the lhs's operand
        ast.changeOperand(ast.getLhs().getOperand());
    }

    void visit(SelfOpPostExpr ast) {

    }

    void visit(SelfOpPreExpr ast) {

    }

    void visit(ReturnStmt ast) {

    }

    void visit(ContinueStmt ast) {

    }

    void visit(SelectionStmt ast) {

    }

    void visit(ForStmt ast) {

    }

    void visit(WhileStmt ast) {

    }

    void visit(CompoundStmt ast) {

    }


    void visit(BreakStmt ast) {

    }


}