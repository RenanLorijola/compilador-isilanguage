package isilanguage.src.ast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import isilanguage.src.datastructures.IsiSymbol;
import isilanguage.src.datastructures.IsiVariable;

public class CommandAttrib extends AbstractCommand {

    private String id;
    private String expression;

    public CommandAttrib(String id, String expression) {
        this.id = id;
        this.expression = expression;
    }

    @Override
    public String generateJavaCode() {
        // Math.pow(a, b)
        final String regexIdentifier = "[a-z]([a-z]|[A-Z]|[0-9])*";
        final String regexNumber = "[0-9]+(\\.[0-9]+)?";
        final String idOrNumber = regexIdentifier + "|" + regexNumber;
        final String regex = "(?<base>"+ idOrNumber +")\\*\\*(?<potencia>"+ idOrNumber +")";
        final String subst = "Math.pow(${base},${potencia})";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(expression);
        final String modifiedExpression = matcher.replaceAll(subst);
        System.out.println(modifiedExpression);
        // System.out.println(regex);
        return id + " =" + modifiedExpression + ";";
    }

    @Override
    public String toString() {
        return "CommandAttrib{" +
                "id='" + id + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
