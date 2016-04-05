package cn.ficos.Compiler.Gadgets;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is intended to serve as a Key in {@link cn.ficos.Compiler.Gadgets.SymbolTable} (which serves as a SymbolTable).
 * <p>Using "==" to compare Name classes is much faster than using ".equals" to compare the Strings <br>
 * <p>
 * Created by Ficos on 16/3/30.
 */
public class Name {
    private static Map<String, Name> dict = new HashMap<>();
    private String name;

    private Name(String text) {
        name = text;
    }

    public static Name getName(String text) {
        Name s = dict.get(text);
        if (s == null) {
            s = new Name(text);
            dict.put(text, s);
        }
        return s;
    }

    @Override
    public String toString() {
        return name;
    }
}