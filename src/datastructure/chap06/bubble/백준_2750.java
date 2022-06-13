package datastructure.chap06.bubble;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length-1; i > 0; i--) {
            boolean flag = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if (!flag) break;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    } // end main
} // end class
