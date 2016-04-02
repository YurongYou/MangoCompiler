package Gadgets.Type;

import Gadgets.Name;
import Gadgets.Symbol.FuncSymbol;
import Gadgets.Symbol.VarSymbol;
import Gadgets.SymbolTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Type for user defined class.
 * It stores all class information, including all class variable, class functions
 * Remember to call ".equals(Type rhs)" to compare types
 * Created by Ficos on 16/3/30.
 */
public class ClassType extends Type {

    private Map<Name, FuncSymbol> funcDict = new HashMap<>();
    private Map<Name, VarSymbol> varDict = new HashMap<>();
    private Name className;

    /**
     * Creation of a ClassType. Note that every class will only be created once.
     * variables and functions information will be filled later
     */
    public ClassType(Name _className) {
        className = _className;
    }

    public Name getName() {
        return className;
    }

    @Override
    public String toString() {
        return className.toString();
    }

    public void includeFields(Name fieldName, VarSymbol fieldSymbol) {
        varDict.put(fieldName, fieldSymbol);
    }

    public void includeFunc(Name funcName, FuncSymbol funcSymbol) {
        funcDict.put(funcName, funcSymbol);
    }

    public VarSymbol getField(Name field) {
        return varDict.get(field);
    }

    public FuncSymbol getFunc(Name func) {
        return funcDict.get(func);
    }

    @Override
    public Boolean isSuitableAs(Type rhs) {
        return (this == rhs);
    }


    public static void main(String[] args) {
        ClassType ficos = new ClassType(Name.getName("ficos"));
        Name lv = Name.getName("lv");
        VarSymbol lv_info = new VarSymbol(0, lv, SymbolTable.STRING);
        ficos.includeFields(lv, lv_info);
        System.out.println(ficos.getField(lv) != null);
    }
}