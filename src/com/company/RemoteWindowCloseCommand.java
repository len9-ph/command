package com.company;

public class RemoteWindowCloseCommand implements Command{
    RemoteWindow remoteWindow;

    public void RemoteWindowCloseCommand(RemoteWindow remoteWindow) {
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
