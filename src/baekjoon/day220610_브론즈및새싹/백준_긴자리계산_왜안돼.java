package baekjoon.day220610_브론즈및새싹;

import java.util.Scanner;

public class 백준_긴자리계산_왜안돼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        long A = Integer.parseInt(s1);
        long B = Integer.parseInt(s2);

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
    }
}
