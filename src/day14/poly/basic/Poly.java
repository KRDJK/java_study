package day14.poly.basic;

// 얘의 부모는 Object
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Poly {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        a = b; // a는 b의 부모다. 캐스팅을 하지 않아도 부모타입에는 그냥 대입될 수 있다.
        A x1 = b;
        A x2 = new B();
        A x3 = c;
        A x4= new D();
        A x5 = e;


        B y1 = new D();
        C y2 = new E();

//        B y3 = new E(); // 상속 관계가 아니면 다형성이 적용되지 않음.
//        D y4 = new E();


//        double dd = 3.3;
//        int nn = dd;  안됨
//        dd = nn;


    } // end main
} // end class