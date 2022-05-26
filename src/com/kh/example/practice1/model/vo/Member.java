package com.kh.example.practice1.model.vo;

public class Member {
    // 속성
    String memberld;
    String memberPwd;
    String memberName;
    int age;
    char gender;
    String phone;
    String email;
    
    
    

    // 생성자
    public Member() {
        
    }
    


    // 기능
    public void changeName (String name) {
        memberName = name;
    }

    public void printName () {
        System.out.printf("이름: %s\n", memberName);
    }

}
