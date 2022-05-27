package jungsuk_quiz.chapter03_operator;

public class Quiz09 {
    public static void main(String[] args) {
        /*
        다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만
        변수 b의 값이 true 가 되도록 하는 코드이다. (1) 부분을 채워라.
        boolean b = (  (1)  );
        */

        char ch = 'z';
//        System.out.println("ch = " + (ch+1));
        boolean b = ( (ch >= 'A' && ch <= 'z') || (ch >= '0' && ch <= '9') );
        System.out.println(b);
    }
}
