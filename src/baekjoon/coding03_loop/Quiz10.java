package baekjoon.coding03_loop;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        String star = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                star += " ";
            }
            for (int j = 0; j < i; j++) {
                star += "*";
            }
            star += "\n";
        }
        System.out.println(star);

    }
}
