package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * Created by Ficos on 16/4/18.
 */
public class Move extends IRNode {
    Register lhs;
    Operand rhs;

    public Move(Register lhs, Operand rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public String toString() {
        return "Move " + lhs + ", " + rhs;
    }
}