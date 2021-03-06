package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_주몽_막트 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr); // 오름차 정렬

        int start = 0;
        int end = arr.length-1;

        int count = 0;

        while (start < end) {

            int sum = arr[start] + arr[end];

            if (sum == M) {
                count++;
                end--;
                start++;
            } else if (sum < M) {
                start++;
            } else {
                end--;
            }

        } // end while

        System.out.println(count);


    } // end main
} // end class
