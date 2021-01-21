package com.godOfJava2.c25;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    public void runBasic() {
        RunnableSample runnableSample = new RunnableSample();
        new Thread(runnableSample).start();
        // Runnable인터페이스를 구현한 클래스는 쓰레드로 바로 시작할 수 없다.
        // Thread클래스의 생성자에 Runnable인터페이스를 구현한 객체를 추가하고, new를 붙여 시작해야 한다.

        ThreadSample threadSample = new ThreadSample();
        threadSample.start();
        System.out.println("RunThreads.runBasic() method is ended.");
        // Thread클래스를 확장한 클래스는 쓰레드로 바로 시작할 수 있다.
        // Thread클래스의 객체에 바로 .start()를 붙여 호출할 수 있다.
    }
    // start() : 쓰레드를 시작하는 메소드.
    // run() : 쓰레드가 수행될 때 호출되는 메소드. 우리가 구현하는 메소드에 해당한다.

    // 쓰레드 클래스가 다른 클래스를 확장할 필요가 있을 때는 Runnable인터페이스를 구현하고,
    // 그렇지 않은 경우에는 Thread클래스를 확장하는 것이 편하다.
}
