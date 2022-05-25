package Coding04_array;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
             1.  조작 전 성적을 배열에 저장
             2.  조작 전 성적에서 최고점 찾기
             3.  성적 조작 수행-> 배열을 수정
             4.  새로운 평균 구하기
        */

        // 시험 본 과목의 개수를 받자.
        int N = sc.nextInt();

        // 원래 성적들의 값을 저장할 배열 생성.
        int[] scores = new int[N];

        // 원래 성적들 배열에 값 초기화하기.
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }
        sc.close();

        // 원래 성적 배열을 순회하여 최댓값을 찾자.
        int max = scores[0]; // 일단 0번 인덱스를 최댓값으로 초기화.

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }

            // 최대값이 잘 주어지는지 중간 확인
//        System.out.println("max = " + max);

        // 새로운 배열 생성
            // 이 배열은 원 점수마다 원점수/max*100
        double[] newScores = new double[scores.length];

        // scores를 순회하여 newScores에 새로운 점수들 초기화
        for (int i = 0; i < scores.length; i++) {
            newScores[i] = (double) scores[i] / max * 100;
                                        // max까지 double 형변환 하라고 하지 않아도 암묵적 형변환에 의해 실수가 됨.
        }

            // 새로운 배열이 잘 생성되는지 중간확인
//        System.out.println("새로운 배열: " + Arrays.toString(newScores));

        // 새로운 배열을 가지고 새로운 평균을 구하기.
        double sum = 0.0; // 평균을 구하기위해 총점을 저장할 변수 초기화.

        for (int i = 0; i < newScores.length; i++) {
            sum += newScores[i];
        }

        // 총점(sum)을 가지고 평균 구하기.
        double avg = sum / N;

        System.out.println(avg);



    } // end main
} //end class
