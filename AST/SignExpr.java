package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The sign expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class SignExpr extends ExprStmt {
    ExprStmt base;

    public SignExpr(ExprStmt _base, Scope _currScope, Position _pos) {
        super(_base.getType(), _currScope, _pos);
        base = _base;
    }
}