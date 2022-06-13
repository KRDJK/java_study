package datastructure.chap06.bubble;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {

            boolean flag = false; // if 문을 통과하면 true로 변경
            // 실제 비교
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j+1]) { // 왼쪽이 더 크면 자리 바꿈
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break; // swap이 한번도 일어나지 않은 경우.
        }
    }

    public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 버블정렬

        System.out.println("정렬 후: " + Arrays. toString(arr));

    } // end main
} // end class
