package com.godOfJava2.c22;

import java.util.ArrayList;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>(5);

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        for (int i = 1; i < 6; i++) {
            System.out.println("Class No. : " + i);
            manageHeight.printHeight(i);
        }
    }

    public void setData() {
        ArrayList<Integer> class1 = new ArrayList<Integer>(5);
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);
        gradeHeights.add(class1);
        ArrayList<Integer> class2 = new ArrayList<Integer>(4);
        class1.add(160);
        class1.add(165);
        class1.add(167);
        class1.add(186);
        gradeHeights.add(class2);
        ArrayList<Integer> class3 = new ArrayList<Integer>(4);
        class1.add(158);
        class1.add(177);
        class1.add(187);
        class1.add(176);
        gradeHeights.add(class3);
        ArrayList<Integer> class4 = new ArrayList<Integer>(3);
        class1.add(173);
        class1.add(182);
        class1.add(181);
        gradeHeights.add(class4);
        ArrayList<Integer> class5 = new ArrayList<Integer>(5);
        class1.add(170);
        class1.add(180);
        class1.add(165);
        class1.add(177);
        class1.add(172);
        gradeHeights.add(class5);
    }

    public void printHeight(int classNo) {
        ArrayList<Integer> classHeights = gradeHeights.get(classNo - 1);
        for (int height : classHeights) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        double classHeightAverage = 0;
        double sum = gradeHeights.get(classNo - 1)
        System.out.println("Class No. : " + classNo);
        System.out.println("Height average : " + classHeightAverage);
    }
}
