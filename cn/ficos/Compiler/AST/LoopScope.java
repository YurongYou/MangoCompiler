package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.IR.Label;

/**
 * This interface is intended to tag which AST node can serve as a LoopScope (whileLoop, forLoop).
 * It's fairly useful to decide which scope the jump expr(break, continue) will jump to
 * <p>
 * Created by Ficos on 16/4/2.
 */
public interface LoopScope {
    Label getBegin();

    Label getEnd();
}