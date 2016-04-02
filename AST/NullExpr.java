package AST;

import Gadgets.Position;

/**
 * The "null" node in AST
 * Created by Ficos on 16/4/3.
 */
public class NullExpr extends ExprStmt {
    public NullExpr(Position _pos) {
        super(null, _pos);
    }
}