package com.godOfJava2.c25;

import java.util.Date;

public class TimerThread extends Thread {

    public void run() {
        printCurrentTimeFirst();
        printCurrentTime();
    }

    public void printCurrentTimeFirst() {
        for (int i = 0; i < 10; i++) {
            Date date = new Date();
            System.out.print(date.toString() + " ");
            System.out.println(System.currentTimeMillis() - (System.currentTimeMillis() % 1000));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void printCurrentTime() {
        try {
            int count = 0;
            while (count < 10) {
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime) + " " + currentTime);
                Thread.sleep(900);
                reduceTimeGap();
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reduceTimeGap() {
        long currentTime = System.currentTimeMillis();
        long timeMod = currentTime % 1000;
        try {
            Thread.sleep(1000 - timeMod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
