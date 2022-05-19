package day02;

public class Quiz {

    public static void main(String[] args) {
    int x = 3;
    int y = ++x + 5 * 3; // 일단 여기까지 x = 4 / y = 19
    int z = 5 * y-- + x++ - --y;
    // * + - 부터 보자.
        // 5 * 19 해놓고 y-- y = 18
        // 95 + 4++ = 99 해놓고 x++ = 5
        // 99 - --y = 99 - 17 = 82

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }

}
