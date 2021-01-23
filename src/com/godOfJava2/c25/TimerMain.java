package com.godOfJava2.c25;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread();
        thread.start();
    }
}
