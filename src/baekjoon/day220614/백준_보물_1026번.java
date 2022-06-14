package baekjoon.day220614;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_보물_1026번 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        // arr1 배열은 오름차정렬
        Arrays.sort(arr1);

        // arr2 배열은 내림차정렬
        for (int i = arr2.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr2[j] < arr2[j+1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] * arr2[i];
        }

        System.out.println(sum);

    } // end main
} // end class
