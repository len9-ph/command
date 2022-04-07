package com.company;

public class RemoteWindow {
    public static final int CLOSE = 0;
    public static final int CLOSEOPEN = 1;
    public static final int OPEN = 2;
    int condition;

    public void close(){
        condition = CLOSE;
        System.out.println("Close");
    }

    public void closeOpen(){
        condition = CLOSEOPEN;
        System.out.println("Close/Open");
    }

    public void open(){
        condition = OPEN;
        System.out.println("Open");
    }

    public int getCondition() {
        return condition;
    }
}
