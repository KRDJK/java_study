package day07.SelfPractice;

public class PersonFactory {

    public static void main(String[] args) {

        Person kim = new Person("돼지", 20, "축구");
        Person park = new Person("곰탱이", 20, "게임");

        kim.askPersonalInfor(park, "별명");
        park.askPersonalInfor(kim, "별명");

        kim.askPersonalInfor(park, "나이");


    } // end main
} // end class
