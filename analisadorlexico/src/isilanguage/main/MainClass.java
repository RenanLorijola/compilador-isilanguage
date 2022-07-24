package analisadorlexico.src.isilanguage.main;


import analisadorlexico.src.isilanguage.exceptions.IsiLexicalException;
import analisadorlexico.src.isilanguage.exceptions.IsiSyntaxException;
import analisadorlexico.src.isilanguage.lexico.IsiScanner;
import analisadorlexico.src.isilanguage.parser.IsiParser;

public class MainClass {
    public static void main(String[] args) {
        try {
            IsiScanner scanner = new IsiScanner("test.isi");
            IsiParser parser = new IsiParser(scanner);
            parser.E();

            System.out.println("Compilation Successful!");

        } catch (IsiLexicalException err) {
            System.out.println("Lexical Error: " + err.getMessage());
        } catch (IsiSyntaxException err) {
            System.out.println("Syntax Error " + err.getMessage());
        } catch (Exception err) {
            System.out.println("Generic Error: " + err.getMessage());
        }

    }
}

