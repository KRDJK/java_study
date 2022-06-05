package programmers;

public class 시저암호 {
    public static String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                continue;
            }
            char c = s.charAt(i);
            c = (char) (s.charAt(i) + n);
            if (c > 'z') {
                c = (char) ('a'+n-1);
            } else if (s.charAt(i) > 'A' && s.charAt(i) < 'Z' && c > 'Z') {
                c= (char) ('A'+n-1);
            }

            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }
}
