package isilanguage.src.ast;

import java.util.ArrayList;

public class CommandWhile extends AbstractCommand{

    private String condition;
    private ArrayList<AbstractCommand> whileList;

    public CommandWhile(String condition, ArrayList<AbstractCommand> whileList) {
        this.condition = condition;
        this.whileList = whileList;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("while (");
        stringBuilder.append(condition);
        stringBuilder.append(") {\n");
        whileList.forEach(command -> stringBuilder.append(command.generateJavaCode() + "\n"));
        stringBuilder.append("}\n");

        return stringBuilder.toString();
    }
}
