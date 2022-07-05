package analisadorlexico.src.isilanguage.lexico;

import analisadorlexico.src.isilanguage.exceptions.IsiLexicalException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IsiScanner {
    private char[] content;
    private int state;
    private int position;

    public IsiScanner(String filename) {
        try {
            String txtContent;
            txtContent = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
            System.out.println("DEBUB------------");
            System.out.println(txtContent);
            System.out.println("DEBUB------------");
            content = txtContent.toCharArray();
            position = 0;

        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public Token nextToken() {
        Token token;
        char currentChar;
        StringBuilder term = new StringBuilder();
        if (isEOF()) {
            return null;
        }
        state = 0;
        while (!isEOF()) {
            currentChar = nextChar();
            switch (state) {
                case 0:
                    if (isChar(currentChar)) {
                        term.append(currentChar);
                        state = 1;
                    } else if (isDigit(currentChar)) {
                        state = 3;
                        term.append(currentChar);
                    } else if (isSpace(currentChar)) {
                        state = 0;
                    } else if (!isOperator(currentChar)) {
                        state = 5;
                    } else {
                        throw new IsiLexicalException("Error: " + currentChar + " is not a valid character");
                    }
                    break;
                case 1:
                    if (isChar(currentChar) || isDigit(currentChar)) {
                        term.append(currentChar);
                        state = 1;
                    } else if (isSpace(currentChar) || isOperator(currentChar)) {
                        state = 2;
                    }else {
                        throw new IsiLexicalException("Error: " + currentChar + " is not a valid character/Malformed identifier");
                    }
                    break;
                case 2:
                    back();
                    token = new Token();
                    token.setType(Token.IDENTIFIER);
                    token.setText(term.toString());
                    return token;
                case 3:
                    if (isDigit(currentChar)) {
                        term.append(currentChar);
                        state = 3;
                    } else if(!isChar(currentChar)){
                        state = 4;
                    } else {
                        throw new IsiLexicalException(currentChar + " is not a valid number");
                    }
                    break;
                case 4:
                    back();
                    token = new Token();
                    token.setType(Token.NUMBER);
                    token.setText(term.toString());
                    return token;
                case 5:
                    term.append(currentChar);
                    token = new Token();
                    token.setType(Token.OPERATOR);
                    token.setText(term.toString());
                    return token;
            }
        }
        token = new Token();
        token.setType(Token.IDENTIFIER);
        token.setText(term.toString());
        return token;
    }


    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private boolean isOperator(char c) {
        return c == '>' || c == '<' || c == '=' || c == '!';
    }

    private boolean isSpace(char c) {
        return c == ' ' || c == '\n' || c == '\t' || c == '\r';
    }

    private char nextChar() {
        return content[position++];

    }

    private boolean isEOF() {
        return position == content.length;
    }

    private void back() {
        position--;
    }
}

