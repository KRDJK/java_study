package programmers;

public class 이상한문자만들기 {

    static public String solution(String s) {
        String answer = "";


        int idx = 0;


        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                String a = s.substring(idx, i);


                for (int j = 0; j < a.length(); j++) {
                    if (j % 2 == 0) {
                        if ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z')) {
                            answer += (char) (a.charAt(j) - 32);
                        } else {
                            answer += a.charAt(j);
                        }
                    } else if (j % 2 == 1) {
                        if ((a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')) {
                            answer += (char) (a.charAt(j) + 32);
                        } else {
                            answer += a.charAt(j);
                        }
                    }
                }

                idx = i + 1;
                answer += " ";
            }
        }

        // 직전 공백부터 마지막까지도 봐줘야 함.
        String a = s.substring(idx);

        for (int i = 0; i < a.length(); i++) {
            if (i % 2 == 0) {
                if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z')) {
                    answer += (char) (a.charAt(i) - 32);
                } else {
                    answer += a.charAt(i);
                }
            } else if (i % 2 == 1) {
                if ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')) {
                    answer += (char) (a.charAt(i) + 32);
                } else {
                    answer += a.charAt(i);
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution("try hello world"));

    } // end main
} // end calss

