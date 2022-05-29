package baekjoon.coding06_String;

import java.util.Scanner;

public class Quiz06Retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "The Curious Case of Benjamin Button";
//        String s = sc.nextLine();
//        sc.close();


        int emptyIdx = 0;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ')) {
//                if (i == 0) {
//                    continue;
//                }

                emptyIdx = i;
                s = s.substring(emptyIdx);

//                if (i - emptyIdx == 1) {
//                    continue;
//                }
                count++;
            }
        }

        System.out.println("count = " + count);

    } // end main
} // end class
