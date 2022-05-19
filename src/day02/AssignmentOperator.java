package day02;

public class AssignmentOperator {

    public static void main(String[] args) {

        int a = 5;

        System.out.println(a + 3); // a 가져와서 거기에 3 더한 값을 보여줘봐 = 8
        System.out.println("a = " + a); // a = 5

        System.out.println(a += 3); // a는 8이 되어버림. a = a + 3을 줄인 것.
        System.out.println("a = " + a); // a = 8

        a >>= 2; // 2의 2제곱만큼 나눈 값을 대입해라.
        System.out.println("a = " + a); // 2

        a <<= 2; // 2의 2제곱만큼 곱한 값을 대입해라.
        System.out.println("a = " + a); // 8

    }

}
