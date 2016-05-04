package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class means loading from a label address
 * Created by Ficos on 16/4/27.
 */
public class LoadAddress extends IRNode {
    Register target;
    Label label;

    public LoadAddress(Register target, Label label) {
        this.target = target;
        this.label = label;
        VarKill = target;
    }

    public Register getTarget() {
        return target;
    }

    public Label getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LA\t" + target + " " + label;
    }
}
