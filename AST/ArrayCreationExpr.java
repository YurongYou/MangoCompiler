package AST;

import Gadgets.Position;
import Gadgets.Type.ArrayType;

/**
 * The array creation expression (e.g. new int[2][]) node in AST
 * Created by Ficos on 16/3/31.
 */
public class ArrayCreationExpr extends ExprStmt {
    ExprStmt dim;

    public ArrayCreationExpr(ArrayType _type, ExprStmt _dim, Position _pos) {
        super(_type, _pos);
        dim = _dim;
    }

    public ExprStmt getDim() {
        return dim;
    }
}