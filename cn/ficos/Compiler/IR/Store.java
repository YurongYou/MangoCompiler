package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represents the store node in IR, such as 'Store $source, $address'
 * Created by Ficos on 16/4/20.
 */
public class Store extends IRNode {
    Operand source;
    Register target;
    int offset;
    int size;

    public Store(int _size, Operand source, Register target, int _offset) {
        size = _size;

        this.source = source;
        this.target = target;
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
        return "ST\tsize:" + size + ", " + source + ", " + offset + "(" + target + ")";
    }
}
