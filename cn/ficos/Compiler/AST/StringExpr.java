package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The literal string node in AST
 * Created by Ficos on 16/4/2.
 */
public class StringExpr extends ExprStmt {
    String text;

    public StringExpr(String _text, Position _pos) {
        super(SymbolTable.STRING, _pos);
        text = _text;
    }

    //TODO: specify the reg of a string
    public String getText() {
        return text;
    }
}