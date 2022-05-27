package programmers;

public class 핸드폰번호가리기 {
    static public String solution(String phone_number) {
        String answer = "";

        // 전화번호 맨 뒤 4자리 추출
        String last4= phone_number.substring(phone_number.length() - 4);
//        System.out.println("last4 = " + last4);
        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }

        return answer += last4;
    }




    //start main
    public static void main(String[] args) {
        System.out.println(solution("01012345678"));
    } // end main
} // end class
