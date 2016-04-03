package AST;

import Gadgets.Position;
import Gadgets.Symbol.VarSymbol;

/**
 * The Id node in AST
 * Created by Ficos on 16/3/31.
 */
public class VarExpr extends ExprStmt implements LValue {
    VarSymbol var;

    public VarExpr(VarSymbol _var, Position _pos) {
        super(_var.getType(), _pos);
        var = _var;
    }

    public VarSymbol getVar() {
        return var;
    }
}