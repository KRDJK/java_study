package day04;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열 특정 인덱스 데이터 삭제 알고리즘
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전: " + Arrays.toString(arr));

        /*
        arr[2] = arr[3]; // 1, 3, 7, 7, 9, 11
        arr[3] = arr[4]; // 1, 3, 7, 9, 9, 11
        arr[4] = arr[5]; // 1, 3, 7, 9, 11, 11
        */

        int delIndex = 0; // 삭제할 대상의 인덱스

//        i < arr.length-1까지로 해야함.
        for (int i = delIndex; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }


        // 1, 3, 7, 9, 11   pop ㄱㄱ
        int[] temp = new int[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        System.out.println("삭제 후: " + Arrays.toString(arr));

    }
}
