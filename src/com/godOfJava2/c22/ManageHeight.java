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
        for (int i = 1; i < 6; i++) {
            System.out.println("Class No. : " + i);
            manageHeight.printAverage(i);
        }

    }

    public void setData() {
        ArrayList<Integer> class1 = new ArrayList<Integer>(5);
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);
        gradeHeights.add(0, class1);
        ArrayList<Integer> class2 = new ArrayList<Integer>(4);
        class1.add(160);
        class1.add(165);
        class1.add(167);
        class1.add(186);
        gradeHeights.add(1, class2);
        ArrayList<Integer> class3 = new ArrayList<Integer>(4);
        class1.add(158);
        class1.add(177);
        class1.add(187);
        class1.add(176);
        gradeHeights.add(2, class3);
        ArrayList<Integer> class4 = new ArrayList<Integer>(3);
        class1.add(173);
        class1.add(182);
        class1.add(181);
        gradeHeights.add(3, class4);
        ArrayList<Integer> class5 = new ArrayList<Integer>(5);
        class1.add(170);
        class1.add(180);
        class1.add(165);
        class1.add(177);
        class1.add(172);
        gradeHeights.add(4, class5);
    }

    public void printHeight(int classNo) {
        ArrayList<Integer> classHeights = gradeHeights.get(classNo - 1);
        for (int height : classHeights) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo) {
        int sum = 0;
        int students = 0;
        double classHeightAverage = 0;
        ArrayList<Integer> classHeights = gradeHeights.get(classNo - 1);
        System.out.println(students);
        for (int height : classHeights) {
            sum += height;
        }
        classHeightAverage = sum / students;
        System.out.println("Class No. : " + classNo);
        System.out.println("Height average : " + classHeightAverage);
    }
}
