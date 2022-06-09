package day13.final_;

public class Main {
    public static void main(String[] args) {

        Korean park = new Korean("박철수", "991111-1122334", "중국");
        Korean kim = new Korean("김영희", "880202-2233441", "미국");

        park.name = "박찬호";
//        kim.id = "880202-2999911";
//        kim.nation = "중국"; // 불변성은 지켜졌다.


        System.out.println(park);
        System.out.println(kim); // toString 때문.


    }
}
