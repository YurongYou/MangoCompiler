package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * this node is mainly used to load global variables
 * Created by Ficos on 16/4/28.
 */
public class LoadLabel extends IRNode {
    Label label;
    Register target;
    int size;

    public LoadLabel(Label label, Register reg, int _size) {
        this.label = label;
        this.target = reg;
        this.size = _size;
    }

    public Label getLabel() {
        return label;
    }

    public Register getTarget() {
        return target;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Load size:" + size + ", " + target + ", " + label;
    }
}