package com.godOfJava2.c21;

public class Car {
    protected String name;

    public Car (String name) {
        this.name = name;
    }

    public String toString() { // println의 출력문 지정
        return "Car name = " + name;
    }
}
