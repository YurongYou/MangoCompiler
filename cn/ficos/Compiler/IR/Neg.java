package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class means the arithmetic negation node in IR
 */
public class Neg extends IRNode {
    Register target;
    Register source;

    public Neg(Register target, Register source) {
        this.target = target;
        this.source = source;
        UEVar.add(source);
        VarKill = target;
    }

    @Override
    public String toString() {
        return "neg " + target + ", " + source;
    }

    public Register getTarget() {
        return target;
    }

    public Register getSource() {
        return source;
    }
}