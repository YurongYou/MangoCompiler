package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represents the new statement of IR
 * The size counts in words
 * Created by Ficos on 16/4/20.
 */
public class New extends IRNode {
    Register target;
    Operand size;

    public New(Register target, Operand size) {
        this.target = target;
        this.size = size;
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
