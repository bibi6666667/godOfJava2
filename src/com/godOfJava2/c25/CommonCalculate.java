package com.godOfJava2.c25;

// synchronized method
public class CommonCalculate {
    private int amount; // 인스턴스 변수
    private int interest;
    private Object lock = new Object();
    private Object interestLock = new Object();

    public CommonCalculate() {
        amount = 0;
    }

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void plus(int value) {
        synchronized (this) {
            amount += value;
        }
        // synchronized statements 또는 synchronized블록
        // synchronized(Object) { ... } : 하나의 Object를 사용하여 중괄호 내의 문장을 하나의 쓰레드만 수행하도록 한다.
        // 중괄호 내의 연산만 synchronized처리하려고 할 때 쓰인다. 소괄호에는 잠금처리를 하기 위한 객체를 선언한다.
        // (Object) 의 역할은 문지기 - 하나의 쓰레드만 일하도록 허용한다.
        // 두 개 이상의 synchronized 블록을 처리할 때는 각각 다른 lock객체를 사용하는 것이 효율적이다.
        // (한 블록은 기다리더라도 다른 블록은 처리할 수 있게)
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

