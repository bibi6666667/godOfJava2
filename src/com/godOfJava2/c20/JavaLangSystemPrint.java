package com.godOfJava2.c20;

public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint sample = new JavaLangSystemPrint();
        sample.printStreamCheck();
        sample.printNull();
    }

    public void printStreamCheck() {
        byte b = 127;
        short s = 32767;
        System.out.println(b);
        System.out.println(s);
        printInt(b);
        printInt(s);
        // System.out.print()와 System.out.println() 은 byte타입과 short타입을 매개변수로 받는 메소드가 선언되어 있지 않다.
        // 그러나 둘 다 정수형이므로, int타입을 매개변수로 받는 메소드가 대신 처리해 주게 되어있다. 따라서 문제없이 출력된다.
    }

    public void printInt(int value) {
        System.out.println(value);
    }

    
}

