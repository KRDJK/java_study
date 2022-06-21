package datastructure.chap09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 백준 11047
public class 그리디01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        int count = 0;
        while (K > 0) {
            for (int i = arr.length-1; i >= 0; i--) {
                if (arr[i] <= K) {
                    count += K / arr[i];
                    K = K % arr[i];
                }
            }
        }

        System.out.println(count);


    } // end main
} // end class
