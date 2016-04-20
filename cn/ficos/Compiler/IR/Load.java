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

    public Load(Register target, Operand source) {
        this.target = target;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Load " + target + ", " + source;
    }
}
