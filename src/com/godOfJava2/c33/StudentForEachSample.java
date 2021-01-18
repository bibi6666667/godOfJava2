package com.godOfJava2.c33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("건빵", 32, 81, 75));
        sample.multipleStudentScore();
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

    public void multipleStudentScore() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 위 숫자들을 모두 3배해서 출력하려고 할 떄.
        for(int value : intList) {
            System.out.println(value * 3); // for문 사용하기.
        }
        // stream사용하기
        intList.stream().forEach(aInt -> System.out.println(aInt * 3)); // 출력할 때만 *3.
        intList.stream().map(aInt -> aInt * 3).forEach(System.out::println); // stream의 값 자체를 *3한 것으로 변환.
        // map()을 사용하면 스트림의 값 자체를 바꿀 수 있다.

        // map()은 객체도 변경 가능하다.
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("건빵", 32, 81, 75));
        // 이름만 뽑아서 List로 만들고 싶을 떄.
        List<String> studentName = studentList.stream().map(studentDTO -> studentDTO.getName()).collect(Collectors.toList());
        // map()으로 StudentDTO 객체를 name(String)객체로 변경하고,
        // collect() 로 그 값을 모았다.
        // collect() - 종단 연산이며 모든 값을 한 곳에 모은다.
    }
}
