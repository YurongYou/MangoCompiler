package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;

/**
 * This class means the return statements of IR
 * Created by Ficos on 16/4/20.
 */
public class Return extends IRNode {
    Operand result;

    public Return(Operand result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Return " + result;
    }

    public Operand getResult() {
        return result;
    }
}