package com.godOfJava2.c33;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("건빵", 32, 81, 75));
        sample.printStudentNames(studentList);
    }

    public void printStudentNames(List<StudentDTO> students) {
        students.stream().forEach(student -> System.out.println(student.getName()));
        // 위 코드는 아래 코드와 같다.
        for (StudentDTO student : students) System.out.println(student.getName());
        // stream() - stream을 생성한다.
        // stream 메소드 - forEach(). for문을 수행하는 것처럼 컬렉션에서 각각의 항목을 꺼낸다.

        students.stream().map(student -> student.getName()).forEach(name -> System.out.println(name));
        // stream 메소드 - map(). 데이터를 특정 데이터로 변환한다. 즉 StudentDTO객체가 아닌 String타입의 name객체로 사용하겠다는 의미.

        students.stream().map(student -> student.getAge()).forEach(age -> System.out.println(age));
        students.stream().map(student -> student.getScoreMath()).forEach(mathScore -> System.out.println(mathScore));
        students.stream().map(student -> student.getScoreEnglish()).forEach(englishScore -> System.out.println(englishScore));
    }
}
