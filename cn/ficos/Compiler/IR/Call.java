package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;

import java.util.List;

/**
 * This class serves as a call node in IR. e.g. f(1), new ...
 */
public class Call extends IRNode {
    Label funcLabel;
    List<Operand> parameters;
    Register target;
    boolean[] targetUsedRegs;

    public Call(FuncSymbol info, List<Operand> parameters, Register target) {
        funcLabel = info.getFuncLabel();
        this.parameters = parameters;
        this.target = target;
        if (parameters != null) {
            for (Operand operand : parameters) {
                if (operand instanceof Register) UEVar.add((Register) operand);
            }
        }
        VarKill = target;
    }

    public Call(Label info, List<Operand> parameters, Register target) {
        funcLabel = info;
        this.parameters = parameters;
        this.target = target;
        if (parameters != null) {
            for (Operand operand : parameters) {
                if (operand instanceof Register) UEVar.add((Register) operand);
            }
        }
        VarKill = target;
    }

    public boolean[] getTargetUsedRegs() {
        return targetUsedRegs;
    }

    public void setTargetUsedRegs(boolean[] targetUsedRegs) {
        this.targetUsedRegs = targetUsedRegs;
    }

    public List<Operand> getParameters() {
        return parameters;
    }

    public Label getFuncLabel() {
        return funcLabel;
    }

    public Register getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "Call:" + funcLabel + " " + target + ", " + parameters;
    }

}