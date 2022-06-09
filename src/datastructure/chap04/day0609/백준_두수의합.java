package datastructure.chap04.day0609;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_두수의합 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        sc.close();

        Arrays.sort(arr);


        int start = 0;
        int end = n-1;

        int count = 0;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == x) {
                count++;
                start++;
                end--;
            } else if (sum < x) {
                start++;
            } else {
                end--;
            }

        } // end while

        System.out.println(count);

    } // end main
} // end class
