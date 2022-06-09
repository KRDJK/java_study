package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 좋다_막트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 정렬

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];

            int start = 0;
            int end = arr.length-1;

            while (start < end) {
                int sum = arr[start] + arr[end];

                if (sum == target) {
                    if (start == i ) {
                        start++;
                    } else if (end == i) {
                        end--;
                    } else {
                        count++;
                        break;
                    }
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            } // end while
        }

        System.out.println(count);

    } // end main
} // end class
