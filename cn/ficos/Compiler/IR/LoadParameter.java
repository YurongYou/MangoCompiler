package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represents the loading of parameter before a function begin
 */
public class LoadParameter extends IRNode {
    Register target;
    //    No = k means this is the kth parameter of the function
    int No;

    public LoadParameter(Register target, int no) {
        this.target = target;
        No = no;
        VarKill = target;
    }

    public Register getTarget() {
        return target;
    }

    public int getNo() {
        return No;
    }

    @Override
    public String toString() {
        return "Load No." + No + " parameter into " + target;
    }
}
