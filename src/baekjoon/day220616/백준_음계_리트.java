package baekjoon.day220616;

import java.util.Scanner;

public class 백준_음계_리트 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] temp = new int[8];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextInt();
        }

        while (true) {

            int count = 0;
            for (int i = 0; i < temp.length-1; i++) {
                if (temp[i+1] - temp[i] == 1) {
                    count++;
                } else {
                    break;
                }
            }
//            System.out.println(count);

            if (count == 7) {
                System.out.println("ascending");
                break;
            } else {
                count = 0;
            }

            for (int i = 0; i < temp.length-1; i++) {
                if (temp[i] - temp[i+1] == 1) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == 7) {
                System.out.println("descending");
                break;
            } else {
                System.out.println("mixed");
                break;
            }
        }

    } // end main
} // end class
