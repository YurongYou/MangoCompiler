package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represents the new statement of IR
 * The size counts in bytes
 */
public class New extends IRNode {
    Register target;
    Operand size;

    public New(Register target, Operand size) {
        this.target = target;
        this.size = size;
        if (size instanceof Register) UEVar.add((Register) size);
        VarKill = target;
    }

    @Override
    public String toString() {
        return "NEW\t" + target + ", " + size;
    }

    public Register getTarget() {
        return target;
    }

    public Operand getSize() {
        return size;
    }

}
