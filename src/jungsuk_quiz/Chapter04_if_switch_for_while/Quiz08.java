package jungsuk_quiz.Chapter04_if_switch_for_while;

public class Quiz08 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (2*i + 4*j == 10) {
                    System.out.printf("x= %d, y= %d\n", i, j);
                }
            }
        }

    } // end main
} // end class
