package com.godOfJava2.c25;

public class ModifyAmountThread extends Thread{
    private CommonCalculate calculate;
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate calc, boolean addFlag) {
        this.calculate = calc;
        this.addFlag = addFlag;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            if(addFlag) {
                calculate.plus(1);
            } else {
                calculate.minus(1);
            }
        }
    }
}
