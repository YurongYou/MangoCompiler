package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represents the binary statements of IR, all operands are registers
 * Created by Ficos on 16/4/20.
 */
public class Binary extends IRNode {
    Register target;
    Operand lhs;
    Operand rhs;
    IRBinaryOp OP;

    public Binary(Register target, Operand lhs, Operand rhs, IRBinaryOp OP) {
        this.target = target;
        this.lhs = lhs;
        this.rhs = rhs;
        this.OP = OP;
    }

    @Override
    public String toString() {
        return OP + " " + target + ", " + lhs + ", " + rhs;
    }
}