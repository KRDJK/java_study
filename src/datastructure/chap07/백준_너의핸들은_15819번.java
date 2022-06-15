package datastructure.chap07;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_너의핸들은_15819번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), I = sc.nextInt();

        String[] sArr = new String[N];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = sc.next();
        }

        Arrays.sort(sArr);

        System.out.println(sArr[I-1]);

    } // end main
} // end class
