package datastructure.chap06.selection;

import java.util.Scanner;

public class 백준_1427_쌤버전 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] A = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            // Integer.parseInt면 문자열을 넣어줘야 하는데 그러기 위해서 ""을 붙여서 문자열을 만들어줌.
            A[i] = Integer.parseInt("" + str.charAt(i));
        }

        for (int i = 0; i < A.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }


    }
}
