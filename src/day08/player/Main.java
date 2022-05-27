package day08.player;

public class Main {
    public static void main(String[] args) {
        Player park = new Player("박찬호", 1, 50);
        Player kim = new Player("김철수", 1, 50);

        /*
        이걸 생성자가 매개변수로 받아서 생성하게 하자
        park.name = "박찬호";
        kim.name = "김철수";
        park.level = 1;
        kim.level = 1;
        park.hp = 50;
        kim.hp = 50;
        */

//        System.out.println("kim = " + kim); // 주소 검증
//        System.out.println("park = " + park);

//        park.attack(kim);
//        kim.attack(park);
        kim.attack(kim);
    }
}
