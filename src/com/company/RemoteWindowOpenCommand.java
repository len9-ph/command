package com.company;

public class RemoteWindowOpenCommand implements Command{
    RemoteWindow remoteWindow;

    public RemoteWindowOpenCommand(RemoteWindow remoteWindow) {
        this.remoteWindow = remoteWindow;
    }

    @Override
    public void execute() {
        remoteWindow.open();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
