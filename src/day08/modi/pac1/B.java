package day08.modi.pac1;

class B { // default

    // 오버로딩 조건 : 매개변수의 타입, 순서, 개수가 달라야함. (매개 변수의 이름은 중요하지 않음)
    public B(String s) {}
    B(int x) {}
    private B(int y, String z) {}
    private B(String m, int k) {}


    B b1 = new B("zzz"); // public B 생성자를 호출한 것.
    B b2 = new B(100); // default
    B b3 = new B(5, "ㅋㅋ"); // private




    void test() {

        A a = new A(); // A와 같은 패키지라 바로 됨.
        a.f1 = 10; // public : 야~ 다 가져가서 써라!
        a.f2 = 20; // default : 같은 학교니까!
//        a.f3 = 30; // private : A의 사적인 데이터를 왜 수정하려고 하냐.


        a.m1(); // public
        a.m2(); // default
//        a.m3(); // private : 여기서도 안된다!!

    }

}
