package analisadorlexico.src.isilanguage.lexico;

import analisadorlexico.src.isilanguage.exceptions.IsiLexicalException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IsiScanner {
    private char[] content;
    private int state;
    private int position;
    private int line;
    private int column;

    public IsiScanner(String filename) {
        try {
            line = 1;
            column = 0;
            String txtContent;
            txtContent = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
            content = txtContent.toCharArray();
            position = 0;

        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public Token nextToken() {
        char currentChar;
        Token token;
        StringBuilder term = new StringBuilder();
        if (isEOF()) {
            return null;
        }
        state = 0;
        while (true) {
            currentChar = nextChar();
            column++;

            switch (state) {
                case 0:
                    if (isChar(currentChar)) {
                        term.append(currentChar);
                        state = 1;
                    } else if (isDigit(currentChar)) {
                        state = 2;
                        term.append(currentChar);
                    } else if (isSpace(currentChar)) {
                        state = 0;
                    } else if (isOperator(currentChar)) {
                        term.append(currentChar);
                        token = new Token();
                        token.setType(Token.OPERATOR);
                        token.setText(term.toString());
                        token.setLine(line);
                        token.setColumn(column - term.length());
                        return token;
                    } else {
                        throw new IsiLexicalException("Error: \" + currentChar + \" is not a valid character\" at LINE " + line + " and COLUMN " + column);
                    }
                    break;
                case 1:
                    if (isChar(currentChar) || isDigit(currentChar)) {
                        state = 1;
                        term.append(currentChar);
                    } else if (isSpace(currentChar) || isOperator(currentChar) || isEOF(currentChar)) {
                        if (!isEOF(currentChar))
                            back();
                        token = new Token();
                        token.setType(Token.IDENTIFIER);
                        token.setText(term.toString());
                        token.setLine(line);
                        token.setColumn(column - term.length());
                        return token;
                    } else {
                        throw new IsiLexicalException("Malformed Identifier " + term.toString() + " at LINE " + line + " and COLUMN " + column);
                    }
                    break;
                case 2:
                    if (isDigit(currentChar) || currentChar == '.') {
                        state = 2;
                        term.append(currentChar);
                    } else if (!isChar(currentChar) || isEOF(currentChar)) {
                        if (!isEOF(currentChar))
                            back();
                        token = new Token();
                        token.setType(Token.NUMBER);
                        token.setText(term.toString());
                        token.setLine(line);
                        token.setColumn(column - term.length());
                        return token;
                    } else {
                        throw new IsiLexicalException("Unrecognized Number " + term.toString() + " at LINE " + line + " and COLUMN " + column);
                    }
                    break;
            }
        }
    }


    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private boolean isOperator(char c) {
        return c == '>' || c == '<' || c == '=' || c == '!' || c == '+' || c == '-' || c == '*' || c == '/';
    }

    private boolean isSpace(char c) {
        if (c == '\n' || c== '\r') {
            line++;
            column=0;
        }
        return c == ' ' || c == '\n' || c == '\t' || c == '\r';
    }

    private char nextChar() {
        if (isEOF()) {
            return '\0';
        }
        return content[position++];

    }

    private boolean isEOF() {
        return position == content.length;
    }

    private boolean isEOF(char c) {
        return c == '\0';
    }

    private void back() {
        position--;
        column--;
    }
}

