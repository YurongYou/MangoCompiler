import AST.AST;
import ASTBuilder.ASTBuilder;
import ASTVisitor.Printer;
import Syntax.MangoLexer;
import Syntax.MangoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

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
        FileInputStream FileInput = new FileInputStream("MangoTestCase/compile_error/var-3-5120309049-liaochao.mx");
        ANTLRInputStream input = new ANTLRInputStream(FileInput);
        MangoLexer lexer = new MangoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MangoParser parser = new MangoParser(tokens);
        ParseTree tree = parser.prog();

        ASTBuilder builder = new ASTBuilder(tree);
        AST root = builder.visit(tree);
        PrintStream out = new PrintStream("MangoTestCase/Error/incop-1-5120309049-liaochao.AST");
        Printer print = new Printer(root, out);
        print.print();
    }
}