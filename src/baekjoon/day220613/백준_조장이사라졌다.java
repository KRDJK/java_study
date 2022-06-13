package baekjoon.day220613;

import java.util.Scanner;

public class 백준_조장이사라졌다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            n -= 5;
            count++;
        }
        System.out.println(count);
    }
}
