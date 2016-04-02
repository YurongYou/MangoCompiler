package Gadgets;

/**
 * Indicates where the node/leaf begins in {@link AST.AST}
 * Created by Ficos on 16/3/31.
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