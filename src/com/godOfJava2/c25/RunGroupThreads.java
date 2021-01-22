package com.godOfJava2.c25;
// ThreadGroup와 관련 메소드들
public class RunGroupThreads {
    public static void main(String[] args) {
        RunGroupThreads sample = new RunGroupThreads();
        sample.groupThread();
    }

    public void groupThread() {
        try {
            SleepThread sleep1 = new SleepThread(5000);
            SleepThread sleep2 = new SleepThread(5000);
            ThreadGroup group = new ThreadGroup("Group1"); // ThreadGroup 생성시 그룹명을 지정해야 한다.
            Thread thread1 = new Thread(group, sleep1); // ThreadGroup group에 속하며 sleep1객체의 run()메소드를 수행하는 쓰레드 생성.
            Thread thread2 = new Thread(group, sleep2);

            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            System.out.println("Group name = " + group.getName()); // getName() : 쓰레드 그룹의 이름을 리턴
            int activeCount = group.activeCount(); // activeCount() : 쓰레드 그룹에서 실행중인 쓰레드의 개수 리턴
            System.out.println("Active count = " + activeCount);
            group.list(); // list() : 쓰레드 그룹의 상세 정보 출력

            Thread[] tempThreadList = new Thread[activeCount];
            int result = group.enumerate(tempThreadList);
            // enumerate() : 해당 쓰레드 그룹에 포함된 쓰레드/쓰레드그룹의 목록을 매개변수로 넘어온 배열에 담는다.
            // activeCount()로 현재 실행중인 쓰레드 갯수를 파악한 후, 그 갯수만큼의 배열을 생성해 매개변수로 넘겨줘야 한다.
            System.out.println("Enumerate result = " + result);
            for (Thread thread : tempThreadList) {
                System.out.println(thread);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
