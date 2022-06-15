package datastructure.chap07.merge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_버블소트_1517번 {
/*

       |                 |
       0   1   2   3     4  5   6   7
    [ 24, 32, 42, 60 ] [ 5, 15, 45, 90 ]

    [  5 ]

    - 병합 과정에서 뒤쪽 배열의 값이 작은경우 5의 값이 4번인덱스에서 0번으로 이동하므로
      버블정렬에서 4번 스왑이 일어났다고 볼 수 있음

                             |  |
       0   1   2   3     4   5  6   7
    [ 24, 32, 42, 60 ] [ 5, 15, 45, 90 ]

    [  5, 15, 24, 32  , 42, 45 ]

    - 병합 과정에서 뒤쪽 배열의 값이 작은경우 45의 값이 6번인덱스에서 5번으로 이동하므로
      버블정렬에서 1번 스왑이 일어났다고 볼 수 있음

 */


    // 병합 작업에 쓰일 임시 배열
    public static int[] temp;

    public static int mergeSort(int[] arr, int startIdx, int endIdx) {
        if (endIdx - startIdx < 1) return 0;

        int m = (startIdx + endIdx) / 2;

        mergeSort(arr, startIdx, m);
        mergeSort(arr, m + 1, endIdx);

        for (int i = startIdx; i <= endIdx; i++) {
            temp[i] = arr[i];
        }

        int startPointer = startIdx;
        int secondPointer = m + 1;

        int insertSpot = startIdx;

        int swap = 0; // 스왑 횟수들을 저장할 변수.

        while (startPointer <= m && secondPointer <= endIdx) {
            if (temp[startPointer] < temp[secondPointer]) {
//                swap += startPointer - insertSpot;
                arr[insertSpot++] = temp[startPointer++];
            } else {
                swap += (secondPointer - insertSpot);
                arr[insertSpot++] = temp[secondPointer++];
            }
        }

        while (startPointer <= m) {
//            swap += insertSpot - startPointer;
            arr[insertSpot++] = temp[startPointer++];

        }

        while (secondPointer <= endIdx) {
//            swap += insertSpot - secondPointer;
            arr[insertSpot++] = temp[secondPointer++];
        }

        return swap;

    } // end mergeSort

    public static int sort(int[] arr) {
        temp = new int[arr.length];
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(br.readLine());
//        int N = sc.nextInt();

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
//            arr[i] = sc.nextInt();
        }

        System.out.println(sort(arr));

    } // end main
} // end class
