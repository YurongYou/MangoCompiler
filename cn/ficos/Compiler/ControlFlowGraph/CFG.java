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

    public CFG(LinkedList<BasicBlock> CFG) {
        this.CFG = CFG;
//        Automatically color the registers
        for (BasicBlock block : CFG) block.gatherInitialInfo();
        solveLiveOut();
        for (BasicBlock block : CFG) block.computeLiveOutInside();
        colorRegister();
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
        }

        // test
//        for (Register reg: regs) System.out.println(reg + "'s color is " + reg.getColor());
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("Now a new CFG:\n");
        for (BasicBlock block : CFG) temp.append(block.toString());
        temp.append("\n");
        return temp.toString();
    }
}
