package AST;

import Gadgets.Position;

/**
 * The bitwise-not expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class BitNotExpr extends ExprStmt {
    ExprStmt base;

    public BitNotExpr(ExprStmt _base, Position _pos) {
        super(_base.getType(), _pos);
        base = _base;
    }
}
