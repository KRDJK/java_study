package datastructure.chap08;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_수찾기_리트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        int M = sc.nextInt();

        int[] arr2 = new int[M];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int mm = Arrays.binarySearch(arr1, arr2[i]);
            if (mm < 0) {
                mm = 0;
            } else {
                mm = 1;
            }
            System.out.println(mm);
        }

    } // end main
} // end class
