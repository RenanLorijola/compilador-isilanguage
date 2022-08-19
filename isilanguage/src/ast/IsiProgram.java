package isilanguage.src.ast;

import isilanguage.src.datastructures.IsiSymbol;
import isilanguage.src.datastructures.IsiSymbolTable;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class IsiProgram {
    private IsiSymbolTable vartable;
    private ArrayList<AbstractCommand> commands;
    private String programName;

    public void generateTarget(){
        generateJavaFile();
        generateCFile();
    }

    private void generateJavaFile(){
        String className = "GeneratedMainClass";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("import java.util.Scanner;\n");
        stringBuilder.append("public class " + className + " {\n");
        stringBuilder.append("public static void main(String args[]){\n");
        stringBuilder.append("Scanner _keyScanner = new Scanner(System.in);\n");
        vartable.getAll().forEach(isiSymbol -> stringBuilder.append(isiSymbol.generateJavaCode() + "\n"));
        commands.forEach(command -> stringBuilder.append(command.generateJavaCode() + "\n"));
        stringBuilder.append("\n");
        stringBuilder.append("}\n");
        stringBuilder.append("}\n");

        try {
            FileWriter fileWriter = new FileWriter(new File(className + ".java"));
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void generateCFile(){
        //TODO
    }

    public static String convertJavaBoolean(String expression){
        return expression.replaceAll("Verdadeiro", "true").replaceAll("Falso", "false");
    }

    public IsiSymbolTable getVartable() {
        return vartable;
    }

    public void setVartable(IsiSymbolTable vartable) {
        this.vartable = vartable;
    }

    public ArrayList<AbstractCommand> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<AbstractCommand> commands) {
        this.commands = commands;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
