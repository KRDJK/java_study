package programmers;

public class 홀수와짝수 {
    static public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else if (num % 2 == 1 || num % 2 == -1) {
            answer = "Odd";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(0));
    }
}
