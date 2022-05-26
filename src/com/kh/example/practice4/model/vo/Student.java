package com.kh.example.practice4.model.vo;

public class Student {

    int grade; // 학년
    int classroom; // 학급
    String name; // 학생 이름
    double height; // 학생의 신장
    char gender; // 학생 성별


    // 생성자
    public Student(String sName, int sGrade, int sClassroom, double sHeight, char sGender) {
        name = sName;
        grade = sGrade;
        classroom = sClassroom;
        height = sHeight;
        gender = sGender;
    }

    // 메서드
    public void information () {
        System.out.printf("%d학년 %d반 %s 정보: \n", grade, classroom, name);
        System.out.printf("키: %.2fCM, ", height);
        System.out.printf("성별: %s", gender=='f' ? "여자" : "남자");
    }

}
