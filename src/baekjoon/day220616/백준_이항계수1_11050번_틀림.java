package baekjoon.day220616;

import java.util.Scanner;

public class 백준_이항계수1_11050번_틀림 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), k = sc.nextInt();

        if (0 <= k && n <= k) {
            System.out.println(n * k);
        }


    } // end main
} // end class
