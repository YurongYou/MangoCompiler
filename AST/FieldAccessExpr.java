package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The field-access expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class FieldAccessExpr extends ExprStmt {
    ExprStmt lhs;
    ExprStmt rhs;

    public FieldAccessExpr(ExprStmt _lhs, ExprStmt _rhs, Scope _currScope, Position _pos) {
        super(_rhs.getType(), _currScope, _pos);
        lhs = _lhs;
        rhs = _rhs;
    }
}