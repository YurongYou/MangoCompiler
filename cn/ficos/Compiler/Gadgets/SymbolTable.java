package cn.ficos.Compiler.Gadgets;

import cn.ficos.Compiler.Exceptions.Bug_SymbolTableInitializationFault;
import cn.ficos.Compiler.Exceptions.Redefine;
import cn.ficos.Compiler.Exceptions.Undefined;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.Symbol;
import cn.ficos.Compiler.Gadgets.Symbol.TypeSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;
import cn.ficos.Compiler.Gadgets.Type.BuiltInType;
import cn.ficos.Compiler.Gadgets.Type.Type;

import java.util.*;

import static cn.ficos.Compiler.Gadgets.Name.getName;

/**
 * This is the symbol table for reference when building the AST
 * Created by Ficos on 16/3/31.
 */
public class SymbolTable {
    /**
     * this serves as reference to built-in type int
     */
    public static BuiltInType INT = new BuiltInType(getName("int"), CONSTANT.wordSize);
    /**
     * this serves as reference to built-in type string
     */
    public static BuiltInType STRING = new BuiltInType(getName("string"), CONSTANT.wordSize);
    /**
     * this serves as reference to built-in type boll
     */
    public static BuiltInType BOOL = new BuiltInType(getName("bool"), 4);

    private static TypeSymbol IntType = new TypeSymbol(getName("int"), INT);
    private static TypeSymbol StringType = new TypeSymbol(getName("string"), STRING);
    private static TypeSymbol BoolType = new TypeSymbol(getName("bool"), BOOL);

    private static FuncSymbol print = new FuncSymbol(getName("_print"), null, Arrays.asList(getName("arg")), Arrays.asList(STRING));

    private static FuncSymbol println = new FuncSymbol(getName("_println"), null, Arrays.asList(getName("arg")), Arrays.asList(STRING));

    private static FuncSymbol getString = new FuncSymbol(getName("_getString"), STRING, null, null);

    private static FuncSymbol getInt = new FuncSymbol(getName("_getInt"), INT, null, null);

    private static FuncSymbol toString = new FuncSymbol(getName("_toString"), STRING, Arrays.asList(getName("i")), Arrays.asList(INT));

    private static FuncSymbol string_length = new FuncSymbol(getName("_string.length"), INT, Arrays.asList(getName("this")), Arrays.asList(STRING));

    private static FuncSymbol string_substring = new FuncSymbol(getName("_string.substring"), STRING, Arrays.asList(getName("this"), getName("left"), getName("right"))
            , Arrays.asList(STRING, INT, INT));

    private static FuncSymbol string_parseInt = new FuncSymbol(getName("_string.parseInt"), INT, Arrays.asList(getName("this")), Arrays.asList(STRING));

    private static FuncSymbol string_ord = new FuncSymbol(getName("_string.ord"), INT, Arrays.asList(getName("this"), getName("pos")), Arrays.asList(STRING, INT));

    private static FuncSymbol _array_size = new FuncSymbol(getName("_array.size"), INT, Arrays.asList(getName("this")), Arrays.asList(ArrayType.virtualArrayType));

    private static FuncSymbol stringConcatenate = new FuncSymbol(getName("_stringConcatenate"), STRING, Arrays.asList(getName("lhs"), getName("rhs")),
            Arrays.asList(STRING, STRING));

    private static FuncSymbol stringIsEqual = new FuncSymbol(getName("_stringIsEqual"), BOOL, Arrays.asList(getName("lhs"), getName("rhs")),
            Arrays.asList(STRING, STRING));

    private static FuncSymbol stringLess = new FuncSymbol(getName("_stringLess"), BOOL, Arrays.asList(getName("lhs"), getName("rhs")),
            Arrays.asList(STRING, STRING));

    //serve as a dictionary for symbol fetching
    private Map<Name, Stack<Symbol>> dict = new HashMap<>();
    //it counts the currentScope, for detecting the Redefining
    private int currentScope = 0;
    //stores the new defined symbols' name in a scope
    private Stack<Set<Name>> nowScope = new Stack<>();

    public SymbolTable() {
        try {
            initialize();
        } catch (Redefine err) {
            throw new Bug_SymbolTableInitializationFault();
        }
    }

