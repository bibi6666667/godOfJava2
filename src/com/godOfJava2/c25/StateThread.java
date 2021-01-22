package com.godOfJava2.c25;

public class StateThread extends Thread{
    private Object monitor;

    public StateThread(Object monitor) {
        this.monitor = monitor; // monitor라는 객체를 매개변수로 받아 인스턴스변수로 선언
    }

    public void run() {
        try {
            for (int i = 0; i < 10000; i++) { // 스레드를 실행중인 상태로 만들기 위해 만 번 루프를 돌며 String객체 생성
                String a = "A";
            }
            synchronized (monitor) {
                monitor.wait(); // synchronized블록 내에서 monitor객체의 wait() 호출 (대기)
                // wait()메소드가 호출되면 쓰레드의 상태는 대기(WAITING)상태가 된다.
                // WAITING 상태의 쓰레드는 누군가가 깨워 줘야만 풀 수 있다 - interrupt()또는 notify().
            }
            System.out.println(getName() + " is notified");
            Thread.sleep(1000); // wait()가 끝나면 1초간 대기하다가 쓰레드 종료.
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
