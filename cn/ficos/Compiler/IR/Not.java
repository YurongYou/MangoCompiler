package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class means the bitwise not expression
 */
public class Not extends IRNode {
    Register target;
    Register source;

    public Not(Register target, Register source) {
        this.target = target;
        this.source = source;
        UEVar.add(source);
        VarKill = target;
    }

    @Override
    public String toString() {
        return "Not " + target + ", " + source;
    }

    public Register getTarget() {
        return target;
    }

    public Register getSource() {
        return source;
    }

}