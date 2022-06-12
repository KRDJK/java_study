package baekjoon.day220611;

import java.util.Scanner;

public class 백준_크냐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt(), m = sc.nextInt();

            if (n == 0 && m == 0) {
                break;
            } else {
                if (n > m) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }
    }
}
