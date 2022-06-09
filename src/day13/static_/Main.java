package day13.static_;

public class Main {
    public static void main(String[] args) {

        System.out.println(Count.y); // 객체 생성 이전인데 static이므로 조회가 가능하다.
        System.out.println(Math.PI);
        // 객체 생성 이전이라 c1.m1(); 이런게 안됨. c1이 누군데?
         Count.m2(); // 객체 생성 없이 가능하지만 저 메서드 속 x에 대한 값은 모름


        // 객체 생성
        Count c1 = new Count();
        c1.x = 10;
        c1.x++;

        Count.y  = 20;
        Count.y --;



        Count c2 = new Count();

        c2.x = 100;
        Count.y = 200;


        System.out.printf("c1.x: %d, c1.y: %d\n", c1.x, Count.y );
        System.out.printf("c2.x: %d, c2.y: %d\n", c2.x, Count.y );


        System.out.println("=====================================");

        c1.m1(); // 앞에 this가 누구인지 명시를 해줘야함.
        Count.m2();



    } // end main
} // end class
