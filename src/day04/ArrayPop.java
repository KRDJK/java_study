package day04;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {

        // 배열의 맨 끝 데이터 삭제
        int[] arr = {10, 20, 30, 40};

        // 1. 기존 배열보다 크기가 1 작은 새 배열 생성.
        int[] temp = new int[arr.length-1];

        // 2. 원본 배열의 끝 인덱스만 빼고 나머지 인덱스들을 복사.
        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i];
        }

        // 3. 주소값 이전.
        arr = temp;
        temp = null;

        System.out.println("하나 제거한 arr: " + Arrays.toString(arr));
    }
}
