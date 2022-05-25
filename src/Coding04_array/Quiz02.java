package Coding04_array;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 9번 입력받을거라 입력받은 만큼 초기화할 배열 생성.
        int[] numbers = new int[9];

        // 9번까지 입력받고 배열에 순차적 초기화.
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }

        // 인덱스, 최댓값 초기화
        int idx = 0;
        int max = numbers[0];

        //
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                idx = i + 1;
            }
        }

//        for (int i = 0; i < numbers.length; i++) {
//            if(max == numbers[i]) {
//                idx = i+1;
//                break;
//            }
//        }

        System.out.println(max);
        System.out.println(idx);
    }
}
