package com.company;

import java.util.Stack;

public class RemoteControl {
    Command[] onCommands;

    Command undoCommand;
    Command redoCommand;
    Stack<Command> undoStack;
    Stack<Command> redoStack;

    public RemoteControl(){
        onCommands = new Command[3];
        Command noCommand = new noCommand();

        for (int i = 0; i < 3; i++){
            onCommands[i] = noCommand;
        }
        undoCommand = noCommand;
        redoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void undoButtonWasPushed(int slot) {
        undoCommand.execute();
    }

    public void redoButtonWasPushed(int slot) {
        redoCommand.execute();
    }
}
