package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;

/**
 * The Id node in AST
 * Created by Ficos on 16/3/31.
 */
public class VarExpr extends ExprStmt implements LValue {
    VarSymbol var;

    public VarExpr(VarSymbol _var, Position _pos) {
        super(_var.getType(), _pos, _var.getReg());
        var = _var;
    }

    public VarSymbol getVar() {
        return var;
    }
}