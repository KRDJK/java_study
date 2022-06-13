package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("루피", "비숑", 9);
        animals[1] = new Dog("망구", "푸들", 19);
        animals[2] = new Cat("치치", "러시안블루", "러시아", "회색");
        animals[3] = new Cat("망고", "페르시안", "이집트", "노란색");
        animals[4] = new Cat("하루", "브리티쉬 숏헤어", "영국", "갈색");


        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
        
        

    } // end main
} // end class
