package Coding02_if;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(), M = sc.nextInt();
        int cookingTime = sc.nextInt();
        sc.close();

        if (M + cookingTime <= 59) {
            System.out.print(H + " " + (M + cookingTime));
        } else if (M + cookingTime >= 60) {
            H = H + ((M+cookingTime) / 60);
            M = (M+cookingTime) % 60;
            if (H >= 24) {
//                H = H-24;
                H -= 24;
            }
            System.out.println(H + " " + M);
        }
    }
}
