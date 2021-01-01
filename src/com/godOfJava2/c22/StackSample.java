package com.godOfJava2.c22;

import java.util.Stack;
// java.lang의 클래스가 아니기 때문에 import 해주어야 한다.

public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPop();
    }

    public void checkPeek() {
        Stack<Integer> intStack = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            intStack.push(i);
            System.out.println(intStack.peek());
        }
        System.out.println("size = " + intStack.size());
        // Stack 클래스의 메소드들
        // push(E item) : item을 Stack의 가장 위에 저장한다(E).
        // peek() : Stack의 가장 위에 있는 데이터를 리턴한다(E).
        // pop() : Stack의 가장 위에 있는 데이터를 지우고, 리턴한다(E).
        // empty() : 객체가 비어있는지 확인한다 (boolean).
        // search(Object o) : o의 위치를 리턴한다(int).
    }
}
