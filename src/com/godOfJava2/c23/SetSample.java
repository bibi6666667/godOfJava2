package com.godOfJava2.c23;

import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[] {
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "The Beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars) {
        HashSet<String> carSet = new HashSet<String>();
        for (String car : cars) {
            if (!carSet.contains(car)) carSet.add(car);
        }
        int carKinds = carSet.size();
        return carKinds;
    }
}
