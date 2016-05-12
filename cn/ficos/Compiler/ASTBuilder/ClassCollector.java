package cn.ficos.Compiler.ASTBuilder;

import cn.ficos.Compiler.Exceptions.Redefine;
import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Symbol.TypeSymbol;
import cn.ficos.Compiler.Gadgets.SymbolTable;
import cn.ficos.Compiler.Gadgets.Type.ClassType;
import cn.ficos.Compiler.Syntax.MangoBaseListener;
import cn.ficos.Compiler.Syntax.MangoParser;


/**
 * This class is intended to collect all class declaration in source code
 */
public class ClassCollector extends MangoBaseListener {
    private SymbolTable global;
    private Boolean correct = true;

    public ClassCollector(SymbolTable _global) {
        global = _global;
    }

    @Override
    public void exitClassDecl(MangoParser.ClassDeclContext ctx) {
        Name name = Name.getName(ctx.ID().getText());
        ClassType newType = new ClassType(name);
        TypeSymbol newTypeInfo = new TypeSymbol(name, newType);
        try {
            global.define(name, newTypeInfo);
        } catch (Redefine exc) {
            System.err.println("line " + ctx.getStart().getLine() + ": Redefining class " + name);
            correct = false;
        }
    }

    public Boolean isAllCorrect() {
        return correct;
    }
}