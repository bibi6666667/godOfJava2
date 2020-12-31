package com.godOfJava2.c21;

import java.util.Objects;

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

    public void wildcardStringMethod(WildcardGeneric<?> c) {
        // 메소드의 매개변수로 제네릭 넘기고 받기.
        // 와일드카드 wildcard : 여러 다른 타입으로 선언된 WildcardGeneric객체를 받으려면, 매개변수 제네릭 꺽쇠에 ?를 적어주면 된다. - 어떤 타입이 제네릭이 되더라도 상관없다.
        // 대신, 메소드 내부에서는 해당 타입을 모르므로 Object로 받아야만 한다. 또, 메소드 내에서 instanceof를 통해 해당 타입을 확인해야 한다.
        // 와일드카드는 메소드의 매개변수로만 사용하는 것이 좋다 - 와일드카드로 객체를 선언하면 특정 타입으로 값을 지정할 수 없기 때문(컴파일에러)
        Object value = c.getWildcard();
        if (value instanceof String) {
            System.out.println(value);
        } // ...
    }
}
