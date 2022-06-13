package datastructure.chap06.selection;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_1427_리트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int n = N;

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

//        System.out.println(count);

        int[] arr = new int[count];

        int i = 0;
        while (i < count) {
            arr[i] = N % 10;
            N /= 10;
            i++;
        }

//        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length-1; j++) {
            int max = j;
            for (int k = j+1; k < arr.length; k++) {
                if (arr[max] < arr[k]) {
                    max = k;
                }
            }

            int temp = arr[j];
            arr[j] = arr[max];
            arr[max] = temp;
        }

        /*int j = 0;
        int sum = 0;
        while (j < count) {
            sum += arr[j];
            if (sum > 0) {
                sum *= 10;
            }
            j++;
        }*/

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }

    } // end main
} // end class
