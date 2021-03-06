package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;

/**
 * This class is intended to represent the "li" code in MIPS
 */
public class LoadImm extends IRNode {
    LocalRegister reg;
    int imm;

    public LoadImm(LocalRegister reg, int imm) {
        this.reg = reg;
        this.imm = imm;
        VarKill = reg;
    }

    public LocalRegister getReg() {
        return reg;
    }

    public int getImm() {
        return imm;
    }

    @Override
    public String toString() {
        return "LoadImm " + reg +
                ", " + imm;
    }
}