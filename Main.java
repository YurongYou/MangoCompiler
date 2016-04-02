import ASTBuilder.ClassCollector;
import ASTBuilder.Field_FunctionCollector;
import CompileException.Undefined;
import Gadgets.Name;
import Gadgets.Symbol.FuncSymbol;
import Gadgets.SymbolTable;
import Syntax.MangoLexer;
import Syntax.MangoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author YurongYou
 *
 * This class is intended to accomplish the main procedure of compiling.
 * Created by Ficos on 16/3/30.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // File Read In
        FileInputStream FileInput = new FileInputStream("MangoTestCase/Parser/basic_test.mx");
        ANTLRInputStream input = new ANTLRInputStream(FileInput);
        MangoLexer lexer = new MangoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MangoParser parser = new MangoParser(tokens);
        ParseTree tree = parser.prog();

        SymbolTable sb = new SymbolTable();
        ClassCollector collector1 = new ClassCollector(sb);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(collector1, tree);

//        try{
//            String[] testcase = {"RedBoy", "Mo", "invalid"};
//            for (String s: testcase) {
//                TypeSymbol type = (TypeSymbol) sb.resolve(Name.getName(s));
//                System.out.println(type.getName());
//            }
//        }
//        catch (Undefined u){
//            System.out.println("Error: No such class");
//        }
        System.out.println(collector1.isAllCorrect());

        Field_FunctionCollector collector2 = new Field_FunctionCollector(sb);
        walker.walk(collector2, tree);

        try {
            String[] testcase = {"travel", "journalists", "xu", "main", "Mo.haha"};
            for (String s : testcase) {
                FuncSymbol func = (FuncSymbol) sb.resolve(Name.getName(s));
                System.out.println(func.getName());
                System.out.println("\t Return Type: " + func.getReturnType());
                System.out.println("\t Formal parameters Type:" + func.getFormalParametersType());
                System.out.println("\t Formal parameters Name:" + func.getFormalParametersName());
            }
        } catch (Undefined u) {
            System.out.println("Error: item not found");
        }
    }
}