package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
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
        if (var.isGlobal()) {
//            this register is used as a result to load the global variable
            changeOperand(new LocalRegister());
        }
    }

    public VarSymbol getVar() {
        return var;
    }
}