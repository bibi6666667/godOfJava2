package com.godOfJava2.c22;

import java.util.ArrayList;
// ArrayList는 java.lang 패키지에 속해 있는 클래스가 아니기 때문에 import를 해야 한다.

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList4();
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

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        // ArrayList에 객체를 넣을 떄는 add()를 사용한다.
        // add(int index, E e)
        // - index (생략가능) : index위치에 객체를 담는다.
        // - e : 담을 객체.
        // list.add(10, "A1"); // IndexOutOfBoundsException - list의 길이는 5인데 10번째 값을 찾으려 하니 예외 발생.

        for (String tempData : list) {
            System.out.println(tempData);
        } // 출력문
        // for (타입이름 임시변수명 : 반복대상객체 { } - Collection 인터페이스를 구현한 모든 클래스에서 사용 가능하다.
    }

    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);
        // addAll() : list2에 list의 모든 객체를 (끝에서부터) 담는다.

        ArrayList<String> list3 = new ArrayList<>(list);
        // 58번 라인과 같은 결과를 도출하는 생성자.
        // ArrayList에는 Collection 인터페이스를 구현한 모든 클래스를 포함시킬 수 있는 생성자가 있다.

        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
        }
    }

    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list;
        list.add("Ooops");
        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
        }
        // 600-601
        // 74번 라인의 ArrayList<String> list2 = list; 선언은 Shallow copy이다.
        // Shallow copy : 다른 객체에 원본 객체의 주소값만을 할당하는 복사. (주솟값 복사)
        // Deep copy : 객체의 모든 값을 복사하여, 복제된 객체에 있는 값을 변경해도 원본에 영향이 없도록 하는 복사. (값 복사)
    }
}
