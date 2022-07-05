package analisadorlexico.src.isilanguage.main;


import analisadorlexico.src.isilanguage.exceptions.IsiLexicalException;
import analisadorlexico.src.isilanguage.lexico.IsiScanner;
import analisadorlexico.src.isilanguage.lexico.Token;

public class MainClass {
    public static void main(String[] args) {
        try {
            IsiScanner scanner = new IsiScanner("test.isi");
            Token token = null;

            do {
                token = scanner.nextToken();
                if (token != null) {
                    System.out.println(token);
                }

            } while (token != null);
        } catch (IsiLexicalException err) {
            System.out.println("Lexical Error: " + err.getMessage());
        } catch (Exception err) {
            System.out.println("Generic Error: " + err.getMessage());
        }

    }
}

