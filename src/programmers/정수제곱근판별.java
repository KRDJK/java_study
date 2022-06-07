package programmers;

public class 정수제곱근판별 {
    public static long solution(long n) {
        long answer = 0;

        long num = 0;

        for (long i = 1; i <= n; i++) {
            if ( i * i == n) {
                num = i;
                break;
            }
        }

        if (num == 0) {
            answer = -1;
        } else {
            num += 1;

            answer = num * num;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
