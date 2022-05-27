package programmers;

public class 이상한문자만들기 {

    static public String solution(String s) {
        String answer = "";


        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if(' '== s.charAt(i)) {
                String a = s.substring(idx, i);


//                String b = "";
                for (int j = 0; j < a.length(); j++) {
                    if (j % 2 == 0) {
                        answer += a.charAt(j-32);
                    }
                }


                idx = i;
            }
        }

        // 직전 공백부터 마지막까지도 봐줘야 함.
        String a = s.substring(idx);

        for (int i = 0; i < a.length(); i++) {

        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
