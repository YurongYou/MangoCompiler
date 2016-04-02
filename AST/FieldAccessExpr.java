package AST;

import Gadgets.Position;

/**
 * The field-access expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class FieldAccessExpr extends ExprStmt implements LValue {
    ExprStmt lhs;
    ExprStmt rhs;

    public FieldAccessExpr(ExprStmt _lhs, ExprStmt _rhs, Position _pos) {
        super(_rhs.getType(), _pos);
        lhs = _lhs;
        rhs = _rhs;
    }
}