package com.godOfJava2.c25;

import java.util.Date;

public class TimerThread extends Thread {

    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {
        for (int i = 0; i < 10; i++) {
            Date date = new Date();
            System.out.print(date.toString());
            System.out.println(System.currentTimeMillis() - (System.currentTimeMillis() % 1000));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

    }
}
