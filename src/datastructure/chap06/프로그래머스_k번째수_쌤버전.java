package datastructure.chap06;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프로그래머스_k번째수_쌤버전 {
    
    public static int[] solution(int[] array, int[][] commands) {

        // 정답 배열
        int[] answer = new int[commands.length];


        // 2차원 배열을 반복하여 결과를 하나씩 추출
        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0] - 1; // 배열 슬라이싱 시작 인덱스
            int b = commands[i][1]; // 배열 슬라이싱 끝 인덱스
            int c = commands[i][2] - 1; // 정렬 후 결과 값이 될 인덱스

            // 배열 슬라이싱 (배열 자르기)
            int[] sliceArr = new int[b - a];
            for (int j = 0; j < sliceArr.length; j++) {
                sliceArr[j] = array[j + a]; // array[j+a]로 해줘도 됨.
            }
            // 오름차 정렬
            Arrays.sort(sliceArr); // nlogn 시간복잡도를 가진다 : 퀵소트

            // 정렬된 배열에서 결과값 확보
            int result = sliceArr[c];

            answer[i] = result;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] A = {1,5,2,6,3,7,4};
        int[][] B = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] solution = solution(A, B);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }

}
