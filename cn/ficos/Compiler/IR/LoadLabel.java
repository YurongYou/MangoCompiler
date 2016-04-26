package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class means loading from a label address
 * Created by Ficos on 16/4/27.
 */
public class LoadLabel extends IRNode {
    Register target;
    Label label;

    public LoadLabel(Register target, Label label) {
        this.target = target;
        this.label = label;
    }

    @Override
    public String toString() {
        return "LA\t" + target + " " + label;
    }
}
