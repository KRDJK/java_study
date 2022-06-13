package datastructure.chap06.selection;

import java.util.Scanner;

public class 백준_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(s);

        String result = "";

        for (int i = 0; i < s.length()-1; i++) {
            int max = i;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j) > s.charAt(max)) {
                    max = j;
                }
            }
            result += s.charAt(max);
        }

        System.out.println(result);

    } // end main
} // end class
