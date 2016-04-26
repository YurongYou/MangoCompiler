package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represent the loads in IR
 * Created by Ficos on 16/4/20.
 */
public class Load extends IRNode {
    Register target;
    Operand source;
    int offset;
    int size;

    public Load(int _size, Register target, Operand source, int _offset) {
        size = _size;
        this.target = target;
        this.source = source;
        offset = _offset;
    }

    public int getOffset() {
        return offset;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "LD\tsize:" + size + ", " + target + ", " + offset + "(" + source + ")";
    }
}
