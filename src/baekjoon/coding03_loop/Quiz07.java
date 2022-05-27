package baekjoon.coding03_loop;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testTry = sc.nextInt();

        for (int i = 1; i <= testTry; i++) {
            int A = sc.nextInt(), B = sc.nextInt();
            System.out.printf("Case #%d: %d\n", i, A+B);
        }
        sc.close(); // 반복문이 돌아가는 동안 계속 입력 받아야 하기 때문에.
    }
}
