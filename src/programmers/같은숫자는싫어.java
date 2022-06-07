package programmers;

import java.util.Arrays;

public class 같은숫자는싫어 {
    public static int[] solution(int []arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                } else break;
            }
        }

//        System.out.println(Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                count++;
            }
        }

        int[] answer = new int[count];

        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = idx; j < arr.length; j++) {
                if (arr[j] != -1) {
                    answer[i] = arr[j];
                    idx = j+1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));
    }
} // end class
