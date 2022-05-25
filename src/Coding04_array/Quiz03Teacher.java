package Coding04_array;

import java.util.Scanner;

public class Quiz03Teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        sc.close();

        // 세 수의 곱
        int multi = A * B * C;

        // 0부터 9까지의 등장 횟수를 카운팅해서 저장할 배열
        int[] countArr = new int[10];

        // 자릿수 별로 숫자를 쪼개서 배열에 넣기.
        while (multi > 0) {
            // 1의 자리수를 구하기. ex) 3645853
            int lastPosNum = multi % 10; // ex) 3!
            countArr[lastPosNum]++; // 3번 인덱스 ++;

            // 한자리수 줄이기. ex) 3645853 -> 364585
            multi /= 10;
        }
        // 확인용
//        System.out.println(Arrays.toString(countArr));

        // 세로로 찍자
        for (int i = 0; i < countArr.length; i++) {
            System.out.println(countArr[i]);
        }
    }// end main
} // end class
