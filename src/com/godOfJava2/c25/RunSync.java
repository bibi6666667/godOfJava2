package com.godOfJava2.c25;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        runSync.runCommonCalculate();
    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread3 = new ModifyAmountThread(calc, false);
        ModifyAmountThread thread4 = new ModifyAmountThread(calc, false);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            System.out.println("Final value is " + calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // 예상 결과 : 20000 - 20000 = 0.
    // CommonCalculate의 plus()메소드에 synchronized를 추가하지 않은 일반적인 상태에서는 결과가 그때그때 다르게 나온다.
    // 이전 쓰레드의 연산결과로 인스턴스변수 amount값을 바꾸기도 전에 다음 쓰레드가 amount값을 가지고 연산하기 때문에 정확한 결과가 나오지 않음.
    // synchronized : 동일 객체를 참조하는 다른 쓰레드에서 이 메소드를 수행하려고 할 때, 먼저 들어온 쓰레드가 종료될 때 까지 기다리게 하는 예약어.
    // synchronized를 추가한 뒤에는 정상적인 결과가 나온다. -> Thread safe 해 졌다고 한다.
}
