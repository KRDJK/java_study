package coding03_loop;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int A = sc.nextInt(), B = sc.nextInt();

            System.out.printf("Case #%d: %d + %d = %d\n", i, A, B, A+B);
        }
        sc.close();
    }
}
