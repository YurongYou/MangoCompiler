import Syntax.MangoBaseVisitor;
import Syntax.MangoLexer;
import Syntax.MangoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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

        MangoBaseVisitor<Void> visitor = new MangoBaseVisitor<>();
        visitor.visit(tree);
    }
}