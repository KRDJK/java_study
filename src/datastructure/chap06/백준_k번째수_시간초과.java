package datastructure.chap06;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_k번째수_시간초과 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);

        System.out.println(arr[K-1]);
    }
}
