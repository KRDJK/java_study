package day08.modi.pac2;

import day08.modi.pac1.A;
//import day08.modi.pac1.B; // 패키지를 벗어났기 때문에 에러가 생겨버림. why?? class 자체를 default로 바꿔버렸음.

public class C {


    void test() {
        A a = new A();
        a.f1 = 10; // public
//        a.f2 = 20; // default
//        a.f3 = 30; // privates

        a.m1(); // public
//        a.m2(); // default
//        a.m3(); // private
    }


//    B b1 = new B("zzz"); // public B 생성자를 호출한 것. // B클래스 자체에 default를 걸어버리면서 에러 발생.
//    B b2 = new B(100);   // default
//    B b3 = new B(5, "ㅋㅋ");  // private

}
