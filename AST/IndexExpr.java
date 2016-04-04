package AST;

import Gadgets.Position;
import Gadgets.Type.ArrayType;

/**
 * The get-index expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class IndexExpr extends ExprStmt implements LValue {
    ExprStmt base;
    IntExpr index;

    public IndexExpr(ExprStmt _base, IntExpr _index, Position _pos) {
        super(((ArrayType) _base.getType()).getBaseType(), _pos);
        base = _base;
        index = _index;
    }

    public ExprStmt getBase() {
        return base;
    }

    public IntExpr getIndex() {
        return index;
    }
}