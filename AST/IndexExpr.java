package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The get-index expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class IndexExpr extends ExprStmt {
    ExprStmt index;
    ExprStmt base;

    public IndexExpr(ExprStmt _base, ExprStmt _index, Scope _currScope, Position _pos) {
        super(_base.getType(), _currScope, _pos);
    }
}