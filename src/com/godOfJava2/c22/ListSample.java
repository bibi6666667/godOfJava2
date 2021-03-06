package com.godOfJava2.c22;

import java.util.ArrayList;
// ArrayList는 java.lang 패키지에 속해 있는 클래스가 아니기 때문에 import를 해야 한다.

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList9();
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

    public void checkArrayList5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        int listSize = list.size();
        for (int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get(" + loop + ") = " + list.get(loop));
        }
        // size() : ArrayList에 들어가 있는 데이터의 객수를 리턴한다. Collection 인터페이스를 구현한 모든 객체에서 사용 가능
        // get() : 매개변수에 지정한 위치에 있는 데이터를 리턴한다.
        // indexOf() : 매개변수와 동일한 데이터의 위치를 리턴한다. (리스트의 앞에서부터 찾는다)
        // lastIndexOf() : 매개변수와 동일한 마지막 데이터의 위치를 리턴한다. (리스트의 뒤에서부터 찾는다)
    }

    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);
        // toArray(T[] a) : ArrayList객체의 값들을 T타입의 배열로 만든다.
        // T[] a는 생략할 수 있지만, 생략하면 Object[]로만 리턴되므로 제네릭을 사용한 ArrayList를 변환할 때는 T[] a를 작성해야.
        // 102 line - new String[0] 처럼 매개변수로 넘긴 객체에 타입을 지정하고 값도 담아주는 게 좋다.
        // ArrayList 데이터크기 > 매개변수 일 경우 배열의 모든 값이 null이 되기 떄문. -> checkArrayList7()
    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[3]; // A B C (정상출력)
        // String[] tempArray = new String[5]; // A B C null null
        // -> ArrayList < 배열 이면 toString()으로 담았을 때 빈 자리는 null로 채워진다.
        // String[] tempArray = new String[2]; // null null -> 왜 안되지;
        // -> ArrayList > 배열 이면 toString()으로 담을 수 없으므로 모두 null로 채워진다.
        String[] strList = list.toArray(tempArray); // list를 tempArray 형식의 배열로 만든다.
        for (String temp : strList) {
            System.out.println(temp);
        }
    }

    public void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        //System.out.println("Removed " + list.remove(0)); // Removed A B C A

        //System.out.println(list.remove("A")); // true B C A

        //ArrayList<String> temp = new ArrayList<String>();
        //temp.add("A");
        //list.removeAll(temp); // B C

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }
        // remove(int index 또는 Object o) : 지정 인덱스 또는 지정 객체와 동일한 데이터를 삭제하고, 삭제한 데이터를 리턴한다.
        // removeAll(Collection<?> c) : 매개변수로 넘어온 컬렉션 객체에 있는 데이터와 동일한 모든 데이터를 삭제한다.
        // clear() : 모든 데이터를 삭제
    }

    public void checkArrayList9() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.set(0, "Z"));
        for (String tempData : list) {
            System.out.println(tempData);
        }
        // set(int index, E element) : index 위치의 데이터를 element로 변경하고, index 위치에 있었던 데이터를 리턴한다.
        // 데이터를 삭제remove(), 추가add() 하는 대신 set()로 한 번에 수정이 가능하다.
    }
}
