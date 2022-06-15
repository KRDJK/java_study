package datastructure.chap07.merge;

import java.util.Arrays;

public class Merge {
    
    // 병합 작업에 쓰일 임시 배열
    public static int[] temp;

    /**
     * 
     * @param arr - 분할할 배열
     * @param startIdx - 분할 시작 위치
     * @param endIdx - 분할 끝 위치
     */
    // 병합 정렬 알고리즘
    private static void mergeSort(int[] arr, int startIdx, int endIdx) {

        // 분할한 배열의 원소가 1개 이하면 return (그만 분할해라)
        if (endIdx - startIdx < 1) return; // 재귀함수 종료조건
        
        
        // 분할의 중앙점을 찾아야 함. divide할 구간
        int m = (startIdx + endIdx) / 2;


        // 분할 작업
        mergeSort(arr, startIdx, m);
        mergeSort(arr, m+1, endIdx);


        // 분할 끝.
        // 병합 작업 시작 (투 포인터 알고리즘 사용)
        
        // 부분 배열을 임시 배열에 저장
        for (int i = startIdx; i <= endIdx; i++) {
            temp[i] = arr[i];
        }

        // 포인터 2개 선언
        int startPointer = startIdx;
        int secondPointer = m + 1;

        // 포인터끼리 비교한 후 원본 배열에 넣어야 할 위치를 지정.
        int insertSpot = startIdx;


        // 병합 루프
        while (startPointer <= m && secondPointer <= endIdx) {
            if (temp[startPointer] < temp[secondPointer]) {
                arr[insertSpot++] = temp[startPointer++];
            } else {
                arr[insertSpot++] = temp[secondPointer++];
            }
        }
        
        /*
            오른쪽 부분 배열이 먼저 소모된 경우에는,
            왼쪽 부분배열은 아직 데이터가 남아있기 때문에
            마저 뽑아서 원본배열에 순서대로 채워야 한다.
            (반대의 경우(왼쪽 부분 배별이 먼저 소모된 경우)도 고려해야 함!!)
         */

        while (startPointer <= m) { // 이게 true가 될 때는 오른쪽 부분 배열이 다 소모되어 왼쪽게 남은 경우다.
            arr[insertSpot++] = temp[startPointer++];
        }

        while (secondPointer <= endIdx) {
            arr[insertSpot++] = temp[secondPointer++];
        }

    } // end mergeSort



    public static void sort(int[] arr) {
        temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    } // 사용 편의성을 위한 sort 함수 정의



    public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    } // end main

} // end class
