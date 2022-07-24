package isilanguage.src.main;


import isilanguage.src.exceptions.IsiLexicalException;
import isilanguage.src.exceptions.IsiSyntaxException;
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

        } catch (Exception err) {
            System.out.println("Generic Error: " + err.getMessage());
        }

    }
}

