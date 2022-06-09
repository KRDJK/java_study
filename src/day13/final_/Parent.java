package day13.final_;

class Child extends Parent{

    // 오버라이딩 막힌다.
//    void m1() {
//
//    }

    @Override
    void m2() { // 사용제한자가 없으니 가능
        String s;
    }


    void m4() {}

}




// public final class Parent ( // 상속 제한
public class Parent {

    final void m1() {} // 오버라이딩 제한
    void m2() {}
    void m3() {}

}
