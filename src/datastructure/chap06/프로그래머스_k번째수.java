package datastructure.chap06;

import java.util.Arrays;

public class 프로그래머스_k번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int findIdx = commands[i][2] - 1;

//            System.out.println("start = " + start);
//            System.out.println("end = " + end);
//            System.out.println("findIdx = " + findIdx);

            int[] arr = new int[end - start];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = array[start++];
            }
//            System.out.println("arr.length: " + arr.length);
//            Arrays.sort(arr);

            for (int j = arr.length-1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (arr[k] > arr[k+1]) {
                        int temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }
                }
            }

            answer[i] = arr[findIdx];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };

        System.out.println(Arrays.toString(solution(array, commands)));

    } // end main
} // end class
