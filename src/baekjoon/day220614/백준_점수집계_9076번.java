package baekjoon.day220614;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_점수집계_9076번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int[] arr = new int[5];
            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            } // inner for (회차별 배열 생성)

            // 생성된 배열 오름차 정렬
            Arrays.sort(arr);

            if (arr[3] - arr[1] >= 4) {
                System.out.println("KIN");
            } else {
                int sum = arr[1] + arr[2] + arr[3];
                System.out.println(sum);
            }

        } // outer for
        sc.close();

    } // end main
} // end class
