package datastructure.chap05.stack;

import java.util.Scanner;

public class 오큰수_두포인터버전 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }


        int start = 0;
        int end = 1;

        StringBuilder s = new StringBuilder();

        while (start < A.length) {

            if (A[start] < A[end]) { // end가 오큰수인 경우
                s.append(end);
                s.append(" ");
                start++;
                end++;
                continue;
            } else if (A[start] >= A[end]) { // 오큰수가 아닌 경우
                end++;
                continue;
            }

            if (end == A.length) {

            }

        } // end while


    } // end main
} // end class
