package datastructure.chap07.merge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 백준_수정렬2_2751번 {

    // 병합 작업에 쓰일 임시 배열
    public static int[] temp;

    public static void mergeSort(int[] arr, int startIdx, int endIdx) {
        if (endIdx - startIdx < 1) return;

        int m = (startIdx + endIdx) / 2;

        mergeSort(arr, startIdx, m);
        mergeSort(arr, m+1, endIdx);

        for (int i = startIdx; i <= endIdx ; i++) {
            temp[i] = arr[i];
        }

        int startPointer = startIdx;
        int secondPointer = m+1;

        int insertSpot = startIdx;

        while (startPointer <= m && secondPointer <= endIdx) {
            if (temp[startPointer] < temp[secondPointer]) {
                arr[insertSpot++] = temp[startPointer++];
            } else {
                arr[insertSpot++] = temp[secondPointer++];
            }
        }

        while (startPointer <= m) {
            arr[insertSpot++] = temp[startPointer++];
        }

        while (secondPointer <= endIdx) {
            arr[insertSpot++] = temp[secondPointer++];
        }

    } // end mergeSort

    public static void sort (int[] arr) {
        temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }


    public static void main(String[] args) throws IOException {

//        int[] arr = {5, 4, 3, 2, 1};
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 배열에 하나씩 정렬 완료

        // 병합 정렬 메서드 사용
        sort(arr);

        // 정렬된 배열 인덱스별 줄바꿈 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
        
    } // end main
} // end class
