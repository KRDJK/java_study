package datastructure.chap08;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class 백준_수찾기_1920번 {
    public static int binarySearch(Integer[] arr, int target) {
        // 왼쪽 포인터, 오른쪽 포인터, 중앙 포인터 선언
        int left = 0;
        int right = arr.length-1;
        int mid;

        while (left <= right) { // 역전되면 못찾은거다

            // mid 인덱스 계산
            mid = (left + right) / 2;


            // 찾고자 하는 값이 mid값과 일치할 경우 탐색 종료
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } // end while
        return -1;
    } // end binarySearch
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            numbers.add(sc.nextInt());
        }


        numbers.sort(Integer::compareTo);


        int M = sc.nextInt();
        List<Integer> numbers2 = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            numbers2.add(sc.nextInt());
        }


        Integer[] numbers1 = (Integer[]) numbers.toArray();


        for (int i = 0; i < N; i++) {
            int i1 = binarySearch(numbers1, numbers2.get(i));
            System.out.println(i1);
        }


    } // end main
} // end class
