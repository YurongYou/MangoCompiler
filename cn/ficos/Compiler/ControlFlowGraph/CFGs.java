package cn.ficos.Compiler.ControlFlowGraph;

import cn.ficos.Compiler.Gadgets.SymbolTable;
import cn.ficos.Compiler.IR.Call;
import cn.ficos.Compiler.IR.IRNode;
import cn.ficos.Compiler.IR.Label;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Just a list contains CFGs
 * Created by Ficos on 16/5/4.
 */
public class CFGs {
    List<CFG> CFGList;
    LinkedList<String> data;
    Label Main;

    public CFGs(List<CFG> CFGList, LinkedList<String> data, Label _Main) {
        this.CFGList = CFGList;
        this.data = data;
        Main = _Main;
        setTargetRegUse();
    }

    public LinkedList<String> getData() {
        return data;
    }

    public List<CFG> getCFGList() {
        return CFGList;
    }

    private void setTargetRegUse() {
        boolean[] usedAll = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,};
        boolean[] usedNone = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,};
        boolean[] notSaved = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,};
        boolean[] SaveA0A1 = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false,};
        boolean[] SaveA0 = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false,};
        boolean[] println = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false,};
        boolean[] getString = {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false,};
        boolean[] toString = {true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false,};
        boolean[] subString = {true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false,};
        boolean[] Concatenate = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false};
        boolean[] parseInt = {true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false,};
        boolean[] compare = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false,};

        Map<Label, boolean[]> dict = new HashMap<>();
        for (CFG G : CFGList) {
            if (G.isLeaf) dict.put((Label) (G.getCFG().peek().getInstructions().peek()), G.getUsedReg());
            else dict.put((Label) (G.getCFG().peek().getInstructions().peek()), usedAll);
        }
        dict.put(SymbolTable.println.getFuncLabel(), println);
        dict.put(SymbolTable.getString.getFuncLabel(), getString);
        dict.put(SymbolTable.toString.getFuncLabel(), SaveA0);
        dict.put(SymbolTable.string_substring.getFuncLabel(), subString);
        dict.put(SymbolTable.string_parseInt.getFuncLabel(), parseInt);
        dict.put(SymbolTable.stringConcatenate.getFuncLabel(), Concatenate);
        dict.put(SymbolTable.stringIsEqual.getFuncLabel(), compare);
        dict.put(SymbolTable.stringLess.getFuncLabel(), compare);
        dict.put(SymbolTable.stringLarge.getFuncLabel(), compare);
        dict.put(SymbolTable.stringLeq.getFuncLabel(), compare);
        dict.put(SymbolTable.stringNeq.getFuncLabel(), compare);
        dict.put(SymbolTable.stringGeq.getFuncLabel(), compare);
        dict.put(SymbolTable.print.getFuncLabel(), SaveA0);
        dict.put(SymbolTable.getString.getFuncLabel(), usedNone);
        dict.put(SymbolTable.getInt.getFuncLabel(), usedNone);
        dict.put(SymbolTable.string_length.getFuncLabel(), SaveA0);
        dict.put(SymbolTable.string_ord.getFuncLabel(), SaveA0);
        dict.put(SymbolTable._array_size.getFuncLabel(), SaveA0);
        dict.put(Main, usedAll);

//        System.out.println(dict);
        for (CFG G : CFGList) {
            for (BasicBlock block : G.getCFG()) {
                for (IRNode node : block.getInstructions()) {
                    if (node instanceof Call) {
                        ((Call) node).setTargetUsedRegs(dict.get(((Call) node).getFuncLabel()));
                    }
                }
            }
        }
    }
}
