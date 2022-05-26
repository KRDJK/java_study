package Jungsuk_Quiz.Chapter04_if_switch_for_while;

public class Quiz02 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            if ( !(i%2 == 0 || i%3 == 0) ) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);

    } // end main
} // end class
