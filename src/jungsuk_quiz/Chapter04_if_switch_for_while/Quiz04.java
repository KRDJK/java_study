package jungsuk_quiz.Chapter04_if_switch_for_while;

public class Quiz04 {
    public static void main(String[] args) {
        int sum = 0;

        int num = 1;

        while (sum < 100) {
            if (num % 2 == 0) {
                sum -= num;
            } else {
                sum += num;
            }
            num++;
        }

        System.out.println("num = " + num);// 200

    }
}
