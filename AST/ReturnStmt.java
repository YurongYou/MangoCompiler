package AST;

import Gadgets.Position;

/**
 * The return statement node in AST.
 * Created by Ficos on 16/3/31.
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