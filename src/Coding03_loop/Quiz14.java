package Coding03_loop;

import java.util.Scanner;

public class Quiz14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        int inputN =  n;

        while (true) {
            if(n >= 0 && n < 10) {
                n *= 11;
                count++;
                if (n == inputN) {
                    break;
                }
            } else if (n >= 10 && n < 100) {
                int first = n/10, last = n%10;
                int sum = first + last;
                n = (last*10) + (sum%10);
                count++;
                if (n == inputN) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
