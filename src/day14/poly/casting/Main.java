package day14.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();


        System.out.println("===============================");

        Parent child = new Child();
        child.m1();
        child.m2(); // 실제는 차일드니까 오버라이딩된 메서드가 나온다.
        ((Child)child).m3(); // 차일드를 업캐스팅 했더니 자기의 오리지널 메서드를 쓸 수 없어지네??




    } // end main
} // end class
