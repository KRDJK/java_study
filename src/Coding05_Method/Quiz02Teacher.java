package Coding05_Method;

import java.util.Arrays;

public class Quiz02Teacher {
    // self-number 생성자 함수 d(n)

    // n -> 91  return 91 + 9 + 1 = 101
    // n -> 223 return 223 + 2 + 2 + 3 = 230
    static int d(int n) {

        int selfNum = n;
        while (n > 0) {
            selfNum += (n % 10);
            n /= 10;
        }
        return selfNum;
    }

    public static void main(String[] args) {

        /*
            d(1) => 2
            d(2) => 4
            d(3) => 6
            ...
            d(91) => 101
            d(92) => 103
            ..
            d(10000) => 10001
         */

        boolean[] proopfs = new boolean[10000];


        for (int i = 1; i <= proopfs.length; i++) {
            int d1 = d(i);
            if (d1 <= proopfs.length) {
                proopfs[d1 - 1] = true;
            }
        }

//        System.out.println(Arrays.toString(proopfs));
        
        // 셀프 넘버 출력
        for (int i = 0; i < proopfs.length; i++) {
            if (!proopfs[i]) {
                System.out.println(i+1);
            }
        }
    }
}

