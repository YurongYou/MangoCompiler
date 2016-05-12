package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class represents the store node in IR, such as 'Store $source, $address'
 */
public class Store extends IRNode {
    Register source;
    Register target;
    int offset;
    int size;

    public Store(int _size, Register source, Register target, int _offset) {
        size = _size;

        this.source = source;
        this.target = target;

        UEVar.add(source);
        UEVar.add(target);

        offset = _offset;
    }

    public int getOffset() {
        return offset;
    }

    public int getSize() {
        return size;
    }

    public Register getSource() {
        return source;
    }

    public Register getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "ST\tsize:" + size + ", " + source + ", " + offset + "(" + target + ")";
    }

}
