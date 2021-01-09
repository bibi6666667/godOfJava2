package com.godOfJava2.c24;

import java.util.HashMap;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
    }

    public void checkHashMap() { // HashMap 사용하기
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a"); // put(K,V) : 키K와 값V을 갖는 데이터를 저장한다.
        map.put("A", "1"); // 수정 : 기존의 키로 다른 값을 넣으면, 기존 값에 새로운 값을 덮어씌운다.
        System.out.println(map.get("A")); // get(K) : 키K에 해당하는 값을 리턴한다.
        System.out.println(map.get("B")); // 존재하지 않는 키로 get()을 하는 경우 null을 리턴한다.
    }
}
