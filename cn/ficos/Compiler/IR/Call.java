package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;

import java.util.List;

/**
 * This class serves as a call node in IR. e.g. f(1), new ...
 * Created by Ficos on 16/4/19.
 */
public class Call extends IRNode {
    FuncSymbol info;
    List<Operand> parameters;
    Register target;

    public Call(FuncSymbol info, List<Operand> parameters, Register target) {
        this.info = info;
        this.parameters = parameters;
        this.target = target;
    }

    @Override
    public String toString() {
        return "Call:" + info.getName() + " " + target + ", " + parameters;
    }
}