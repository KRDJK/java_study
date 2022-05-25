package Coding05_Method;

import java.util.Arrays;

public class Quiz02 {

    static int d (int n) {

        int selfNum = n;

        while (n > 0) {
            selfNum += (n % 10);
            n /= 10;
        }
        return selfNum;
    }

    static void findSelfNum (int n) {
        int[] notSelfNumList = new int[n];


        for (int i = 1; i <= n; i++) {
            notSelfNumList[i-1] = d(i);
        }

        boolean[] temp = new boolean[n];

    }






    static void selfNum (int n) {
        if (n > 10000 || n < 1) {
            return;
        }
        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            if (i < 10) {
                arr[i-1] = i + (i % 10);

            } else if (i >= 10 & i < 100) {
                arr[i-1] = i + (i / 10) + (i % 10);

            } else if (i >= 100 & i < 1000) {
                arr[i-1] = i + (i / 100) + (i / 10) + (i % 10);

            } else if (i >= 1000 & i < 10000) {
                arr[i-1] = i + (i / 1000) + (i / 100) + (i / 10) + (i % 10);

            }
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
//        System.out.println(arr[arr.length-1]);

        int[] temp = new int[arr.length];

        for (int i = 1; i <= n; i++) {
            temp[i-1] = i;
        }

//        System.out.println(Arrays.toString(temp));

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (temp[i] == arr[j]) {
                    temp[i] = 0;
                }
            }
        }

//        System.out.println(Arrays.toString(temp));

        for (int number : temp) {
            if (number != 0) {
                System.out.println(number);
            }
        }

    }

    // start main
    public static void main(String[] args) {

//    selfNum(10000);

    } // end main
} // end class
