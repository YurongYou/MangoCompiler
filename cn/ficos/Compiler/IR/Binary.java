package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.BinaryOp;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represents the binary statements of IR, all operands are registers
 * Created by Ficos on 16/4/20.
 */
public class Binary extends IRNode {
    Register target;
    Register lhs;
    Operand rhs;
    BinaryOp OP;

    public Binary(Register target, Register lhs, Operand rhs, BinaryOp OP) {
        this.target = target;
        this.lhs = lhs;
        this.rhs = rhs;
        UEVar.add(lhs);
        if (rhs instanceof Register) UEVar.add((Register) rhs);
        VarKill = target;
        this.OP = OP;
    }

    public Register getTarget() {
        return target;
    }

    public Register getLhs() {
        return lhs;
    }

    public Operand getRhs() {
        return rhs;
    }

    public BinaryOp getOP() {
        return OP;
    }

    @Override
    public String toString() {
        return OP + " " + target + ", " + lhs + ", " + rhs;
    }
}