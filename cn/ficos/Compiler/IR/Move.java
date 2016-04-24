package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * Created by Ficos on 16/4/18.
 */
public class Move extends IRNode {
    Register target;
    Operand source;

    public Move(Register _target, Operand _source) {
        target = _target;
        source = _source;
    }

    @Override
    public String toString() {
        return "Move " + target + ", " + source;
    }
}