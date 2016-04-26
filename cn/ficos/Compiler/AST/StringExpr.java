package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;
import cn.ficos.Compiler.IR.Label;

/**
 * The literal string node in AST
 * Created by Ficos on 16/4/2.
 */
public class StringExpr extends ExprStmt {
    String text;
    Label label;

    public StringExpr(String _text, Position _pos) {
        super(SymbolTable.STRING, _pos, new LocalRegister());
        text = _text;
        label = new Label("str");

    }

    public Label getLabel() {
        return label;
    }

    public String getText() {
        return text;
    }
}