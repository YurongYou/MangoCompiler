package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class means the return statements of IR
 * Note that null result means "return;"
 */
public class Return extends IRNode {
    Operand result;

    public Return(Operand result) {
        this.result = result;
        if (result instanceof Register) {
            UEVar.add((Register) result);
        }
    }

    @Override
    public String toString() {
        return "Return " + result;
    }

    public Operand getResult() {
        return result;
    }
}