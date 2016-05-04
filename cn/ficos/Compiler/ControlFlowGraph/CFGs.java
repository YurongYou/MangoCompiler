package cn.ficos.Compiler.ControlFlowGraph;

import java.util.LinkedList;
import java.util.List;

/**
 * Just a list contains CFGs
 * Created by Ficos on 16/5/4.
 */
public class CFGs {
    List<CFG> CFGList;
    LinkedList<String> data;

    public CFGs(List<CFG> CFGList, LinkedList<String> data) {

        this.CFGList = CFGList;
        this.data = data;
    }

    public LinkedList<String> getData() {
        return data;
    }

    public List<CFG> getCFGList() {
        return CFGList;
    }
}
