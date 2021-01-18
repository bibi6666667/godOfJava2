package com.godOfJava2.c33;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("건빵", 32, 81, 75));
        sample.filterWithScoreForLoop(studentList, 80);
    }

    private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
        for (StudentDTO student : studentList) {
            if (student.getScoreMath() > scoreCutLine) {
                System.out.println(student.getName());
            }
        }
        // 위 코드와 아래 코드는 같다.
        studentList.stream().filter(student -> student.getScoreMath() > scoreCutLine)
        .forEach(filteredStudent -> filteredStudent.getName());
        // filter() : if문처럼, 스트림 내에서 필요한 데이터를 걸러서 처리할 때 사용한다.
        // filter()를 통해 수학 점수가 커트라인보다 높은 학생만 남아서 그 아래의 forEach()로 이동한다.
    }
}
