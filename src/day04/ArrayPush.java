package day04;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        // 배열 데이터 추가 알고리즘
        int[] arr = {10, 20, 30}; // 40을 3번 인덱스로 추가하고 싶다면???

        int newData = 40;

//        arr[3] = 40; // 이런 식으로는 안된다. 3인실인데 4인실이 어케 가능??
        
        // 1. 원본배열보다 사이즈가 1 큰 새로운 배열 생성
        int[] temp = new int[arr.length + 1];

        // 2. 원본배열의 데이터를 새로운 배열에 복사.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 추가할 데이터를 마지막 인덱스에 추가.
        temp[temp.length - 1] = newData; // arr에 40을 추가하고 싶었는데.. 아직 그게 된건 아님.


        // 4. 주소값 이전.
        arr = temp;
        temp = null;


        System.out.println("원본배열: " + Arrays.toString(arr));
        System.out.println("새로운배열: " + Arrays.toString(temp));
    }
}
