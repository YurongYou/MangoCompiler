package AST;

import Gadgets.Position;

/**
 * The prefix self increase/decrease expression (e.g. ++a, ++a) in AST.
 * Created by Ficos on 16/3/31.
 */
public class SelfOpPreExpr extends ExprStmt {
    ExprStmt base;

    public SelfOpPreExpr(ExprStmt _base, Position _pos) {
        super(_base.getType(), _pos);
        base = _base;
    }
}