package AST;

import Gadgets.Name;
import Gadgets.Position;
import Gadgets.Type.Type;

/**
 * The field-access expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class FieldAccessExpr extends ExprStmt implements LValue {
    ExprStmt lhs;
    Name field;

    public FieldAccessExpr(Type _type, ExprStmt _lhs, Name _field, Position _pos) {
        super(_type, _pos);
        lhs = _lhs;
        field = _field;
    }
}