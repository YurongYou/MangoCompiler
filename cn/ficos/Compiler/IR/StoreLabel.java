package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * this class is mainly used to represent the store of a global variable
 * Created by Ficos on 16/4/28.
 */
public class StoreLabel extends IRNode {
    Label label;
    Register source;
    int size;

    public StoreLabel(Label label, Register source, int size) {
        this.label = label;
        this.source = source;
        this.size = size;
    }

    public Label getLabel() {
        return label;
    }

    public Register getSource() {
        return source;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ST\tsize:" + size + ", " + source + ", " + label;
    }
}
