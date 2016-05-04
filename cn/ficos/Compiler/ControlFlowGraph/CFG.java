package cn.ficos.Compiler.ControlFlowGraph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class is a Control Flow Graph, a single function in the source file is a CFG
 * Created by Ficos on 16/5/4.
 */
public class CFG {
    LinkedList<BasicBlock> CFG;

    public CFG(LinkedList<BasicBlock> CFG) {
        this.CFG = CFG;
        for (BasicBlock block : CFG) block.gatherInitialInfo();
        solveLiveOut();
        for (BasicBlock block : CFG) block.computeLiveOutInside();
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

    public String toString() {
        StringBuilder temp = new StringBuilder();
        temp.append("Now a new CFG:\n");
        for (BasicBlock block : CFG) temp.append(block.toString());
        temp.append("\n");
        return temp.toString();
    }
}
