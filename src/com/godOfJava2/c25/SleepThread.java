package com.godOfJava2.c25;

public class SleepThread extends Thread{
    long sleepTime;
    public SleepThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void run() {
        try {
            System.out.println("Sleeping " + getName());
            Thread.sleep(sleepTime);
            System.out.println("Stopping " + getName());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
