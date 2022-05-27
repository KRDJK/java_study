package baekjoon.coding04_array;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스를 받자.
        int C = sc.nextInt();

        // 테스트 케이스만큼 돌면서 또 입력받아야함.
        for (int i = 0; i < C; i++) {

            // 학생수를 입력 받아야함.
            int N = sc.nextInt();


            // 점수들을 입력받아 배열에 저장하기 위해 먼저 배열 생성.
            int[] scoreList = new int[N];


            // 학생수 만큼 점수를 입력받아야함. 입력 받은 것을 scoreList에 초기화.
            for (int j = 0; j < N; j++) {
                scoreList[j] = sc.nextInt();
            }


            // 배열을 순회하여 평균 구하자.
            int sum = 0; // 평균 구하기 위한 총점 저장 변수 선언, 초기화.

            for (int j = 0; j < scoreList.length; j++) {
                sum += scoreList[j];
            }


            // 구한 총점으로 평균 구하기.
            double avg = (double) sum / scoreList.length;

                // 평균 잘 구해졌는지 중간 확인
//            System.out.println("avg = " + avg);


            // scoreList를 순회하며 평균을 기준으로 점수가 더 높은 학생이 얼마나 있는지 확인.
            int count = 0; // 평균보다 높은 점수의 학생을 카운트할 변수.

            for (int score : scoreList) {
                if (score > avg) {
                    count++;
                }
            }


            // 평균보다 점수가 높은 학생의 비율 구하기.
            double rate = (double) count / scoreList.length * 100;


            // 소수점 3째 자리까지 출력.
            System.out.printf("%.3f%%\n", rate);

        } // end outer for
        sc.close();
    } // end main
} // end class
