package com.godOfJava2.c25;

public class EndlessThread extends Thread{
    public void run() {
        while (true) { // 무한반복
            try {
                System.out.println(System.currentTimeMillis()); // 현재 시간을 밀리초 단위로 출력.
                Thread.sleep(1000);
                // 밀리초 단위. 1000 = 1초.
                // sleep()는 Thread에 있는 static 메소드 중 하나.
                // sleep(long millis) : millis 밀리초만큼 대기한다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // sleep()를 사용할 때는 항상 try-catch로 묶고, 적어도 InterruptedException 예외 처리를 해주어야 한다.
            // 왜 ? sleep()는 InterruptedException를 던질 수도 있다고 선언되어 있기 떄문.
        }
    }
}
