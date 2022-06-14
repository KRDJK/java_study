package baekjoon.day220614;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_도비의난독증테스트_2204번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int T = sc.nextInt();

            if (T == 0) {
                break;
            } else {
                String[] sArr = new String[T];

                for (int i = 0; i < T; i++) {
                    String s = sc.next();
                    sArr[i] = s.toUpperCase(); // 대소문자 구분 없이 비교하고 싶으면..?
                }

                Arrays.sort(sArr);

                System.out.println(Arrays.toString(sArr));

                System.out.println(sArr[0]);

            } // end else

        } // end while

    } // end main
} // end class
