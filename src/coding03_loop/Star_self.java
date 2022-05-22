package coding03_loop;

import java.util.Scanner;

public class Star_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j=0; j < n-i ; j++) {
                System.out.print("*");
            }
            for (int j=0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("============================");

        for (int i=0; i < n; i++) {
            for (int j=0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===========================");

        for (int i=0; i < n; i++) {
            if (i % 2 == 1) {
                for (int j=0; j < (2*i)+1; j++) {
                    System.out.print("*");
                }
            } else {

            }
                System.out.println();
        }

    } // end main
} // end class
