package baekjoon.coding01;

import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble(), num2 = sc.nextDouble();
        System.out.println((int) (num1 + num2));
        System.out.println((int) (num1 - num2));
        System.out.println((int) (num1 * num2));
        System.out.println((int) (num1 / num2));
        System.out.println((int) (num1 % num2));
    }
}
