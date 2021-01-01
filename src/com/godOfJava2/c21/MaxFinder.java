package com.godOfJava2.c21;

public class MaxFinder {
    public static void main(String[] args) {
        MaxFinder maxFinder = new MaxFinder();
        //maxFinder.testGetMax();
        maxFinder.testGetMin();
    }

    public void testGetMax() {
        System.out.println(getMax(1, 2, 3));
        System.out.println(getMax(3, 1, 2));
        System.out.println(getMax(2, 3, 1));
        System.out.println(getMax("a", "b", "c"));
        System.out.println(getMax("b", "c", "a"));
        System.out.println(getMax("a", "b", "c"));
    }

    public <T extends Comparable <T>> T getMax(T ... a) {
        T maxT = a[0];
        for (T tempT : a) {
            if (tempT.compareTo(maxT) > 0) maxT = tempT;
            // Comparable : 자바 객체 정렬 인터페이스. compareTo()가 선언되어 있다. - 더 자세히 공부하기..
            // int compareTo()
            // - 현재 객체 < 파라미터 이면 음수 리턴
            // - 현재 객체 == 파라미터 이면 0 리턴
            // - 현재 객체 > 파라미터 이면 양수 리턴
            // 리턴값이 음수 또는 0일 때 : 두 객체 자리를 그대로 유지, 양수일 때 : 두 요소의 자리를 바꿈
        }
        return maxT;
    }

    public void testGetMin() {
        System.out.println(getMax(1, 2, 3));
        System.out.println(getMax(3, 1, 2));
        System.out.println(getMax(2, 3, 1));
        System.out.println(getMax("a", "b", "c"));
        System.out.println(getMax("b", "c", "a"));
        System.out.println(getMax("a", "b", "c"));
    }

    public <T extends Comparable <T>> T getMin(T ... a) {
        T minT = a[0];
        for (T tempT : a) {
            if (tempT.compareTo(minT) < 0) minT = tempT;
        }
        return minT;
    }
}
