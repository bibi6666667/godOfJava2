package com.godOfJava2.c23;

import java.util.LinkedList;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList1();
    }

    public void checkLinkedList1() {
        // LinkedList 객체에 데이터를 추가하는 메소드
        LinkedList<String> link = new LinkedList<>();
        link.add("A"); // 뒤
        link.addFirst("B"); // 앞
        System.out.println(link);
        link.offerFirst("C"); // 앞 (offer = add 비슷한 의미)
        System.out.println(link);
        link.addLast("D"); // 뒤
        System.out.println(link);
        link.offer("E"); // 뒤
        System.out.println(link);
        link.offerLast("F"); // 뒤
        System.out.println(link);
        link.push("G"); // 앞!
        System.out.println(link);
        link.add(0,"H"); // 위치지정 - 삽입
        System.out.println(link);
        System.out.println("EX = " + link.set(0, "I")); // 위치지정 - 수정
        System.out.println(link);
    }

}
