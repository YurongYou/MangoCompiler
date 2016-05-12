package cn.ficos.Compiler.ASTBuilder;

import cn.ficos.Compiler.Exceptions.Bug_TextError;
import cn.ficos.Compiler.Exceptions.Redefine;
import cn.ficos.Compiler.Exceptions.Undefined;
import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;
import cn.ficos.Compiler.Gadgets.SymbolTable;
import cn.ficos.Compiler.Gadgets.Type.ClassType;
import cn.ficos.Compiler.Gadgets.Type.Type;
import cn.ficos.Compiler.Syntax.MangoBaseListener;
import cn.ficos.Compiler.Syntax.MangoParser;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static cn.ficos.Compiler.Gadgets.TypeParser.parseType;

/**
 * This class is intended to collect all global functions,
 * class fields and class functions
 * <p>Note that the global SymbolTable should have contained all class declaration
 */
public class Field_FunctionCollector extends MangoBaseListener {
    private SymbolTable global;
    private String nowClass = null;
    private Boolean correct = true;

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
    public void enterClassField(MangoParser.ClassFieldContext ctx) {
        // Analyse the type
        Type fieldType;
        try {
            fieldType = parseType(ctx.type().getText(), global);
        } catch (Undefined err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Using undefined class " + ctx.type().getText());
            correct = false;
            return;
        }

        //The in-class name is <classname>.<varName>
        Name fieldName = Name.getName(nowClass + '.' + ctx.ID().getText());

        //define the variable
        try {
            VarSymbol fieldInfo = new VarSymbol(fieldName, fieldType, VarSymbol.classField);
            global.define(fieldName, fieldInfo);
        } catch (Redefine err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Redefining class field " + ctx.ID().getText()
                    + " in class " + nowClass);
            correct = false;
        }
        try {
            ((ClassType) global.lookUpType(nowClass)).addVar(fieldName, fieldType.variableSize());
        } catch (Undefined undefined) {
            throw new Bug_TextError();
        }
    }

    @Override
    public void enterFuncDecl(MangoParser.FuncDeclContext ctx) {
        // Analyse the function's return type
        Type funcReturnType = null;
        if (ctx.type() != null) {
            try {
                funcReturnType = parseType(ctx.type().getText(), global);
            } catch (Undefined err) {
                System.err.println("line " + ctx.getStart().getLine() + ": Using undefined function return type " +
                        ctx.type().getText());
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
                    formalParameterType.add(parseType(source.type().getText(), global));
                    formalParameterName.add(Name.getName(source.ID().getText()));
                }
            } catch (Undefined err) {
                System.err.println("line " + ctx.getStart().getLine() + ": Using undefined class " + source.type().getText());
                correct = false;
                return;
            }
        } else {
            if (nowClass != null) {
                formalParameterType = new LinkedList<>();
                formalParameterName = new LinkedList<>();
                try {
                    formalParameterType.add(global.lookUpType(nowClass));
                } catch (Undefined e) {
                    throw new Bug_TextError();
                }
                formalParameterName.add(Name.getName("this"));
            }
        }

        //create the function info symbol
        FuncSymbol funcInfo = new FuncSymbol(funcName, funcReturnType,
                formalParameterName, formalParameterType);

        //define the function in global SymbolTable
        try {
            global.define(funcName, funcInfo);
        } catch (Redefine err) {
            System.err.println("line " + ctx.getStart().getLine() + ": Redefining function " + funcName);
            correct = false;
        }
    }

    public Boolean isAllCorrect() {
        return correct;
    }
}