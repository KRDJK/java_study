package programmers;

import java.util.Arrays;

public class 자연수뒤집배열로만들기 {
    public static int[] solution(long n) {
        int[] answer = {};

        String s = String.valueOf(n);

        answer = new int[s.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }
}
