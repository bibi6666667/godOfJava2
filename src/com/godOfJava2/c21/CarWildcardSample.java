package com.godOfJava2.c21;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
        sample.callBusBoundedWildcardMethod();
    }

    public void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(wildcard);
    }

    public void callBusBoundedWildcardMethod() {
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        // 제한 와일드카드 bounded wildcards : 매개변수로 넘어오는 제네릭 타입의 경계를 지정할 떄 사용한다.
        // "? extends 타입" 의 형태로 사용하며, 제네릭 타입으로 지정된 타입과 그 타입을 상속받은 모든 클래스를 사용할 수 있다는 의미이다.
        // (다른 타입을 제네릭타입으로 선언한 객체는 넘어올 수 없다)
        // 제한 와일드카드 역시 메소드의 조회용 매개변수로만 사용하는 것이 좋다.
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
