package com.godOfJava2.c24;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();
    }

    public void getRandomNumberStatistics() {
        int randomNum;
        for (int i = 0; i < 5000; i++) {
            Random random = new Random();
            randomNum = random.nextInt(50);
            putCurrentNumber(randomNum);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {
        if (!hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, 1);
        } else if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keyset = hashtable.keySet();
        for (int key : keyset) {
            System.out.print(key + "=" + hashtable.get(key) + " ");
            if (key % 10 -1 == 0) System.out.println();
        }
    }
}
