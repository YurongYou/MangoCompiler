package cn.ficos.Compiler.AST;

/**
 * This interface is intended to tag which AST node can serve as a LoopScope (whileLoop, forLoop).
 * It's fairly useful to decide which scope the jump expr(break, continue, return) will jump to
 * <p>
 * Created by Ficos on 16/4/2.
 */
public interface LoopScope {
}
