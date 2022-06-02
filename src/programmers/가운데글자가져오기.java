package programmers;

public class 가운데글자가져오기 {
    public static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 1) {
            answer += s.charAt(s.length() / 2);
        } else if (s.length() % 2 == 0) {
            // 길이가 4면 2,3
            // 길이가 6이면 3,4
            //
            answer += s.charAt(s.length() / 2 -1);
            answer += s.charAt(s.length() / 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }
} // end class

