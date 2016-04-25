package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.GlobalRegister;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The literal string node in AST
 * Created by Ficos on 16/4/2.
 */
public class StringExpr extends ExprStmt {
    String text;

    public StringExpr(String _text, Position _pos) {
        super(SymbolTable.STRING, _pos, new GlobalRegister());
        text = _text;
    }

    public String getText() {
        return text;
    }
}