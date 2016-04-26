package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The literal int node in AST
 * Created by Ficos on 16/4/2.
 */
public class IntExpr extends ExprStmt {
    private int value;

    public IntExpr(String text, Position _pos) {
        super(SymbolTable.INT, _pos, new Constant(Integer.parseInt(text)));
        value = Integer.parseInt(text);
    }

    public IntExpr(int _value, Position _pos) {
        super(SymbolTable.INT, _pos, new Constant(_value));
        value = _value;
    }

    public static void main(String[] args) {
        IntExpr i = new IntExpr("2147483648", new Position(1));
        System.out.println(i.getValue());
    }

    public int getValue() {
        return value;
    }
}