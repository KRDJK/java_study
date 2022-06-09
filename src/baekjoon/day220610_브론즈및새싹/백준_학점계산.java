package baekjoon.day220610_브론즈및새싹;

import java.util.Scanner;

public class 백준_학점계산 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // switch로 할걸
        
        if (s.equals("A+")) {
            System.out.println(4.3);
        } else if (s.equals("A0")) {
            System.out.println(4.0);
        } else if (s.equals("A-")) {
            System.out.println(3.7);
        } else if (s.equals("B+")) {
            System.out.println(3.3);
        } else if (s.equals("B0")) {
            System.out.println(3.0);
        } else if (s.equals("B-")) {
            System.out.println(2.7);
        } else if (s.equals("C+")) {
            System.out.println(2.3);
        } else if (s.equals("C0")) {
            System.out.println(2.0);
        } else if (s.equals("C-")) {
            System.out.println(1.7);
        } else if (s.equals("D+")) {
            System.out.println(1.3);
        } else if (s.equals("D0")) {
            System.out.println(1.0);
        } else if (s.equals("D-")) {
            System.out.println(0.7);
        } else if (s.equals("F")) {
            System.out.println(0.0);
        }

    }
}
