package isilanguage.src.ast;

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
        return id + " =" + expression + ";";
    }

    @Override
    public String toString() {
        return "CommandAttrib{" +
                "id='" + id + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
