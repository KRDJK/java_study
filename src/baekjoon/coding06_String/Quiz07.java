package baekjoon.coding06_String;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next(), B = sc.next();

        String a = "";
        String b = "";

        for (int i = A.length()-1; i >= 0; i--) {
            a += A.charAt(i);
            b += B.charAt(i);
        }

        int A1 = Integer.parseInt(a);
        int B1 = Integer.parseInt(b);

        if (A1 < B1) {
            System.out.println(B1);
        } else {
            System.out.println(A1);
        }
    }
}
