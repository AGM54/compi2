import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/test.txt";
        try {
            CharStream input = CharStreams.fromFileName(inputFile);
            MiniLangLexer lexer = new MiniLangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniLangParser parser = new MiniLangParser(tokens);
            ParseTree tree = parser.prog();

            EvalVisitor eval = new EvalVisitor();
            eval.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
