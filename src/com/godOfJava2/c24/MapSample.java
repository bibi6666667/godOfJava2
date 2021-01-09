package com.godOfJava2.c24;

import java.util.HashMap;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        //sample.checkHashMap();
        sample.checkKeySet();
    }

    public void checkHashMap() { // HashMap 사용하기
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a"); // put(K,V) : 키K와 값V을 갖는 데이터를 저장한다.
        map.put("A", "1"); // 수정 : 기존의 키로 다른 값을 넣으면, 기존 값에 새로운 값을 덮어씌운다.
        System.out.println(map.get("A")); // get(K) : 키K에 해당하는 값을 리턴한다.
        System.out.println(map.get("B")); // 존재하지 않는 키로 get()을 하는 경우 null을 리턴한다.
    }

    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a"); // Map에서는 List나 Queue처럼 순서대로 저장되지 않는다(순서보다 키가 중복되지 않는 게 더 중요)
        map.put("C", "c");
        map.put("D", "d");
        Set<String> keySet = map.keySet(); // keySet() : 키의 목록을 Set타입으로 리턴한다. Set의 제네릭은 키와 동일한 타입으로 지정.
        for(String tempKey : keySet) {
            System.out.println(tempKey + " = " + map.get(tempKey));
        }

    }
}
