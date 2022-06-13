package datastructure.chap06;

public class 프로그래머스_가장큰수 {
    public static String solution(int[] numbers) {
        String answer = "";

        int[] arr = new int[numbers.length * numbers.length-1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                } else {
//                    arr[i] =
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));

    } // end main
} // end class
