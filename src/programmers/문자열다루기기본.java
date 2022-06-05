package programmers;

public class 문자열다루기기본 {
    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
    }
}