    public static void main(String[] args) throws Redefine, Undefined {
        SymbolTable test = new SymbolTable();
        test.define(getName("ficos"), new VarSymbol(getName("ficos"), INT, VarSymbol.global));
        Symbol yyr1 = test.resolve(getName("ficos"));
        test.beginScope();
        test.define(getName("ficos"), new VarSymbol(getName("ficos"), INT, VarSymbol.global));
        Symbol yyr2 = test.resolve(getName("ficos"));
        System.out.println(yyr1 == yyr2);
        test.endScope();
        yyr2 = test.resolve(getName("ficos"));
        System.out.println(yyr1 == yyr2);
        System.out.println(test.resolve(getName("string.ord")).getName());
    }

    private void initialize() throws Redefine {
//        currentNewSymbols.push(new LinkedList<>());
        nowScope.push(new HashSet<>());

        //define several built-in types in the Global Scope
        define(getName("int"), IntType);

        define(getName("string"), StringType);

        define(getName("bool"), BoolType);

        //define several built-in functions
        //void print(string arg)

        define(getName("print"), print);

        //void println(string arg)
        define(getName("println"), println);

        //string getString()
        define(getName("getString"), getString);

        //int getInt()
        define(getName("getInt"), getInt);

        //string toString(int i)
        define(getName("toString"), toString);

        //int string.length(string this)
        define(getName("string.length"), string_length);

        //string string.substring(string this, int left, int right)
        define(getName("string.substring"), string_substring);

        //int string.parseInt(string this)
        define(getName("string.parseInt"), string_parseInt);

        //int string.ord(string this, int pos)
        define(getName("string.ord"), string_ord);

        //int ~array.size(~array this)
        define(getName("_array.size"), _array_size);

        //string stringConcatenate(string lhs, string rhs)
        define(getName("stringConcatenate"), stringConcatenate);

        //bool stringIsEqual(string lhs, string rhs)
        define(getName("stringIsEqual"), stringIsEqual);

        //bool stringLess(string lhs, string rhs)
        define(getName("stringLess"), stringLess);
    }

    /**
     * To define a name in current scope
     *
     * @param key   the corresponding {@link cn.ficos.Compiler.Gadgets.Name} object
     * @param value the corresponding {@link cn.ficos.Compiler.Gadgets.Symbol} object that contains corresponding information
     * @throws Redefine throw if the key has been defined in current scope
     */
    public void define(Name key, Symbol value) throws Redefine {
//        if (value.getScopeID() != currentScope) throw new FalseSymbol();
        if (nowScope.peek().contains(key)) {
            throw new Redefine();
        }
        Stack<Symbol> entry = dict.get(key);
        if (entry == null) {
            entry = new Stack<>();
            dict.put(key, entry);
            entry.push(value);

        } else {
            entry.push(value);
        }
        nowScope.peek().add(key);
    }

    /**
     * To find a {@link cn.ficos.Compiler.Gadgets.Name}'s corresponding information, which is stored as {@link cn.ficos.Compiler.Gadgets.Symbol}
     *
     * @param key the {@link cn.ficos.Compiler.Gadgets.Name} to be looked up
     * @return the corresponding {@link cn.ficos.Compiler.Gadgets.Symbol}
     * @throws Undefined throw if the key has not been defined in current or formal scopes
     */
    public Symbol resolve(Name key) throws Undefined {
        Stack<Symbol> entry = dict.get(key);
        if (entry == null || entry.isEmpty()) throw new Undefined();
        return entry.peek();
    }

    /**
     * A shortcut for type looking up
     *
     * @param typeName the name of type to look up
     * @return the required type
     * @throws Undefined
     */
    public Type lookUpType(String typeName) throws Undefined {
        return ((TypeSymbol) resolve(getName(typeName))).getType();
    }

    /**
     * @return current scope ID
     */
    public int getCurrentScope() {
        return currentScope;
    }

    /**
     * to begin a new scope, such as entering a class definition, function, compound statement
     */
    public void beginScope() {
        nowScope.push(new HashSet<>());
        currentScope++;
    }

    /**
     * to end a scope, recover previous scope
     */
    public void endScope() {
        for (Name key : nowScope.peek()) {
            dict.get(key).pop();
        }
        nowScope.pop();
        currentScope--;
    }
}