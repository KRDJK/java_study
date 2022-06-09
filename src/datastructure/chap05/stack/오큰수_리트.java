package datastructure.chap05.stack;

import java.util.Scanner;

public class 오큰수_리트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }


        int[] B = new int[A.length];


        for (int i = 0; i < A.length; i++) {
            int min = A[i];
            for (int j = i+1; j < A.length; j++) {
//                if (min)
            }
        }


    } // end main
} // end class
