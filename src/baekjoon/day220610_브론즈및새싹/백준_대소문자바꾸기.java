package baekjoon.day220610_브론즈및새싹;

import java.util.Scanner;

public class 백준_대소문자바꾸기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a') {
                c = (char) (c - 32);
                result += c;
            } else {
                c = (char) (c + 32);
                result += c;
            }
        }

        System.out.println(result);
    }
}
