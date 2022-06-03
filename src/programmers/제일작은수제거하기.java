package programmers;

import java.util.Arrays;

public class 제일작은수제거하기 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        if (arr.length-1 == 0) {
            answer = new int[] {-1};
            return answer;
        } else {
            int min = arr[0]; // 임시 최소값
            int minIdx = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIdx = i;
                }
            }
            // 제일 작은수는 찾았다. 걔 빼고 어케 배열 만들지



        }


        // 흠..

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
