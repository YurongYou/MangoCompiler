package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;

/**
 * This class serves as a branch node of IR
 * Created by Ficos on 16/4/18.
 */
public class Branch extends IRNode {
    Operand condition;
    Label T;
    Label F;

    public Branch(Operand condition, Label t, Label f) {
        this.condition = condition;
        T = t;
        F = f;
    }

    @Override
    public String toString() {
        return "Branch " + condition + ", " + T + ", " + F;
    }

    public Operand getCondition() {
        return condition;
    }

    public Label getT() {
        return T;
    }

    public Label getF() {
        return F;
    }
}
