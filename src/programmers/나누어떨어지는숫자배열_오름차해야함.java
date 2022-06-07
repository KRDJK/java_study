package programmers;

import java.util.Arrays;

public class 나누어떨어지는숫자배열_오름차해야함 {
    public static int[] solution(int[] arr, int divisor) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor != 0) {
                arr[i] = -1;
                count++;
            }
        }

//        System.out.println(Arrays.toString(arr));

        int[] answer = new int[arr.length - count];


        if (answer.length == 0) {
            answer = new int[] {-1};
            return answer;
        }


        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = idx; j < arr.length; j++) {
                if (arr[j] != -1) {
                    answer[i] = arr[j];
                    idx = j + 1;
                    break;
                }
            }
        }

        // 오름차정렬을 하지 않았다..
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (answer[i] < answer[j]) {
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2,36,1,3};
        System.out.println(Arrays.toString(solution(arr, 1)));
    }
}
