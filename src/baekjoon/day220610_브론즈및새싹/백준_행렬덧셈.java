package baekjoon.day220610_브론즈및새싹;

import java.util.Scanner;

public class 백준_행렬덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }


        int[][] sum = new int[N][M];
        for (int i = 0; i < sum.length; i++) {

            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = A[i][j] + B[i][j];

                if (j == sum[i].length-1) {
                    System.out.print(sum[i][j]);
                    break;
                }

                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }




    } // end main
} // end classs
