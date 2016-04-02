package AST;

import Gadgets.Position;

/**
 * The return statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class ReturnStmt extends Stmt {
    ExprStmt returnExpr;

    public ReturnStmt(ExprStmt _returnExpr, Position _pos) {
        super(_pos);
        returnExpr = _returnExpr;
    }
}