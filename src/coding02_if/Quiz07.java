package coding02_if;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        sc.close();

        if (A == B && A == C) {
            System.out.println(10000 + (A * 1000));

        } else if (A != B && A != C && B != C) {
            if (A > B && A > C) {
                System.out.println(A * 100);
            } else if (B > A && B > C) {
                System.out.println(B * 100);
            } else {
                System.out.println(C * 100);
            }
        } else {
            if (A == B && A != C) {
                System.out.println(1000 + (A * 100));
            } else if (A != B && A == C) {
                System.out.println(1000 + (A * 100));
            } else if (B == C && B != A) {
                System.out.println(1000 + (B * 100));
            }
        }
    }
}
