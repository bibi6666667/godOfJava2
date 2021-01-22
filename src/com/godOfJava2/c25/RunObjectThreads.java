package com.godOfJava2.c25;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        sample.checkThreadState3();
    }

    public void checkThreadState2() {
        Object monitor = new Object(); // StateThread의 매개변수로 넘겨줄 Object클래스 객체 생성
        StateThread thread = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState());
            thread.start(); // 쓰레드 생성 및 시작
            System.out.println("thread state after start = " + thread.getState());
            Thread.sleep(100); // 쓰레드 대기상태
            System.out.println("thread state after 0.1sec = " + thread.getState());
            synchronized (monitor) {
                monitor.notify(); // 객체에 대기중인 쓰레드 깨움 (monitor객체를 통해 notify() 호출)
            }
            Thread.sleep(100); // 대기상태
            System.out.println("thread state after notify = " + thread.getState());
            thread.join(); // 실행 끝날때까지 대기. 쓰레드가 종료될 떄 까지 기다린 후 상태를 출력
            System.out.println("thread state after join = " + thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object monitor = new Object(); // StateThread의 매개변수로 넘겨줄 Object클래스 객체 생성
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState());
            thread.start(); // 쓰레드 생성 및 시작
            thread2.start();
            System.out.println("thread state after start = " + thread.getState());
            Thread.sleep(100); // 쓰레드 대기상태
            System.out.println("thread state after 0.1sec = " + thread.getState());
            synchronized (monitor) {
                //monitor.notify(); // 객체에 대기중인 쓰레드 깨움 (monitor객체를 통해 notify() 호출)
                monitor.notifyAll();
                // notify()메소드는 먼저 대기하고 있던 쓰레드부터 하나씩만 깨워준다. 두 개 대기중이라면 두 번 꺠워줘야 한다.
                // 따라서 대기중인 쓰레드가 여러 개라면 notifyAll()을 사용하는 것이 낫다.
            }
            Thread.sleep(100); // 대기상태
            System.out.println("thread state after notify = " + thread.getState());

            thread.join(); // 실행 끝날때까지 대기. 쓰레드가 종료될 떄 까지 기다린 후 상태를 출력
            System.out.println("thread state after join = " + thread.getState());
            thread2.join();
            System.out.println("thread2 state after join = " + thread2.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
