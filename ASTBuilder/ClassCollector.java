package ASTBuilder;

import CompileException.Redefine;
import Gadgets.Name;
import Gadgets.Symbol.TypeSymbol;
import Gadgets.SymbolTable;
import Gadgets.Type.ClassType;
import Syntax.MangoBaseListener;
import Syntax.MangoParser;

/**
 * This class is intended to collect all class declaration in source code
 * Created by Ficos on 16/4/2.
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
            System.err.println("Redefine class " + name + " at line " + ctx.getStart().getLine());
            correct = false;
        }
    }

    public Boolean isAllCorrect() {
        return correct;
    }
}