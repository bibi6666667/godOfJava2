package com.godOfJava2.c20;

public class JavaLangSystem {
    // System 클래스 : 시스템에 대한 정보를 확인하는 클래스.

    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        sample.systemPropertiesCheck();
    }

    public void systemPropertiesCheck() {
        System.out.println("java.version = " + System.getProperty("java.version"));
    }
    // 시스템 속성값(Property) 관리 메소드 - Properties라는 클래스를 알아야 한다. (Hashtable을 상속받은 클래스 - key, value사용)
    // System.getProperty(String key) : key에 지정된 문자열로 된 시스템 속성값을 얻는다.
    // 예제에서는 "java.version"이라는 key를 통해 시스템 속성값을 가져왔음.
}
