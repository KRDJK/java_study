package jungsuk_quiz.Chapter04_if_switch_for_while;

public class Quiz10 {
    public static void main(String[] args) {
        int num = 12345;

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("sum="+sum);
    }
}
