package programmers;

public class 수박수박수박 {
    public static String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer += "수";
            } else if (i % 2 == 0) {
                answer += "박";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
