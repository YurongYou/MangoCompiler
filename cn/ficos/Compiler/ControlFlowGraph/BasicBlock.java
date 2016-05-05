package cn.ficos.Compiler.ControlFlowGraph;

import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.IR.IRNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * This class implements the ControlFlowGraph nodes
 * <p>
 * Created by Ficos on 16/5/4.
 */
public class BasicBlock {
    private static int count = 0;
    Set<BasicBlock> successors = new HashSet<>();
    LinkedList<IRNode> instructions = new LinkedList<>();
    Set<Register> LiveOut = new HashSet<>();
    Set<Register> UEVar = new HashSet<>();
    Set<Register> VarKill = new HashSet<>();
    private int ID = count++;

    public BasicBlock() {
    }

//    public Set<Register> getLiveOut() {
////        return LiveOut;
////    }

    public Set<Register> getUEVar() {
        return UEVar;
    }

//    public Set<Register> getVarKill() {
//        return VarKill;
//    }

    public void gatherInitialInfo() {
        for (IRNode node : instructions) {
            // Process Read
            for (Register r : node.getUEVar())
                if (!VarKill.contains(r)) UEVar.add(r);
            // Process Write
            if (node.getVarKill() != null)
                VarKill.add(node.getVarKill());
        }
    }

    public Boolean recomputeLiveOut() {
        Boolean isChanged = false;
        for (BasicBlock succ : successors) {

            for (Register n : succ.UEVar) {
                if (!LiveOut.contains(n)) {
                    isChanged = true;
                    LiveOut.add(n);
                }
            }

            for (Register n : succ.LiveOut) {
                if (!succ.VarKill.contains(n) && !LiveOut.contains(n)) {
                    isChanged = true;
                    LiveOut.add(n);
                }
            }
        }
        return isChanged;
    }

    public void computeLiveOutInside() {
        Iterator<IRNode> IRItr = instructions.descendingIterator();
        IRNode pre;
        IRNode temp = IRItr.next();
        for (Register r : LiveOut) temp.addLiveOut(r);
        while (IRItr.hasNext()) {
            pre = temp;
            temp = IRItr.next();
            for (Register r : pre.getUEVar()) temp.addLiveOut(r);
            for (Register r : pre.getLiveOut())
                if (pre.getVarKill() != r)
                    temp.addLiveOut(r);
        }
    }

    private int getID() {
        return ID;
    }

    public void addSuccessor(BasicBlock succ) {
        successors.add(succ);
    }

    public void addInstruction(IRNode instr) {
        instructions.add(instr);
    }

    public Set<BasicBlock> getSuccessors() {
        return successors;
    }

    public LinkedList<IRNode> getInstructions() {
        return instructions;
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("The No." + ID + " BasicBlock\n");
        for (IRNode node : instructions) temp.append(node.toString() + "\n");
        if (successors.size() != 0) {
            temp.append("Successors are:\n");
            for (BasicBlock block : successors) temp.append(block.getID() + " ");
        }
        temp.append("\nVarKills are:").append(VarKill.toString());
        temp.append("\nUEVar are:").append(UEVar.toString());
        temp.append("\nLiveOut are:").append(LiveOut.toString());
        temp.append("\n\n");
        return temp.toString();
    }
}
