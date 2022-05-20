package coding03_loop;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testTry = sc.nextInt();

        for (int i = 0; i < testTry; i++) {
            int A = sc.nextInt(), B = sc.nextInt();
            System.out.println(A+B);
        }
        sc.close(); // 반복문이 돌아가는 동안 계속 입력 받아야 하기 때문에.
    }
}
