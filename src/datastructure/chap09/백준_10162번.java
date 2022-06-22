package datastructure.chap09;

import java.util.Scanner;

public class 백준_10162번 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = 300;
        int B = 60;
        int C = 10;

        int T = sc.nextInt();

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        if (T % 10 > 0) {
            System.out.println(-1);
        } else {
            while (T > 0) {
                if (T >= A) {
                    aCount += T/A;
                    T %= A;
                } else if (T >= B) {
                    bCount += T/B;
                    T %= B;
                } else if (T >= C) {
                    cCount += T/C;
                    T %= C;
                }
            }
            System.out.printf("%d %d %d", aCount, bCount, cCount);
        }

    } // end main
} // end class
