package programmers;

public class 문자열을정수로바꾸기 {
    public static int solution(String s) {
        int answer = 0;

//        if (s.charAt(0) == '+') {
//            for (int i = 1; i < s.length(); i++) {
//                answer += s.charAt(i) - '0';
//            }
//        }

        answer = Integer.parseInt(s); // 되네

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }
}
