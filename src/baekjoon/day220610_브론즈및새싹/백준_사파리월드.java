package baekjoon.day220610_브론즈및새싹;

import java.util.Scanner;

public class 백준_사파리월드 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextInt(), M = sc.nextInt();

        long sum = N - M;

        if (sum < 0) {
            sum *= -1;
        }

        System.out.println(sum);

    } // end main
} // end class
