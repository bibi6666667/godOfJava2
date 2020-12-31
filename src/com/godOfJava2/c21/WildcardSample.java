package com.godOfJava2.c21;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();// WildcardGeneric이라는 클래스에 String을 사용하는 제네릭한 객체 생성
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard); // 생성한 객체를 wildcardStringMethod()를 호출할 때 넘겨준다.
    }

    public void wildcardStringMethod(WildcardGeneric<String> c) {
        // 메소드의 매개변수로 제네릭 넘기고 받기.
        String value = c.getWildcard();
        System.out.println(value);
    }
}
