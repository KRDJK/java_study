package baekjoon.day220614;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class 백준_콘테스트_5576번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] w = new int[10];
        int[] k = new int[10];

        for (int i = 0; i < w.length; i++) {
            w[i] = sc.nextInt();
        }

        for (int i = 0; i < k.length; i++) {
            k[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(w);
        Arrays.sort(k);

        int wSum = 0;
        int kSum = 0;
        for (int i = 1; i <= 3; i++) {
            wSum += w[w.length-i];
            kSum += k[k.length-i];
        }

        System.out.println(wSum + " " + kSum);

    } // end main
} // end class
