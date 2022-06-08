package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

    private Student[] s;

    private Employee[] e;

    // 생성자
    public PersonController() {
        s = new Student[3];
        e = new Employee[10];
    }


    // 메서드
    // 각 객체배열에 저장된 객체 수를 정수 배열에 담아 반환하는 메서드
    public int[] personCount() {
        int sCount = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) sCount++;
        }
        
        int eCount = 0;
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) eCount++;
        }

        int[] personCount = {sCount, eCount};

        return personCount;
    }

    // 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메서드
    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
        if (personCount()[0] < s.length) {
            s[personCount()[0]] = new Student(name, age, height, weight, grade, major);
        }
    }

    // 학생 객체 배열의 주소를 반환하는 메서드
    public Student[] printStudent() {
        return s;
    }

    // 사원 객체 배열의 주소를 반환하는 메서드
    public Employee[] printEmployee() {
        return e;
    }

    // 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메서드
    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
        if (personCount()[1] < e.length) {
            e[personCount()[1]] = new Employee(name, age, height, weight, salary, dept);
        }
    }
    



} // end class
