package jungsuk_quiz.chapter04_if_switch_for_while;

public class Quiz11Review {
    public static void main(String[] args) {
        // Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다

        int num1 = 1;

        int num2 = 1;

        int num3 = num1 + num2; // 세번째 값

        System.out.print(num1+","+num2);

        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print("," + num3);
        }
    }
}
