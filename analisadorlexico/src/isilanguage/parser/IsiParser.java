package analisadorlexico.src.isilanguage.parser;

import analisadorlexico.src.isilanguage.exceptions.IsiSyntaxException;
import analisadorlexico.src.isilanguage.lexico.IsiScanner;
import analisadorlexico.src.isilanguage.lexico.Token;

public class IsiParser {
    private final IsiScanner scanner;
    private Token token;

    public IsiParser(IsiScanner scanner) {
        this.scanner = scanner;
    }

    public void E() {
        T();
        El();

    }

    public void El() {
        token = scanner.nextToken();
        if (token != null) {
            OP();
            T();
            El();
        }
    }

    public void T() {
        token = scanner.nextToken();
        if (token.getType() != Token.IDENTIFIER && token.getType() != Token.NUMBER) {
            throw new IsiSyntaxException("ID or NUMBER Expected!, found "+Token.TEXT[token.getType()]+" ("+token.getText()+") at LINE "+token.getLine()+" and COLUMN "+token.getColumn());
        }

    }

    public void OP() {
        if (token.getType() != Token.OPERATOR) {
            throw new IsiSyntaxException("Operator Expected, found "+Token.TEXT[token.getType()]+" ("+token.getText()+")  at LINE "+token.getLine()+" and COLUMN "+token.getColumn());
        }
    }
}
