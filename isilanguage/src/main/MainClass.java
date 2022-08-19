package isilanguage.src.main;


import isilanguage.src.exceptions.IsiSemanticException;
import isilanguage.src.parser.IsiLangLexer;
import isilanguage.src.parser.IsiLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class MainClass {
    public static void main(String[] args) {
        try {
            IsiLangLexer lexer;
            IsiLangParser parser;

            lexer = new IsiLangLexer(CharStreams.fromFileName("test.isi"));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            parser = new IsiLangParser(tokenStream);

            parser.program();
            System.out.println("Success!");
            parser.exibeComandos();
            parser.generateCode();
        }
        catch (IsiSemanticException e) {
            System.err.println("Error: " + e.getMessage());
        }
        catch (Exception err) {
            System.err.println("Generic Error: " + err.getMessage());
        }

    }
}

