package cn.ficos.Compiler.IR;

import cn.ficos.Compiler.Gadgets.Operand.Register;

import java.util.HashSet;
import java.util.Set;

/**
 * This class serves as an abstract link node of IRs
 * Created by Ficos on 16/4/18.
 */
public abstract class IRNode {
    Set<Register> LiveOut = new HashSet<>();
    Set<Register> UEVar = new HashSet<>();
    Set<Register> VarKill = new HashSet<>();

    public Set<Register> getUEVar() {
        return UEVar;
    }

    public Set<Register> getVarKill() {
        return VarKill;
    }

    public Set<Register> getLiveOut() {
        return LiveOut;
    }

    public void addLiveOut(Register r) {
        LiveOut.add(r);
    }
    public abstract String toString();

}