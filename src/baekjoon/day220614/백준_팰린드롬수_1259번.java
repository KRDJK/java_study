package baekjoon.day220614;

import java.util.Scanner;

public class 백준_팰린드롬수_1259번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                return;
            } else {
                String s = String.valueOf(n);

                String result = "";
                for (int i = s.length()-1; i >= 0; i--) {
                    result += s.charAt(i);
                }

                int m = Integer.parseInt(result);

                if (n == m) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }

        }

    } // end main
} // end class
