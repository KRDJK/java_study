package day12.protec.pac1;

public class B {

    public B() {

        A a = new A();
        a.f1 = 1; a.f2 = 2;
        a.m1(); a.m2();

        new A(2); new A(3.3);

        
        // 같은 패키지라서 다 가능하다
    }

}
