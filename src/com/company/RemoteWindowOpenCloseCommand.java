package com.company;

public class RemoteWindowOpenCloseCommand implements Command{
    RemoteWindow remoteWindow;

    public RemoteWindowOpenCloseCommand(RemoteWindow remoteWindow) {
        this.remoteWindow = remoteWindow;
    }

    @Override
    public void execute() {
        remoteWindow.closeOpen();
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
