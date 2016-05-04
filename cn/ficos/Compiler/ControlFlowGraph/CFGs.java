package cn.ficos.Compiler.ControlFlowGraph;

import java.util.List;

/**
 * Just a list contains CFGs
 * Created by Ficos on 16/5/4.
 */
public class CFGs {
    List<CFG> CFGList;

    public CFGs(List<CFG> CFGList) {
        this.CFGList = CFGList;
    }

    public List<CFG> getCFGList() {
        return CFGList;
    }
}
