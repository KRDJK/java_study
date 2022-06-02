package datastructure.chap03;

import java.util.Scanner;

public class 구간합구하기4_Self {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int[] A = new int[N];

        // 원 배열 만들기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }


        // 합배열 미리 생성하기
        int[] S = new int[A.length+1];

        for (int i = 1; i <= A.length; i++) {
            S[i] = S[i-1] + A[i-1];  // A의 5번 인덱스는 없다.
        }

        for (int k = 0; k < M; k++) {
            int i = sc.nextInt(), j = sc.nextInt();
            System.out.println(S[j]-S[i-1]);
        }


    } // end main
} // end class
