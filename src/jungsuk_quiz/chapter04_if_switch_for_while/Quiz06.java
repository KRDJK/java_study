package jungsuk_quiz.chapter04_if_switch_for_while;

public class Quiz06 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if(i+j == 6) {
                    System.out.printf("%d + %d = 6\n", i, j);
                }
            }
        }

    } // end main
} // end class
