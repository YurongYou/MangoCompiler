package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The return statement node in AST.
 */
public class ReturnStmt extends Stmt {
    ExprStmt returnExpr;
    FuncDecl returnTo;

    public ReturnStmt(ExprStmt _returnExpr, FuncDecl _returnTo, Position _pos) {
        super(_pos);
        returnExpr = _returnExpr;
        returnTo = _returnTo;
    }

    public ExprStmt getReturnExpr() {
        return returnExpr;
    }

    public FuncDecl getReturnTo() {
        return returnTo;
    }
}