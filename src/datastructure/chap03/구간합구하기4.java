package datastructure.chap03;

import java.util.Scanner;

public class 구간합구하기4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        long[] A = new long[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
//        int[] A = {5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(A));

        // 합배열 S 만들기
        // 공식 : S[i] = S[i-1] + A[i]

        long[] S = new long[A.length + 1]; // 0번 인덱스를 0으로 해놓기 위해서 / 기존 공식과 좀 다름.

        for (int i = 1; i <= A.length; i++) {
            S[i] = S[i-1] + A[i - 1];
        }

//        System.out.println(Arrays.toString(S));


        // 구간합 공식
        // (x, y) => x부터 y까지 구간합을 구하고 싶을 땐!!  ==>> S[y] - S[x-1]
        // (1, 3) ==>> S[3] - S[0]

        // 1 ~ 3까지의 구간합
//        System.out.println(S[3]- S[0]);
//
//        // 2 ~ 4까지의 구간합
//        System.out.println(S[4] - S[1]);

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println(S[y] - S[x-1]);
        }

    } // end main
} // end class
