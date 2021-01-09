package com.godOfJava2.c24;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        //sample.checkHashMap();
        //sample.checkKeySet();
        //sample.checkValues();
        //sample.checkHashMapEntry();
        //sample.checkContains();
        sample.checkRemove();
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

    public void checkValues() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("C", "c");
        map.put("D", "d");
        Collection<String> values = map.values();
        // values() : HashMap에 담긴 값의 목록을 Collection타입으로 리턴. (Collection을 import해야 함)
        for(String tempValue : values) {
            System.out.println(tempValue);
        }
    }

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> tempEntry: entries) {
            System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
        }
        // entrySet() : Map에 선언된 Entry객체를 Set타입으로 리턴한다. Entry에는 단 하나의 키와 값만 저장된다.
        // 리턴된 Set에는 Entry타입으로 데이터가 저장된다.
        // Entry의 getKey()를 사용하면 키를, getValue()를 사용하면 값을 가져올 수 있다.
    }

    public void checkContains() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
        // containsKey(K) : 키K가 존재하면 true, 존재하지 않으면 false를 리턴한다. 
        // containsValue(V) : 값V이 존재하면 true, 존재하지 않으면 false를 리턴한다.
    }

    public void checkRemove() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.remove("A"); // remove(K) : 해당 키를 갖는 데이터를 삭제한다.
        System.out.println(map.size()); // size() : 데이터의 개수를 리턴한다 - Map인터페이스를 구현한 클래스들의 공통 메서드.
    }
}
