package com.godOfJava2.c25;

// synchronized method
public class CommonCalculate {
    private int amount; // 인스턴스 변수

    public CommonCalculate() {
        amount = 0;
    }

    public synchronized void plus(int value) {
        amount += value;
    }

    public synchronized void minus(int value) {
        amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
