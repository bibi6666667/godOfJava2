package com.godOfJava2.c20;

public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint sample = new JavaLangSystemPrint();
        //sample.printStreamCheck();
        sample.printNull();
        //sample.printNullToString();
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

    public void printNull() {
        Object obj = null;
        System.out.println(obj);
        System.out.println(obj + " is object's value");
        new StringBuilder().append(obj).append(" is object's value");
        // print()와 println()으로 객체를 출력하면, toString()이 호출되는 것이 아닌 String의 valueOf()가 호출되고 그 결과를 출력한다.
        // 그래서 null인 객체도 잘 출력되는 것이다.
        // 두 번째 출력문은 null과 문자열을 합쳤는데 왜 예외가 발생하지 않을까? - 컴파일러가 이 문장을 StringBuilder로 변환하기 때문.
        // 29번 라인은 결과적으로 30번 라인과 같이 동작한다.
    }

    public void printNullToString() {
        Object obj = null;
        System.out.println(obj.toString());
        // 이렇게 toString으로 호출해 출력하려 하면 예외가 발생한다 - NullPointerException
        // 왜? toString() 메소드는 null인 객체로 호출할 수 없기 때문.
    }
}

