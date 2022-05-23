package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteRetry {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};

        Scanner sc = new Scanner(System.in);

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("지울 인덱스를 입력하세요.");
        System.out.print(">> ");

        int targetIdx = sc.nextInt();
        sc.close();
//        int targetIdx = 2;


        // 1. 원본 배열보다 하나 작은 새로운 배열 생성
        int[] temp = new int[arr.length-1];

        // 2. 삭제할 인덱스 값을 +1 인덱스 값으로 변경. (한 칸씩 값 땡기기)
        /*
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];
        */
        for (int i = targetIdx; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        // 3. arr의 마지막 인덱스를 제외한 값을 temp에 복사.
        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i];
        }

        // 4. 주소값 이전.
        arr = temp; temp = null;

        System.out.println("삭제 후 arr: " + Arrays.toString(arr));

    }
}
