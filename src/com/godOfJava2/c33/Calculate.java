package com.godOfJava2.c33;

@FunctionalInterface
// FunctionalInterface 기능적 인터페이스 : 메소드가 하나만 선언되어 있는 인터페이스를 말함.
// 메소드가 두 개 이상이면 기능적 인터페이스가 아니게 되므로 람다식을 사용할 수 없다(컴파일 에러).
// 이를 예방하기 위해 @FunctionalInterface라는 어노테이션을 사용할 수 있다.
interface Calculate {
    int operation(int a, int b);
}
