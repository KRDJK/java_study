package baekjoon.day220611;

import java.util.Scanner;

public class 백준_큰수A더하기B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(), B = sc.nextLong();

        long sum = (long) (A + B);

        System.out.println((long)sum);
    }
}
