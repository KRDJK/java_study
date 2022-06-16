package datastructure.chap08;

import java.util.Arrays;

public class Search {

    // 선형 탐색 (장점 : 정렬이 선행되지 않아도 할 수 있다.)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    // 이진 탐색 (정렬이 먼저 선행된 후!! 이 알고리즘을 사용해야 한다.)
    public static int binarySearch(int[] arr, int target) {
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
        int[] arr = {3, 7, 11, 12, 27, 49, 53, 68, 72, 91};

        int target = 53;
        System.out.printf("Linear Search(%d's index): %d\n", target, linearSearch(arr, target));
        System.out.printf("Binary Search(%d's index): %d\n", target, binarySearch(arr, target));

        System.out.println(Arrays.binarySearch(arr, target));

    } // end main
} // end class
