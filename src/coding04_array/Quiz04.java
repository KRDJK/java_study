package coding04_array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 정수 10개를 입력받아 각각의 수를 저장할 배열 생성.
        int[] numbers = new int[10];

        // 2. 정수 10개 입력받고 회차별로 배열 인덱스에 초기화.
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // 3. 배열을 순회하여 42로 나눈 나머지를 새로운 배열에 저장.
            // 3-1. 각 수를 42로 나눈 나머지를 저장할 새로운 배열 생성.
        int[] after = new int[10];

            // 3-2. numbers 배열을 순회하여 각 수를 42로 나눈 나머지를 after에 저장.
        for (int i = 0; i < numbers.length; i++) {
            after[i] = numbers[i] % 42;
        }

        // 배열에 잘 기록되고 있는지 확인용
        System.out.println("after = " + Arrays.toString(after));


        // 서로 다른 숫자를 찾자... how????
        // 4. after를 순회하여
        int count = 0; // 같은 숫자가 나올 때마다 ++함.

        for (int i = 0; i < after.length; i++) {
            for (int j = i+1; j < after.length; j++) {
                if (after[i] != after[j]) {
                    count++;
                }
            }
        }

        // 5. 10 - count를 통해 서로 다른 숫자가 몇개인지 확인..?
//        int result = 10 - count;

//        if (result < 0) {
//            result = 1;
//        }
        if (count > 10) {
            count = 10;
        }

        System.out.println(count);
    } // end main
} // end class
