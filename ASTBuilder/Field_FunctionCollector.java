package ASTBuilder;

import CompileException.Redefine;
import CompileException.Undefined;
import Gadgets.Name;
import Gadgets.Symbol.FuncSymbol;
import Gadgets.Symbol.VarSymbol;
import Gadgets.SymbolTable;
import Gadgets.Type.ArrayType;
import Gadgets.Type.Type;
import Syntax.MangoBaseListener;
import Syntax.MangoParser;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * This class is intended to collect all global functions,
 * class fields and class functions
 * <p>Note that the global SymbolTable should have contain all class declaration
 * Created by Ficos on 16/4/2.
 */
public class Field_FunctionCollector extends MangoBaseListener {
    private SymbolTable global;
    private String nowClass = null;
    private Boolean correct = true;

    //help to count a type definition's dimension
    private Type parseType(String type) throws Undefined {
        if (type.lastIndexOf('[') == -1) {
            return global.lookUpType(type);
        }

        //count the dimension of the array type;
        int count = 0;
        int pos;
        while ((pos = type.lastIndexOf('[')) != -1) {
            ++count;
            type = type.substring(0, pos);
        }

        // create the corresponding ArrayType
        ArrayType ans = new ArrayType(global.lookUpType(type));
        for (int i = 1; i < count; ++i) {
            ans = new ArrayType(ans);
        }

        return ans;
    }

    public Field_FunctionCollector(SymbolTable _global) {
        global = _global;
    }

    @Override
    public void enterClassDecl(MangoParser.ClassDeclContext ctx) {
        nowClass = ctx.ID().getText();
    }

    @Override
    public void exitClassDecl(MangoParser.ClassDeclContext ctx) {
        nowClass = null;
    }

    @Override
    public void enterVarDecl(MangoParser.VarDeclContext ctx) {
        // ignore the inner scope varDecl
        if (nowClass == null) return;

        // Analyse the type
        Type fieldType;
        try {
            fieldType = parseType(ctx.type().getText());
        } catch (Undefined err) {
            System.err.println("Used undefined class " + ctx.type().getText() +
                    " at line " + ctx.getStart().getLine());
            correct = false;
            return;
        }

        //The in-class name is <classname>.<varName>
        Name fieldName = Name.getName(nowClass + '.' + ctx.ID().getText());
        if (fieldType != null) {
            VarSymbol fieldInfo = new VarSymbol(0, fieldName, fieldType);
        }

        //define the variable
        try {
            VarSymbol fieldInfo = new VarSymbol(0, fieldName, fieldType);
            global.define(fieldName, fieldInfo);
        } catch (Redefine err) {
            System.err.println("Redefined variable " + ctx.ID().getText()
                    + " in class " + nowClass + " at line " + ctx.getStart().getLine());
            correct = false;
        }
    }

    @Override
    public void enterFuncDecl(MangoParser.FuncDeclContext ctx) {
        // Analyse the function's return type
        Type funcReturnType = null;
        if (ctx.type() != null) {
            try {
                funcReturnType = parseType(ctx.type().getText());
            } catch (Undefined err) {
                System.err.println("Used undefined function return type " +
                        ctx.type().getText() + " at line " + ctx.getStart().getLine());
                correct = false;
                return;
            }
        }

        // Analyse the function's name
        Name funcName;
        if (nowClass == null) {
            funcName = Name.getName(ctx.ID().getText());
        } else {
            funcName = Name.getName(nowClass + '.' + ctx.ID().getText());
        }

        // Analyse the function's parameter list

        List<Type> formalParameterType = null;
        List<Name> formalParameterName = null;

        // with formal parameters
        if (ctx.formalParameterList() != null) {
            MangoParser.FormalParameterListContext ctx2 = ctx.formalParameterList();
            List<MangoParser.FormalParameterContext> sourceList = ctx2.formalParameter();

            formalParameterType = new LinkedList<>();
            formalParameterName = new LinkedList<>();

            MangoParser.FormalParameterContext source = null;
            ListIterator<MangoParser.FormalParameterContext> sourceItr = sourceList.listIterator();
            try {
                while (sourceItr.hasNext()) {
                    source = sourceItr.next();
                    formalParameterType.add(parseType(source.type().getText()));
                    formalParameterName.add(Name.getName(source.ID().getText()));
                }
            } catch (Undefined err) {
                System.err.println("Used undefined class " + source.type().getText()
                        + " at line " + ctx2.getStart().getLine());
                correct = false;
                return;
            }
        }

        //create the function info symbol
        FuncSymbol funcInfo = new FuncSymbol(0, funcName, funcReturnType,
                formalParameterName, formalParameterType);

        //define the function in global SymbolTable
        try {
            global.define(funcName, funcInfo);
        } catch (Redefine err) {
            System.err.println("Redefined function " + funcName + " at line " + ctx.getStart().getLine());
            correct = false;
        }
    }

    public Boolean isAllCorrect() {
        return correct;
    }
}