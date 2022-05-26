package day07.SelfPractice;

public class Person {

    // 속성 (필드)
    String name;
    int age;
    String hobby;


    // 생성자
    Person() {
        System.out.println("[이름, 나이, 취미] 순으로 입력하세요.");
//        System.out.printf("[%s, %d, %s] 순으로 입력하세요.\n", ); 안될듯
    }

    Person(String pName, int pAge, String pHobby) {
        name = pName;
        age = pAge;
        hobby = pHobby;
    }

    // 기능 (메서드)

    // 상대방의 신상을 묻는 기능
    void askPersonalInfor (Person targetPerson, String pI) {
        if (pI.equals("별명")) {
            System.out.printf("\n안녕? 내 별명은 %s야, 너는 별명이 뭐니??\n", name);
            System.out.printf("어! 반갑다! 내 별명은 %s야.", targetPerson.name);

        } else if (pI.equals("나이")) {
            System.out.printf("\n안녕? 나는 %d살이야, 너는 몇살이니??\n", age);
            System.out.printf("어! 반갑다! 나는 %d살이야.", targetPerson.age);

        } else if (pI.equals("취미")) {
            System.out.printf("\n안녕? 내 취미는 %s인데, 너는 취미가 뭐니??\n", hobby);
            System.out.printf("어! 반갑다! 나는 %s가 취미야.", targetPerson.hobby);

        }
    }

    /*// 1-1. 신상을 물으려고 했더니.. name, age, hobby 별로 따로 만들고 그것들을 묶어보는게 맞을듯..??
        // askName
    void askName (Person targetPerson, String name) {
        System.out.printf("야! [%s]! 너 별명이 뭐야? \n",targetPerson);
        System.out.printf("어! 반갑다. 내 별명은 %s야.\n", targetPerson.name);
    }

        // askAge
    void askAge (Person targetPerson, int age) {

    }*/


}
