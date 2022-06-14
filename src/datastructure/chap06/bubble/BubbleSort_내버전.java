package datastructure.chap06.bubble;

import java.util.Arrays;

public class BubbleSort_내버전 {
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
//                if(i == j) continue;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    } // end sort

    public static void main(String[] args) {

        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr);

        System.out.println("정렬 후: " + Arrays. toString(arr));

    } // end main
} // end class
