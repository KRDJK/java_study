package datastructure.chap06.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {

        // swap 대상을 타겟팅하는 루프
        for (int i = 0; i < arr.length - 1; i++) {
            // 최소값 탐색
            int min = i; // 최소값의 인덱스
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 선택 정렬

        System.out.println("정렬 후: " + Arrays. toString(arr));

    } // end main
} // end class
