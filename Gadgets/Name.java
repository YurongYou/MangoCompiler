package Gadgets;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is intended to serve as a Key in {@link Scope} (which serves as a SymbolTable).
 * <p>Using "==" to compare Name classes is much faster than using ".equals" to compare the Strings <br>
 * <p>
 * Created by Ficos on 16/3/30.
 */
public class Name {
    String Name;
    private static Map<String, Name> dict = new HashMap<String, Name>();

    private Name(String text) {
        Name = text;
    }

    public static Name getName(String text) {
        Name s = dict.get(text);
        if (s == null) {
            s = new Name(text);
            dict.put(text, s);
        }
        return s;
    }
}