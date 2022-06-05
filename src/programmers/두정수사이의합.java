package programmers;

public class 두정수사이의합 {
    public static long solution(int a, int b) {
        long answer = 0;

        if (b < a) {
            int tmep = a;
            a = b;
            b = tmep;
        }


        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }
}
