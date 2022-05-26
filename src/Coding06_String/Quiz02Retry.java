package Coding06_String;

import java.util.Scanner;

public class Quiz02Retry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String s = sc.next();

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        System.out.println(sum);

    }
}
