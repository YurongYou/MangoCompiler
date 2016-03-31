package Gadgets.Scope;

import CompileException.Redefine;
import Gadgets.Name;
import Gadgets.Symbol.FuncSymbol;
import Gadgets.Symbol.TypeSymbol;
import Gadgets.Type.BuiltInType;

import java.util.Arrays;

/**
 * The scope that initially root of AST ({@link AST.Program}) has, with several builtInType initialized
 * Created by Ficos on 16/3/31.
 */
public class GlobalScope extends Scope {
    public static BuiltInType INT = new BuiltInType();
    public static BuiltInType STRING = new BuiltInType();
    public static BuiltInType BOOL = new BuiltInType();

    public GlobalScope() throws Redefine {
        super(null);
        //define several built-in type in the Global Scope
        TypeSymbol IntType = new TypeSymbol(this, INT);
        define(Name.getName("int"), IntType);

        TypeSymbol StringType = new TypeSymbol(this, STRING);
        define(Name.getName("string"), StringType);

        TypeSymbol BoolType = new TypeSymbol(this, BOOL);
        define(Name.getName("bool"), BoolType);

        //define several built-in function
        //void print(string arg)
        FuncSymbol print = new FuncSymbol(this, null, Arrays.asList(Name.getName("arg")), Arrays.asList(STRING));
        define(Name.getName("print"), print);

        //void println(string arg)
        FuncSymbol println = new FuncSymbol(this, null, Arrays.asList(Name.getName("arg")), Arrays.asList(STRING));
        define(Name.getName("println"), println);

        //string getString()
        FuncSymbol getString = new FuncSymbol(this, STRING, null, null);
        define(Name.getName("getString"), getString);

        //int getInt()
        FuncSymbol getInt = new FuncSymbol(this, INT, null, null);
        define(Name.getName("getInt"), getInt);

        //string toString(int i)
        FuncSymbol toString = new FuncSymbol(this, STRING, Arrays.asList(Name.getName("i")), Arrays.asList(INT));
        define(Name.getName("toString"), toString);

        //int string.length()
        FuncSymbol string_length = new FuncSymbol(this, INT, null, null);
        define(Name.getName("string.length"), string_length);

        //string string.substring(int left, int right)
        FuncSymbol string_substring = new FuncSymbol(this, STRING, Arrays.asList(Name.getName("left"), Name.getName("right"))
                , Arrays.asList(INT, INT));
        define(Name.getName("string.substring"), string_substring);

        //int parseInt()
        FuncSymbol string_parseInt = new FuncSymbol(this, INT, null, null);
        define(Name.getName("string.parseInt"), string_parseInt);

        //int ord(int pos)
        FuncSymbol string_ord = new FuncSymbol(this, INT, Arrays.asList(Name.getName("pos")), Arrays.asList(INT));
        define(Name.getName("string.ord"), string_ord);
    }
}