package com.godOfJava2.c22;

import java.util.ArrayList;
// ArrayList는 java.lang 패키지에 속해 있는 클래스가 아니기 때문에 import를 해야 한다.

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList1();
    }

    public void checkArrayList1() {
        ArrayList<String> list1 = new ArrayList<String>();
        // ArrayList는 확장 가능한 배열이다.
        // 보통은 한 종류의 객체만 저장하며, 제네릭을 사용해 선언한다.
        // 서로 다른 종류의 객체를 하나의 객체에 담을 때는 DTO를 사용하는 것이 좋다.

        list1.add("ArrayListSample");
        //list1.add(new Object());
        //list1.add(new Double(1));
        // 데이터를 넣을 때는 add()를 사용한다.

        ArrayList<String> list2 = new ArrayList<>(100);
        // ArrayList선언시 매개변수를 지정하지 않으면 초기크기는 10이다. 10개 이상의 데이터를 넣을 때는 크기를 늘이는 작업이 수행된다.
        // 성능에 영향을 줄 수 있으므로 초기 크기가 어느정도 예상될 때에는 예상치로 지정하는 것이 좋다.
    }
}
