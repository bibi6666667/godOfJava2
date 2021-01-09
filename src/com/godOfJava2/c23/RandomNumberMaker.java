package com.godOfJava2.c23;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker thisClass = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            HashSet<Integer> numSet = thisClass.getSixNumber();
            System.out.print("[");
            for (int tempInt : numSet) {
                System.out.print(tempInt + ", ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> randomNumSet = new HashSet<>();
        Random random = new Random();
        while (true) {
            int randomNum = random.nextInt(45);
            randomNumSet.add(randomNum);
            if (randomNumSet.size() == 6) break;
        }
        return randomNumSet;
    }
}
