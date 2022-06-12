package baekjoon.day220612;

import java.util.Scanner;

public class 백준_과제안내신분 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }


        int[] arr2 = new int[28];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int clear : arr2) {
                if (arr[i] == clear) {
                    arr[i] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }


    } // end main
} // end class
