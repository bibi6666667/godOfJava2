package com.godOfJava2.c25;

public class RunnableSample implements Runnable{
    @Override
    public void run() {
        System.out.println("This is RunnableSample's run() method.");
    }
    // 쓰레드 생성하는 법 1 - Runnable 인터페이스를 구현한다. Runnable의 메소드는 run() 하나뿐이다.
}
