package datastructure.chap08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 백준_수찾기_1920번 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Long> numbers = new ArrayList<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            numbers.add(sc.nextLong());
        }


        numbers.sort(Long::compareTo);


        int M = sc.nextInt();
        List<Long> numbers2 = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            numbers2.add(sc.nextLong());
        }

//        numbers2.sort(Long::compareTo);


        for (int i = 0; i < N; i++) {
//            int i1 = Arrays.binarySearch(numbers, numbers2.get(i));
        }


    } // end main
} // end class
