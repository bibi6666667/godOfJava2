package com.godOfJava2.c25;

public class NameThread extends Thread{
    public NameThread() { // 아무 매개변수 없는 Thread() 생성자를 사용하는 것과 동일하다.
        super("ThreadName"); // 이렇게 생성자를 지정하면, 이후 생성되는 모든 쓰레드의 이름이 "ThreadName"이 된다.
    }

    public NameThread(String name) {
        super(name); // 이렇게 생성자를 지정하면 name의 값에 따라 쓰레드의 이름도 name이 된다.
    }

    public void run() {

    }
}
