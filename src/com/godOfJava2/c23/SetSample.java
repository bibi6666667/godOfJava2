package com.godOfJava2.c23;

import java.util.HashSet;
import java.util.Set;
// Set 는 java.lang의 클래스가 아니므로 따로 import 해 주어야.

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

    public int myGetCarKinds(String[] cars) { // 내가 만든 getCarKinds()
        HashSet<String> carSet = new HashSet<String>();
        for (String car : cars) {
            if (!carSet.contains(car)) carSet.add(car);
        }
        int carKinds = carSet.size();
        return carKinds;
    }

    public int getCarKinds(String[] cars) { // 모범답안 getCarKinds()
        if (cars == null) return 0; // 1. null체크 - NullPointerException 방지
        if (cars.length == 1) return 1; // 2. cars 크기가 1인지 체크 - 배열의 크기가 1이면 확인할 필요가 없이 결과도 1임.
        Set<String> carSet = new HashSet<String>(); // 3. carSet 이라는 HashSet 객체 생성
        for(String car : cars) { // 4. 생성한 carSet 객체에 cars배열의 값들을 하나씩 담음.
            carSet.add(car); // -> ❗❗ Set에 데이터를 담기만 해도 중복을 피해 담아준다 (유일한 자동차이름만 남게 됨)
        }
        int carKinds = carSet.size();
        return carKinds;
    }

}
