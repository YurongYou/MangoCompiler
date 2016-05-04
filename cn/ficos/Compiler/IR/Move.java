package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * Created by Ficos on 16/4/18.
 */
public class Move extends IRNode {
    Register target;
    Register source;

    public Move(Register _target, Register _source) {
        target = _target;
        source = _source;
        UEVar.add(source);
        VarKill = target;
    }

    @Override
    public String toString() {
        return "Move " + target + ", " + source;
    }

    public Register getTarget() {
        return target;
    }

    public Register getSource() {
        return source;
    }
}