package CommandPattern;

import CommandPattern.Commands.Command;
import CommandPattern.Commands.CopyCommand;
import CommandPattern.Commands.CutCommand;
import CommandPattern.Commands.PastCommand;

public class Application {
    public final Editor editor;

    public String clipboard;

    private final CommandHistory history;

    public Application(){
        editor = new Editor();
        history = new CommandHistory();
    }

    public void executeCommand(Command command){
        history.push(command);
        command.execute();
    }

    public void unExecuteCommand(){
        Command command = history.pop();
        if(command != null){
            command.unExecute();
        }
    }

//    main functions

    public void write(String text){
        this.editor.setSelected(text);
        System.out.println("Typing: " + text);
    }

    public void cut(){
        Command cut = new CutCommand(this.editor, this);
        this.executeCommand(cut);
    }

    public void copy(){
        Command copy = new CopyCommand(this.editor, this);
        this.executeCommand(copy);
    }

    public void past(){
        Command past = new PastCommand(this.editor, this);
        this.executeCommand(past);
    }

    public void display(){
        System.out.println("The Editor have: " + this.editor.getSelected());
        System.out.println("The Clipboard have: " + this.clipboard);
        System.out.println("-----------------------------");
    }

}
