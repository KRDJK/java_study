package programmers;

import java.util.Arrays;

public class 제일작은수제거하기 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if (answer.length == 0) {
            answer = new int[] {-1};
            return answer;
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

//        System.out.println(min);
//        System.out.println(Arrays.toString(arr));

        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = idx; j < arr.length; j++) {
                if (arr[j] == min) {
                    continue;
                }
                answer[i] = arr[j];
                idx = j+1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
