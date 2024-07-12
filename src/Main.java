import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "src/test.txt";
        try {
            CharStream input = CharStreams.fromFileName(inputFile);
            MiniLangLexer lexer = new MiniLangLexer(input);

            // Manejo de errores en el lexer
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("Lexer error at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniLangParser parser = new MiniLangParser(tokens);

            // Manejo de errores en el parser
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("Parser error at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            ParseTree tree = parser.prog();

            if (parser.getNumberOfSyntaxErrors() == 0) {
                EvalVisitor eval = new EvalVisitor();
                eval.visit(tree);
            } else {
                System.err.println("Parsing failed due to syntax errors.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
