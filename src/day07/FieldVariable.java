package day07;

public class FieldVariable {

    int[] a; // field (속성) 얘는 heap에 저장된다. 전역변수는 아님!!



    /*
        - 지역 변수는 반드시 초기화가 되어 있어야 참조가 가능하다.
        - 필드는 초기화를 하지 않아도 자동으로 각 타입의 기본값으로 초기화된다.
        - 매개변수는 메서드 호출시 강제로 값이 대입되므로 따로 초기화할 필요가 없다.
     */
     void m1(int c) { // c : parameter (매개 변수)
        int b = 1; // local variable (지역 변수)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {

        FieldVariable fv = new FieldVariable();

        fv.m1(10);

        System.out.println(fv.a);
//        b, c는 지역변수 개념이라 무슨 수를 써도 참조 불가능.

    } // end main
} // end class
