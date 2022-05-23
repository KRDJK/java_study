package day04;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        // 1과 13을 바꾸고, 3과 11을 바꾸고, 5와 9를 바꾸면 됨.
        System.out.println("reverse전: " + Arrays.toString(arr));

        /*
        int temp = arr[0];
        arr[0] = arr[6];
        arr[6] = temp;

        temp = arr[1];
        arr[1] = arr[5];
        arr[5] = temp;

        temp = arr[2];
        arr[4] = arr[2];
        arr[2] = temp;
        */

        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println("reverse후: " + Arrays.toString(arr));
    }
}
