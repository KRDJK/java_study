package coding04_array;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        int A = 150, B = 266, C = 427;

        int total = A * B * C;
        System.out.println("total = " + total);

//        한자리씩 뜯어서 배열을 만들어야 함..
        // 세 숫자를 곱한 값이 몇 자리의 수인지부터 찾아야함.
        String transform = Integer.toString(total);
//        System.out.println(transform);

        // 자릿수별 배열 저장.


        // 0~9까지 숫자가 등장한 횟수를 기록할 카운트 변수 초기화.
        /*
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
        얘네를 배열에 담으면 되겠네??
        */

        // 배열 순회해서 0~9 숫자 카운트
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < transform.length(); j++) {

            }
        }

    } //end main
} //end class
