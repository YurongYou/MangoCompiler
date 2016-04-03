package Syntax;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Ficos on 16/4/3.
 */
public class testListener extends MangoBaseListener {
    @Override
    public void enterArrayCreate(MangoParser.ArrayCreateContext ctx) {
        System.out.println(ctx.getText().substring(3));
    }

    public static void main(String[] args) throws IOException {
        FileInputStream FileInput = new FileInputStream("MangoTestCase/Parser/basic_test.mx");
        ANTLRInputStream input = new ANTLRInputStream(FileInput);
        MangoLexer lexer = new MangoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MangoParser parser = new MangoParser(tokens);
        ParseTree tree = parser.prog();

        testListener test = new testListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(test, tree);
    }
}
