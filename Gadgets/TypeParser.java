package Gadgets;

import Exceptions.Undefined;
import Gadgets.Type.ArrayType;
import Gadgets.Type.Type;

/**
 * This gadget is used for parsing type string such as "int[][][]" to a type object
 * Created by Ficos on 16/4/2.
 */
public class TypeParser {
    public static Type parseType(String type, SymbolTable global) throws Undefined {
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

    public static void main(String[] args) throws Undefined {
        SymbolTable sb = new SymbolTable();
        Type test = parseType("int[][][]", sb);
        System.out.println(test);
    }
}