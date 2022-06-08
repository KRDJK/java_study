package datastructure.chap04;

import java.util.Scanner;

public class 백준_수들의합5_리트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }


        int start = 0, end = 0;

        int count = 0;

        int sum = arr[start];

        while (end < N) {
            System.out.printf("start: %d, end: %d, sum : %d, count: %d\n", start, end, sum, count);
            if (sum < N) {
                end++;
                sum += arr[end];
            } else if (sum > N) {
                sum -= arr[start];
                start++;
            } else if (sum == N){
                count++;
                end++;
                if (end < N) {
                    sum += arr[end];
                }
            }
        } // end while

        System.out.println(count);

    } // end main
} // end class
