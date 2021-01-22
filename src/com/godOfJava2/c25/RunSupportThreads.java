package com.godOfJava2.c25;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkJoin();
    }

    public void checkThreadState1() {
        SleepThread thread = new SleepThread(2000); // 스레드를 2초동안 대기시킴
        try {
            System.out.println("thread state = " + thread.getState()); // 상황별 스레드의 상태 확인을 위해 getState() 사용
            thread.start();
            System.out.println("thread state (after start) = " + thread.getState());
            Thread.sleep(1000); // 스레드 시작 후 1초 동안 대기한 후 상태를 출력
            System.out.println("thread state (after 1sec) = " + thread.getState());
            thread.join(); // 실행중인 쓰레드가 끝날때까지 기다림
            thread.interrupt(); // 쓰레드 실행이 끝난 뒤 중지 요청을 보냄
            System.out.println("thread state (after join) = " + thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void checkJoin() {
        SleepThread thread = new SleepThread(2000);
        try {
            thread.start();
            thread.join(500);
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
