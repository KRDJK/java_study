package com.kh.hw.member.model.vo;

public class Member {

    private String id; // 아이디
    private String name; // 이름
    private String password; // 비밀번호
    private String email; // 이메일
    private char gender; // 성별
    private int age; // 나이


    // 생성자
    public Member() {

    }

    public Member(String id, String name, String password, String email,
                  char gender, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }


    // 메서드
    public String inform() {
        return String.format("# %s | %s | %s | %s | %c | %d", id, name, password, email, gender, age);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


} // end class
