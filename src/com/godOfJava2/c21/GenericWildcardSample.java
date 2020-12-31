package com.godOfJava2.c21;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();
        sample.callGenericMethod();
    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
        // 메소드를 제네릭하게 선언하기.
        // 리턴타입 앞에 <> 로 제네릭 타입을 선언하고, 매개변수에서는 그 제네릭타입이 포함된 객체를 받아 처리함. setWildcard()로 값 할당도 가능.
        // 이렇게 메소드를 제네릭하게 선언하면, 매개변수로 사용된 객체에 값을 할당할 수 있다.
        // wildcard ? 처럼 타입을 불명확하게 적는 것보다, 이렇게 명시적으로 메소드선언시 타입을 지정하면 더 견고한 코드 작성 가능.
    }

    public void callGenericMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        genericMethod(wildcard, "Data");
    }

    public <T extends Car> void boundedGenericMethod(WildcardGeneric<T> c, T addvalue) {
        // 제한 와일드카드 bounded wildcards 처럼 사용하는 것도 가능.
    }

    public <S, T extends Car> void multiGenericMethod(WildcardGeneric<T> c, T addvalue, S another) {
        // 제네릭 타입이 두 개 이상일 때는 선언시 콤마로 구분해 나열하면 된다.
    }
}
