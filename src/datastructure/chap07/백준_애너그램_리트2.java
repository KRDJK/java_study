package datastructure.chap07;

import java.util.Arrays;
import java.util.Scanner;

public class 백준_애너그램_리트2 {
    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
        char[] c1 = new char[first.length()];
        char[] c2 = new char[second.length()];

        for (int j = 0; j < c1.length; j++) {
            c1[j] = first.charAt(j);
        }

        for (int j = 0; j < c2.length; j++) {
            c2[j] = second.charAt(j);
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        StringBuilder sb1 = new StringBuilder();
        for (int j = 0; j < c1.length; j++) {
            sb1.append(c1[j]);
        }

        StringBuilder sb2 = new StringBuilder();
        for (int j = 0; j < c2.length; j++) {
            sb2.append(c2[j]);
        }

        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }


        return false;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
