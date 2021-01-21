package com.godOfJava2.c25;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads sample = new RunMultiThreads();
        sample.runMultiThread();
    }

    public void runMultiThread() {
        RunnableSample[] runnableSamples = new RunnableSample[5];
        ThreadSample[] threadSamples = new ThreadSample[5];
        for (int i = 0; i < 5; i++) {
            runnableSamples[i] = new RunnableSample();
            threadSamples[i] = new ThreadSample();
            new Thread(runnableSamples[i]).start(); // 쓰레드 실행
            threadSamples[i].start();
        }
        System.out.println("RunMultiThreads.runMultiThread() method is ended.");
    }
    // 쓰레드를 시작한 메소드에서 쓰레드에 대해 start()를 호출한 뒤에는, 
    // 쓰레드 클래스의 run() 내용이 끝났는지에 관계없이 그 다음 줄의 코드를 실행한다.
    // 마지막 출력문이 가장 마지막에 수행되지 않는다 & 어떤 쓰레드가 먼저 끝날지는 모른다.
    // 쓰레드가 끝나는 시점 = run()메소드가 종료되면 끝난다.
}
