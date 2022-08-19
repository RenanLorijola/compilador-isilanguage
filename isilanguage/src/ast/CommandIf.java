package isilanguage.src.ast;

import java.util.ArrayList;

public class CommandIf extends AbstractCommand {

    private String condition;
    private ArrayList<AbstractCommand> ifList;
    private ArrayList<AbstractCommand> elseList;

    public CommandIf(String condition, ArrayList<AbstractCommand> ifList, ArrayList<AbstractCommand> elseList) {
        this.condition = condition;
        this.ifList = ifList;
        this.elseList = elseList;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("if (");
        stringBuilder.append(condition);
        stringBuilder.append(") {\n");
        ifList.forEach(command -> stringBuilder.append(command.generateJavaCode() + "\n"));
        stringBuilder.append("}\n");
        if(!elseList.isEmpty()) {
            stringBuilder.append("else {\n");
            elseList.forEach(command -> stringBuilder.append(command.generateJavaCode() + "\n"));
            stringBuilder.append("}\n");
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "CommandIf{" +
                "condition='" + condition + '\'' +
                ", ifList=" + ifList +
                ", elseList=" + elseList +
                '}';
    }
}
