package baekjoon.coding03_loop;

import java.util.Scanner;

public class Quiz12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt(), B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }

            System.out.println(A+B);

        }
    }
}
