package day14.poly.overloading;

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        System.out.println(r.calcArea(5));
        System.out.println(r.calcArea(10, 20));

        System.out.println(); // 대표적 오버로딩 예시

    } // end main
} // end class
