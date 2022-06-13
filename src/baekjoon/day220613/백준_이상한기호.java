package baekjoon.day220613;

import java.util.Scanner;

public class 백준_이상한기호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(), B = sc.nextLong();

        System.out.println((A+B)*(A-B));
    }
}
