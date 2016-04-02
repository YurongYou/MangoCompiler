package AST;

import Gadgets.Position;
import Gadgets.SymbolTable;

/**
 * The literal int node in AST
 * Created by Ficos on 16/4/2.
 */
public class IntExpr extends ExprStmt {
    private int value;

    public IntExpr(String text, Position _pos) {
        super(SymbolTable.INT, _pos);
        value = Integer.parseInt(text);
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        IntExpr i = new IntExpr("233333333", new Position());
        System.out.println(i.getValue());
    }
}