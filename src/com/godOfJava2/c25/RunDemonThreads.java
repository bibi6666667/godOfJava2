package com.godOfJava2.c25;

public class RunDemonThreads {
    public static void main(String[] args) {
        RunDemonThreads sample = new RunDemonThreads();
        sample.runDaemonThread();
    }

    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample demonThread = new ThreadSample();

        System.out.println("thread1 id = " + thread1.getId());
        System.out.println("thread2 id = " + thread2.getId());
        // getId() : 스레드의 고유 ID 리턴 (JVM이 지정)
        System.out.println("thread1 name = " + thread1.getName());
        System.out.println("thread2 name = " + thread2.getName());
        // getName() : 스레드의 이름 리턴
        // setName(String name) : 스레드의 이름 지정
        System.out.println("thread1 priority = " + thread1.getPriority());
        // getPriority() : 스레드의 우선순위 리턴
        // setPriority(int newPriority) : 스레드의 우선순위 지정
        demonThread.setDaemon(true);
        System.out.println("thread1 isDaemon = " + thread1.isDaemon());
        System.out.println("daemonThread isDaemon = " + demonThread.isDaemon());
        // isDaemon() : 스레드가 데몬인지 확인. 맞으면 true
        // setDaemon(boolean on) : 스레드를 데몬으로 설정할지 여부를 지정
    }

    public void runCommonThread() {
        DaemonThread thread = new DaemonThread();
        thread.start(); // 데몬 스레드로 지정하지 않았을 때 - 스레드가 종료될 때 까지 대기 중 상태가 됨.
    }

    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start(); // 데몬 스레드로 지정했을 때 - 스레드 종료 여부와 관계없이 종료됨.
        // 데몬 스레드는 해당 스레드가 종료되지 않아도, 다른 실행중인 일반 스레드가 없다면 멈춰버린다.
    }

}
