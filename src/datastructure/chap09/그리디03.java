package datastructure.chap09;

import java.util.Arrays;
import java.util.Scanner;

public class 그리디03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println(sum);

    } // end main
} // end class
