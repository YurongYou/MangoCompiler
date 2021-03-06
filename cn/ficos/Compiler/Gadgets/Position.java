package cn.ficos.Compiler.Gadgets;

/**
 * Indicates where the node/leaf begins in {@link cn.ficos.Compiler.AST.AST}
 */
public class Position {
    public int line;

    public Position(int _line) {
        line = _line;
    }

    @Override
    public String toString() {
        return "line " + line;
    }
}