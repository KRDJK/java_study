package datastructure.chap06.insertion;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_11399_ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        // 삽입 정렬 시작
        for (int i = 1; i < arr.length; i++) { // 왜 1부터 시작?? i-1과 비교해볼거니까!!
            int temp = arr[i];

            int j = i;
            while (j > 0 && arr[j-1] >= temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

//        System.out.println(Arrays.toString(arr));


        int[] sumArr = new int[arr.length+1];

        for (int i = 1; i < sumArr.length; i++) {
            sumArr[i] = sumArr[i-1] + arr[i-1];
        }

        int sum = 0;
        for (int i = 0; i < sumArr.length; i++) {
            sum += sumArr[i];
        }

        System.out.println(sum);

    } // end main
} // end class
