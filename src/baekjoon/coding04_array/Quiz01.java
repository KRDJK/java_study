package baekjoon.coding04_array;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 정수의 개수

        int[] numbers = new int[N]; // 입력받은 정수들을 저장할 배열

        // N만큼 반복해서 입력받은 정수를 순차적으로 배열에 초기화.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        // 최소, 최대값 초기화.
        int min = numbers[0];
        int max = numbers[0];

        // 배열 간 반복 비교를 통해 최소, 최댓값 찾기.
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.print(min+" ");
        System.out.println(max);

    }
}
