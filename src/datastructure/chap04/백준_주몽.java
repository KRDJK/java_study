package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_주몽 {
    public static void main(String[] args) {
        /* 1. 오름차 정렬을 먼저 한다. (Arrays.sort(배열변수))
        *  2. start를 첫위치, e를 끝 위치에 둔다.
        *  3. 찾는 수보다 합산 수가 작은 경우, s를 오른 쪽으로 한칸 이동
        *  4. 찾는 수보다 합산 수가 큰 경우, e를 왼쪽으로 한칸 이동
        *  5. 찾는 수와 합산 수가 같은 경우, count를 증가시키고 s++, e-- */
        // 좋다 문제도 정렬을 먼저 하고 해라.


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println("N = " + N);
        System.out.println("M = " + M);

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.toString(arr)); // 배열 확인용

        // 먼저 정렬!
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // 정렬 확인용

        int s = 0;
        int start = arr[s];

        int e = arr.length-1;
        int end = arr[e];

        int count = 0;

        while (s < e) {
            if (start + end < M) {
                s++;
            } else if (start + end > M) {
                e--;
            } else {
                count++;
                s++;
                e--;
            }
        }


        System.out.println(count);


    } // end main
} // end class
