package CommandPattern;

import CommandPattern.Commands.Command;

import java.util.Stack;

public class CommandHistory {

    private final Stack<Command> commandStack;

    public CommandHistory(){
        commandStack = new Stack<Command>();
    }

    public void push(Command command){
        commandStack.push(command);
    }

    public Command pop(){
        return commandStack.pop();
    }
}
