package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

/**
 * This class serves as a branch node of IR
 * Created by Ficos on 16/4/18.
 */
public class Branch extends IRNode {
    Register condition;
    Label T;
    Label F;

    public Branch(Register condition, Label t, Label f) {
        this.condition = condition;
        UEVar.add(condition);
        T = t;
        F = f;
    }

    @Override
    public String toString() {
        return "Branch " + condition + ", " + T + ", " + F;
    }

    public Register getCondition() {
        return condition;
    }

    public Label getT() {
        return T;
    }

    public Label getF() {
        return F;
    }
}
