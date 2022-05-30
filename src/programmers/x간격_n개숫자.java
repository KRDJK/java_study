package programmers;

public class x간격_n개숫자 {
    static public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long) x * i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 5));
    }
}
