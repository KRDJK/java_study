package programmers;

public class 없는숫자더하기_new {
    static public int solution(int[] numbers) {
        int answer = 0;

        /*
            0~9까지를 전부 다 더하면 45다.
            몇개 빠져있는 애들을 다 더한거를 빼면 없는 숫자 들간의 합이 나온다.
        */

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            answer += i;
        }

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }


        return answer;
    }
}
