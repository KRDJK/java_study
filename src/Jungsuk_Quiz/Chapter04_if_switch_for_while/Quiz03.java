package Jungsuk_Quiz.Chapter04_if_switch_for_while;

public class Quiz03 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.println("sum = " + sum);

    }
}
