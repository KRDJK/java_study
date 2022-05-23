package day04;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {50, 150, 200, 250, 300};

        int newNumber = 999; // 신규 삽입데이터
        int targetIdx = 3; // 삽입 위치

        // 50, 150, 200, 250, 270, 300

        System.out.println("삽입 전: " + Arrays.toString(arr));

        // 길이가 1만큼 더 긴 새로운 배열 생성.
        int[] temp = new int[arr.length+1];

        // 일단 원본 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 새로운 배열의 마지막 인덱스에 원본 마지막 인덱스 한번 더 추가.
        // 반복문에 포함된 부분이라 아마 안했어도 됐을듯?? 되네.
//        temp[temp.length-1] = arr[arr.length-1]; // temp {50, 150, 200, 250, 300, 300}


        // 하나씩 밀자.
        /*
        temp[5] = temp[4];
        temp[4] = temp[3];
        temp[3] = temp[2];
        temp[2] = temp[1];
        */

        for (int i = temp.length-1; i > targetIdx ; i--) {
            temp[i] = temp[i-1];
        }

        // 원하는 인덱스에 원하는 숫자 삽입(수정).
        temp[targetIdx] = newNumber;

        // 주소 이전.
        arr = temp;
        temp = null;

        System.out.println("삽입 후: " + Arrays.toString(arr));
    }
}
