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

    public Store(Operand source, Register target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public String toString() {
        return "Store " + source + ", " + target;
    }
}
