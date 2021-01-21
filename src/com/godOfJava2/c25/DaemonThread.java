package com.godOfJava2.c25;

public class DaemonThread extends Thread{
    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
            // long 밀리초만큼 대기하는 쓰레드.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
