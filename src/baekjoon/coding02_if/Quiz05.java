package baekjoon.coding02_if;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(), M = sc.nextInt();

        if (M >= 45) {
            System.out.print(H + " ");
            System.out.println(M-45);
        } else if (H >= 1 && M < 45) {
            System.out.print(H-1 + " ");
            System.out.println(M+15);
        } else {
            System.out.print(23 + " ");
            System.out.println(M+15);
        }
    }
}
