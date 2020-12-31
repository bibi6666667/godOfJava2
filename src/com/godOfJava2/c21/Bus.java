package com.godOfJava2.c21;

public class Bus extends Car{
    public Bus(String name) {
        super(name); // 부모 클래스 Car 의 매개변수 1개를 받는 생성자 호출
    }

    public String toString() { // println의 출력문 지정
        return "Bus name = " + name;
    }
}
