package baekjoon.coding06_String;

import java.util.Scanner;

public class Quiz03_Self {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        for (int i = 'a'; i <= 'z'; i++) {
            if (i == 'z') {
                System.out.print(S.indexOf(i));
            } else {
                System.out.print(S.indexOf(i) + " ");
            }
        }

    } // end main
} // end class
