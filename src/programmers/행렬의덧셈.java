package programmers;

import java.util.Arrays;

public class 행렬의덧셈 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 =  {
                {1, 2},
                {2, 3}
        };
        int[][] arr2 = {
                {3, 4},
                {5, 6}
        };

        System.out.println(Arrays.toString(solution(arr1, arr2)));
    } // end main
} // end class
