package cn.ficos.Compiler.ControlFlowGraph;

import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.IR.IRNode;

import java.util.*;

/**
 * This class is a Control Flow Graph, a single function in the source file is a CFG
 * Created by Ficos on 16/5/4.
 */
public class CFG {
    LinkedList<BasicBlock> CFG;
    int maxArgu;
    int frameSize;
    boolean isLeaf;
    boolean[] usedReg = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,};
    Map<Register, Integer> spills = new HashMap<>();

    public CFG(LinkedList<BasicBlock> CFG, int _maxArgu, boolean _isLeaf) {
        this.CFG = CFG;
        maxArgu = _maxArgu;
        isLeaf = _isLeaf;
//        Automatically color the registers
        for (BasicBlock block : CFG) block.gatherInitialInfo();
        solveLiveOut();
        for (BasicBlock block : CFG) block.computeLiveOutInside();
//        refine();
        colorRegister();
        countUse();
        if (isLeaf) frameSize = (maxArgu + spills.size()) * 4;
        else frameSize = (maxArgu + CONSTANT.actualRegNumber + spills.size()) * 4;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public LinkedList<BasicBlock> getCFG() {
        return CFG;
    }

    public int getMaxArgu() {
        return maxArgu;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public Map<Register, Integer> getSpills() {
        return spills;
    }

    private void solveLiveOut() {
        boolean changed = true;
        while (changed) {
            changed = false;
            Iterator<BasicBlock> BBItr = CFG.descendingIterator();
            while (BBItr.hasNext()) {
                if (BBItr.next().recomputeLiveOut()) changed = true;
            }
        }
        for (BasicBlock BB : CFG) BB.getherIsReserved();
    }

    private void buildInterference() {
        //  Build the interference graph
        for (BasicBlock block : CFG) {
            for (IRNode node : block.getInstructions()) {
                if (node.getVarKill() != null) {
                    for (Register live : node.getLiveOut()) {
                        node.getVarKill().addInterference(live);
                        live.addInterference(node.getVarKill());
                    }
                }
            }
        }
    }


    private void colorRegister() {
        buildInterference();
        Set<Register> regs = new HashSet<>();
        for (BasicBlock block : CFG) {
            for (IRNode node : block.getInstructions()) {
                if (node.getVarKill() != null && !regs.contains(node.getVarKill())) {
                    node.getVarKill().nowAdj = node.getLiveOut().size();
                    regs.add(node.getVarKill());
                }
            }
        }

        PriorityQueue<Register> queue = new PriorityQueue<>(regs);
        Stack<Register> coloringOrder = new Stack<>();

        while (!queue.isEmpty()) {
            Register temp = queue.poll();
            for (Register to : temp.getInterference()) {
                if (to.nowAdj >= 0) {
                    --to.nowAdj;
                    queue.remove(to);
                    queue.add(to);
                }
            }
            temp.nowAdj = -1;
            coloringOrder.add(temp);
        }

        while (!coloringOrder.isEmpty()) {
            Register now = coloringOrder.pop();
            boolean[] used = new boolean[CONSTANT.actualRegNumber];
            for (Register adj : now.getInterference()) {
                if (adj.isColored()) used[adj.getColor()] = true;
            }
            for (int i = 0; i < CONSTANT.actualRegNumber; ++i) {
                if (!used[i]) {
                    now.setColor(i);
                    break;
                }
            }
            if (!now.isColored()) spills.put(now, spills.size());
        }

        // test
//        for (Register reg: regs) System.out.println(reg + "'s color is " + reg.getColor());
    }


    public boolean[] getUsedReg() {
        return usedReg;
    }

    private void countUse() {
        if (!isLeaf) {
            boolean[] usedAll = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
            usedReg = usedAll;
            return;
        }
        for (BasicBlock block : CFG) {
            for (IRNode node : block.getInstructions()) {
                if (node.getVarKill() != null) {
                    if (node.getVarKill().isColored()) {
                        usedReg[node.getVarKill().getColor()] = true;
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("Now a new CFG:\n");
        for (BasicBlock block : CFG) temp.append(block.toString());
        temp.append("\n");
        return temp.toString();
    }
}