package baekjoon.day220611;

import java.util.Scanner;

public class 백준_킹퀸룩비숍나이트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] piece = {1, 1, 2, 2, 2, 8};

        int[] temp = new int[piece.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < piece.length; i++) {
            if (i == piece.length-1) {
                System.out.print(piece[i] - temp[i]);
            } else {
                System.out.print(piece[i] - temp[i] + " ");
            }
        }

    }
}
