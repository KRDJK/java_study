package baekjoon.coding03_loop;

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        String star = "";

        for (int i = 0; i < n; i++) {
            star += "*";
            System.out.println(star);
        }
    }
}
