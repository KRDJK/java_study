package baekjoon.day220611;

import java.util.Scanner;

public class 백준_문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            String s = sc.next();
            String result = "";
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length()-1);
            result += c1;
            result += c2;
            System.out.println(result);
        }
    }
}
