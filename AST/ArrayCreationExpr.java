package AST;

import Gadgets.Position;
import Gadgets.Type.ArrayType;

import java.util.List;

/**
 * The array creation expression (e.g. new int) node in AST
 * Created by Ficos on 16/3/31.
 */
public class ArrayCreationExpr extends ExprStmt {
    List<ExprStmt> dimList;

    public ArrayCreationExpr(ArrayType _type, List<ExprStmt> _dimList, Position _pos) {
        super(_type, _pos);
        dimList = _dimList;
    }
}