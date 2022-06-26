package baekjoon.day220622;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_A더하기B6_10953번 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s = sc.next();
            StringTokenizer st = new StringTokenizer(s, ",");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }

    } // end main
} // end class
