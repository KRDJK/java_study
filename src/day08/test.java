package day08;

//import day08.fruit.Apple;
    // 앞으로 Apple을 쓸 때 '성'을 생략해서 쓰겠다고 선언하는 것과 같다.
//import day08.fruit.Banana;
//import day08.fruit.Grape;

import day08.fruit.*; // fruit 패키지 안에 있는 모든 클래스들의 성을 생략하겠다.
// import 구문은 패키지 구문과 클래스 구문 사이에 넣어야 한다.


public class test {

    public static void main(String[] args) {

        Apple apple = new Apple();
//        day08.fruit.Apple apple2 = new day08.fruit.Apple();
//        day08.fruit.Apple apple3 = new day08.fruit.Apple();

        // new Banana(); 이럴 때 에러나는 이유는!!
                            // 아니 day08에 Banana가 없는데 뭐 보고 만들어?
        // 다른 패키지에 있는 클래스는 풀네임을 명시해야 한다.
            // why?? 지금에야 컴퓨터 속에 Banana라는 클래스 자체가 하나지만.. 나중에 더 생기면??
            // 내가 뭘 보고 가져오라는거니???       이런 문제를 사전에 방지할 겸!!

        new Banana();
        new Grape();



    } //end main
} // end class
