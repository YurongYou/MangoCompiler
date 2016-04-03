package AST;

import Gadgets.Position;

/**
 * The sign expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class SignExpr extends ExprStmt {
    ExprStmt base;
    Boolean op;

    public ExprStmt getBase() {
        return base;
    }

    public Boolean getOp() {
        return op;
    }

    public SignExpr(Boolean _op, ExprStmt _base, Position _pos) {
        super(_base.getType(), _pos);
        base = _base;
        op = _op;

    }
}