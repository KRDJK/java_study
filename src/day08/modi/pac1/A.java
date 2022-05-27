package day08.modi.pac1;

public class A {

    // 필드 선언
    public int f1;
    int f2; // default 제한 : 얜 쓰는게 아니고, 앞에 아무것도 안쓰는거임.
                    // 지금까지 써온게 default 제한 방식이었음.
    private int f3;


    // 메서드 선언
    public void m1() {}
    void m2() {} // 여기서도 default 제한이 걸린 것.
    private void m3() {}


    // 생성자 선언
    public A() {
        f1 = 10;
        f2 = 20;
        f3 = 30; // private 이니까 나만 쓸 수 있다.

        m1(); m2(); m3();
    }


    B b1 = new B("zzz"); // public B 생성자를 호출한 것.
    B b2 = new B(100); // default
//    B b3 = new B(5, "ㅋㅋ"); // private

}
