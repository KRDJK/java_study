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


        } // end for

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }
}
