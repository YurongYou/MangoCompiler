package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;
import cn.ficos.Compiler.IR.Label;

/**
 * The literal string node in AST.
 * Stores corresponding Label in IR
 */
public class StringExpr extends ExprStmt {
    String text;
    Label label;

    public StringExpr(String _text, Position _pos) {
        super(SymbolTable.STRING, _pos, new LocalRegister());
        text = _text;
        label = new Label("str", true);
    }

    public Label getLabel() {
        return label;
    }

    public String getText() {
        return text;
    }
}