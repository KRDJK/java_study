package programmers;

public class 시저암호리트 {

    public static String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // 공백인 경우,
                answer += " ";
                continue;
            }

            // z, Z를 넘어가면..
            if ((s.charAt(i) + n) > 'z' || (s.charAt(i) + n) > 'Z') {
                if ((s.charAt(i) + n) > 'z') { // 소문자 z보다 큰 경우
                    answer += (char) ('a' + n - 1);
                } else if ((s.charAt(i) + n) > 'Z') { // 대문자 Z보다 큰 경우
                    if (s.charAt(i) >= 'a') {
                        answer += (char) (s.charAt(i) + n);
                    } else {
                        answer += (char) ('A' + n - 1);
                    }
                }
            } else {
                answer += (char) (s.charAt(i) + n);
            }

        } // end for

        return answer;
    }

    public static void main(String[] args) {
//        System.out.println((char) ('A'+14));
        System.out.println(solution("P", 15));
    }
}
