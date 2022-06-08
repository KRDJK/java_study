package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 좋다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr); // 오름차 정렬.. 할 필요 있나??




    } // end main
} // end class
