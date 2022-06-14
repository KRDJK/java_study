package day16.inter;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 인터페이스도 다형성을 적용할 수 있다.
        Dog dog = new Dog(); // Animal도 가능
        Cat cat = new Cat(); // Animal도 가능
        Shark shark = new Shark();
        Tiger tiger = new Tiger();
        BullDog bullDog = new BullDog();
        Rabbit rabbit = new Rabbit();


        Pet[] pets = {dog, cat, bullDog, rabbit};
        for (Pet pet : pets) {
            pet.play();
        }


        Violent[] violents = {rabbit, tiger, shark};
        for (Violent violent : violents) {
            violent.attack("zzz");
        }


        // 인터페이스를 통해 객체의 기능을 제한할 수 있다.
        Violent tokki = new Rabbit();
//        tokki.play();
        tokki.attack("주인");


        List<Integer> list = new LinkedList<>(); // 그냥 연결리스트는 중간 삽입 삭제가 있지만
                                                // 얘를 Queue로 바꾸면 연결리스트에서 기능이 제한되어
                                                // 중간 삽입, 삭제 기능이 제한된다.


    } // end main
} // end class