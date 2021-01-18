package com.godOfJava2.c33;

public class LambdaSample {
    public static void main(String[] args) {
        LambdaSample sample = new LambdaSample();
        sample.calculateLambda();
    }

    private void calculateClassic() { // Calculate인터페이스를 익명클래스로 구현하기.
        Calculate calculateAdd = new Calculate() { // 인터페이스 Calculate를 익명 클래스 객체 calculateAdd를 생성해 구현함.
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(calculateAdd.operation(1, 2));
    }

    private void calculateLambda() { // Calculate인터페이스를 람다식으로 구현하기.
        Calculate calculateAdd = (a,b) -> a + b; // calculateAdd를 익명클래스 대신 람다식으로 처리한 것.
        System.out.println(calculateAdd.operation(1, 2));
        // (a, b) : Calculate 인터페이스는 메소드가 하나만 선언되어 있기 때문에, (a, b)는 operation()메소드의 int a와 int b를 매개변수로 받는다는 의미임.
        // -> a + b; : operation()메소드의 결과로 a와 b를 더한 값을 리턴한다는 의미임.
        // 변수명 (a, b)은 임의로 선언해도 상관없다.

        Calculate calculateSubstract = (a, b) -> a - b; // 빼기를 처리하는 람다 표현식 만들어 보기.
        System.out.println(calculateSubstract.operation(1, 2));
    }


}
