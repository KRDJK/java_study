package day19.anonymous;

public class CarMain {
    public static void main(String[] args) {

        Car avante = () -> System.out.println("아반떼가 달립니다.");


        avante.run();


        Calculator addCal = (n1, n2) -> n1 + n2;




    } // end main
} // end class
