package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_주몽_리트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

//        System.out.println(Arrays.toString(arr)); // 배열 확인용

        // 먼저 정렬!
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr)); // 정렬 확인용

        int start = 0;

        int end = arr.length-1;

        int count = 0;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == M) {
                count++;
                start++;
                end--;
            } else if (sum < M) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(count);

    } // end main
} // end class
