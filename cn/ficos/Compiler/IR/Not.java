package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class means the bitwise not expression
 * Created by Ficos on 16/4/25.
 */
public class Not extends IRNode {
    Register target;
    Operand source;

    public Not(Register target, Operand source) {
        this.target = target;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Not " + target + ", " + source;
    }
}