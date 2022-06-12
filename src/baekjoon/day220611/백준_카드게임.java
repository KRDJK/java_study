package baekjoon.day220611;

import java.util.Scanner;

public class 백준_카드게임 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum);
    }
}
