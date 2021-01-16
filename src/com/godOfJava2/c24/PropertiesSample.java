package com.godOfJava2.c24;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        sample.checkProperties();
    }

    public void checkProperties() {
        // Properties클래스 : 자바에서 시스템의 속성을 제공하는 클래스.
        Properties prop = System.getProperties();
        // getProperties() : System클래스의 static메소드 중 하나로, Properties타입의 객체를 리턴함.
        Set<Object> keySet = prop.keySet(); // prop의 keySet을 Set에 담아 출력.
        for (Object tempObject : keySet) {
            System.out.println(tempObject + "=" + prop.get(tempObject));
        }

    }
}
