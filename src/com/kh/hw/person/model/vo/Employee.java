package com.kh.hw.person.model.vo;

public class Employee extends Person {

    private int salary; // 급여
    
    private String dept; // 부서
    
    // 생성자
    public Employee() {

    }

    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }

    // 메서드


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString() {
        return super.toString();
    }

} // end class
