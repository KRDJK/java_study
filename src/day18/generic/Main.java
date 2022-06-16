package day18.generic;

public class Main {
    public static void main(String[] args) {
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();


        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());


        // 과일을 30개 더 만들어야 하는데 그 때마다 전용 바구니도 같이 생성해줘야함..
        // 근데 과일을 생성시킬 때마다 실시간으로 바구니가 자동적으로 만들어지게 할 수 있다.
        // 이 개념이 제네릭이다.
        // 용도에 맞게 빠르게 복제해서 쓸 수 있도록 한다.

        
        // 제네릭 클래스 활용법
        Basket<Apple> ba = new Basket<>(); // 이러면 사과 전용바구니가 생성된 것!!
        ba.setFruit(new Apple());
//        ba.setFruit(new Banana());// 불가
        Apple a1 = ba.getFruit();


        Basket<Banana> bbb = new Basket<>();
        bbb.setFruit(new Banana());
        Banana b1 = bbb.getFruit();


        Basket<Grape> bg = new Basket<>();
        bg.setFruit(new Grape());
        Grape g1 = bg.getFruit();


//        Basket<Toy> tb = new Basket<>(); // 이렇게도 되는건 원치 않을땐..?


    } // end main
} // end class
