package com.godOfJava2.c25;

// synchronized method
public class CommonCalculate {
    private int amount; // 인스턴스 변수

    public CommonCalculate() {
        amount = 0;
    }

    public void plus(int value) {
        synchronized (this) {
            amount += value;
        }
        // synchronized statements 또는 synchronized블록
        // synchronized(Object) { ... } : 하나의 Object를 사용하여 중괄호 내의 문장을 하나의 쓰레드만 수행하도록 한다.
        // 중괄호 내의 연산만 synchronized처리하려고 할 때 쓰인다. 소괄호에는 잠금처리를 하기 위한 객체를 선언한다.
        // (Object) 의 역할은 문지기 - 하나의 쓰레드만 일하도록 허용한다.
    }

    public void minus(int value) {
        synchronized (this) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}

