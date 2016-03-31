package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The postfix self increase/decrease expression (e.g. a++, a--) in AST.
 * Created by Ficos on 16/3/31.
 */
public class SelfOpPostExpr extends ExprStmt {
    ExprStmt base;

    public SelfOpPostExpr(ExprStmt _base, Scope _currScope, Position _pos) {
        super(_base.getType(), _currScope, _pos);
        base = _base;
    }
}