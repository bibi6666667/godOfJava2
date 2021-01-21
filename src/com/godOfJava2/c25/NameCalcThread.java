package com.godOfJava2.c25;

public class NameCalcThread extends Thread{
    private int calcNumber;
    // 쓰레드를 시작할 때 어떤 값을 전달받고 싶으면, 생성자의 매개변수로 받아서 쓰레드 클래스에 인스턴스 변수로 사용한다.
    // calcNumber를 동적으로 지정하여 쓰레드를 시작할 수 있다.

    public NameCalcThread(String name, int calcNumber) {
        super(name);
        this.calcNumber = calcNumber;
    }

    public void run() {
        calcNumber++;
    }
}
