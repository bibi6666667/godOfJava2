package com.godOfJava2.c25;

public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads sample = new RunEndlessThreads();
        sample.endless();
    }

    public void endless() {
        EndlessThread endlessThread = new EndlessThread();
        endlessThread.start();
    }
    // run()메소드가 끝나지 않으면, 해당 쓰레드 및 애플리케이션은 끝나지 않는다. (예외 - 데몬 쓰레드)
    // 즉, main()메소드의 수행이 끝나더라도 main()이나 다른 메소드에서 시작한 쓰레드가 종료되지 않으면 해당 프로세스는 끝나지 않는다.
    // (예외 - 데몬 쓰레드)
}
