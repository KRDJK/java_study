package com.kh.example.practice7.model.vo;

public class Employee {

    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;


    // 생성자
    public Employee() {
        this(100, "홍길동");
    }

    public Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    public Employee(int empNo, String empName, String dept, String job, int age, char gender,
                    int salary, double bonusPoint, String phone, String address) {
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", bonusPoint=" + bonusPoint +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // 메서드
    public void info() {
        System.out.println("empNo = " + empNo);
        System.out.println("empName = " + empName);
        System.out.println("dept = " + dept);
        System.out.println("job = " + job);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("salary = " + salary);
        System.out.println("bonusPoint = " + bonusPoint);
        System.out.println("phone = " + phone);
        System.out.println("address = " + address);
    }

} // end class
