package com.godOfJava2.c20;

public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber sample = new JavaLangNumber();
        sample.numberTypeCheck();
        sample.numberTypeCheck2();
    }

    public void numberTypeCheck() {
        // wrapper클래스(래퍼클래스) :java.lang 패키지의 숫자를 처리하는 클래스.
        // 기본 자료형을 객체로 처리해야 할 필요가 있을 때 사용한다.
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean
        // 모두 Number라는 abstract클래스를 확장한다.
        // 참조자료형이지만 필요시 기본자료형처럼 사용할 수 있다(컴파일러가 자동으로 형변환을 해주기 떄문) - 단, Character클래스 제외
        // 공통 메소드를 제공한다 - 단, Character클래스 제외
        // parse타입이름(), valueOf(). 둘 다 static메소드로, 래퍼클래스를 명시한 뒤 사용해야 한다. Integer.valueOf()

        String value1 = "3";
        String value2 = "5";
        byte byte1 = Byte.parseByte(value1); // String을 byte로 변환
        byte byte2 = Byte.parseByte(value2);
        System.out.println(byte1 + byte2); // 8
        // parse타입이름() : String을 해당 타입으로 변환하여 기본타입으로 리턴한다.

        Integer refInt1 = Integer.valueOf(value1); // String을 Integer로 변환
        Integer refInt2 = Integer.valueOf(value2);
        System.out.println(refInt1 + refInt2 + "7"); // Integer끼리 더하더라도 자동형변환이 일어나 기본타입처럼 더해진다.
        // valueOf() : String을 해당 타입으로 변환하되 참조타입으로 리턴한다.
    }

    public void numberTypeCheck2() {
        // Byte, Short, Integer, Long, Float, Double타입들은 필요시 기본자료형처럼 사용할 수 있다.
        // : new를 사용해 객체를 만들지 않아도 값을 할당하고, 사칙연산도 할 수 있다.
        Integer refInt1, refInt2;
        refInt1 = 100;
        refInt2 = 101;
        System.out.println(refInt1.doubleValue());
        System.out.println(refInt1 + refInt2);
    }
}
