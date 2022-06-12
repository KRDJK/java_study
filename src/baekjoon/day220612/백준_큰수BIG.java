package baekjoon.day220612;

import java.util.Scanner;

public class 백준_큰수BIG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        long N = Integer.parseInt(s);

        long result = (long) (N % 20000303);

        System.out.println(result);

    }
}
