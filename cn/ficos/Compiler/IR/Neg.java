package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class means the arithmetic negation node in IR
 * Created by Ficos on 16/4/25.
 */
public class Neg extends IRNode {
    Register target;
    Operand source;

    public Neg(Register target, Operand source) {
        this.target = target;
        this.source = source;
    }

    @Override
    public String toString() {
        return "NEG " + target + ", " + source;
    }
}