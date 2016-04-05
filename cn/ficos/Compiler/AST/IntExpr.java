package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

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

    public static void main(String[] args) {
        IntExpr i = new IntExpr("233333333", new Position(1));
        System.out.println(i.getValue());
    }

    public int getValue() {
        return value;
    }
}