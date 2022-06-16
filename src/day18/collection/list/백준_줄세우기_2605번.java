package day18.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 백준_줄세우기_2605번 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            list.add(i-num, i+1);
        }


        for (int m : list) {
            System.out.printf("%d ", m);
        }

    } // end main
} // end class
