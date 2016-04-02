package AST;

import Gadgets.Position;

/**
 * The get-index expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class IndexExpr extends ExprStmt implements LValue {
    ExprStmt index;
    ExprStmt base;

    public IndexExpr(ExprStmt _base, ExprStmt _index, Position _pos) {
        super(_base.getType(), _pos);
    }
}