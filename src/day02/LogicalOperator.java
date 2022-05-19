package day02;

public class LogicalOperator {

    public static void main(String[] args) {

        boolean t = true, f =false;
        System.out.println(t & t); // t
        System.out.println(t & f); // f
        System.out.println(f & t); // f
        System.out.println(f & f); // f


        System.out.println(t | t); // t
        System.out.println(t | f); // t
        System.out.println(f | t); // t
        System.out.println(f | f); // f

        System.out.println("==============================");

        int x = 10, y = 20;

        boolean result1 = (x != 10) && (++y == 21);
        boolean result2 = (x==10) || (++y == 21);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("=============================");

        // 논리 반전(!) - 단항 연산자
        System.out.println(!t);
//        js에서랑 사용법도 같다.

//        System.out.println(10 + 20); // 여기서의 +는 산술연산자
//        System.out.println("안녕" + "하세요"); // 여기서의 +는 결합연산자



    }
}
