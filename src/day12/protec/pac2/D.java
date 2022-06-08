package day12.protec.pac2;

import day12.protec.pac1.A;

public class D extends A {

    public D() {
        super(30);
//        super(30.3); // default라서 안됨.
        A a = new A();
//        a.f1=2;
        super.f1 = 2; // 다른 패키지인데 접근이 됨. protected라서!
//        super.f2 = 2; // default라서 안됨.
        super.m1();
//        super.m2(); // default라서 안됨.


    }

}
