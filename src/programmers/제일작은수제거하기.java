package programmers;

import java.util.Arrays;

public class 제일작은수제거하기 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if (arr.length-1 == 0) {
            answer = new int[] {-1};
            return answer;
        } else {
            int min = arr[0]; // 임시 최소값
            
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }


        }


        // 흠..

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
