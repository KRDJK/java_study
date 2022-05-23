package day04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {

        // 1. 배열 변수 선언
        int[] arr;


        // 2. 배열의 생성
        arr = new int[5]; // arr에는 실제 숫자 5개가 들어가는 것이 아닌 숫자 5개가 있는 방의 주소가 들어았다.
        // 정확히는 arr[0]의 주소값이 들어간다. 하나만 알면 다 옆집이라 금방 알 수 있으니까!

        System.out.println(arr); // 이랬더니 [I@5594a1b5 라고 나오네
        // [I는 int 배열이라는 뜻!    @ 이후의 주소에 이 배열 애들이 저장되어 있다는 뜻!
        // @ 이후의 주소는 정확히 arr[0]의 주소다.


        // 3. 배열값 초기화 (맨 처음 값을 저장하는 행위)
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0] + 20; // 50이 저장됨.
        arr[3] = (int) 66.7; // 66.7이라고 했더니 에러가 남. int 타입의 배열이라고 했는데 double임.
                // 그래서 줄여서 들어가겠다! 66으로 배열값에 들어감. 66.0도 아닌 66!!
        arr[4] = 100;
//        arr[5] = 55; // 5개라고 했더니 왜 6개 넣었어? 근데 에러가 안나고 노란 줄만 나오네..
        // 빨간 줄은 컴파일 에러라서 실행 전에 알 수 있는데 이러면 실행 중에 에러가 나버림... 아주 무서운 상황..

        // indexof out of bounds 이런 식으로 에러가 남.

        // 배열의 길이 - 저장 데이터 개수
        System.out.printf("배열의 길이: %d\n", arr.length);
        // 위에 인덱스별 값들을 처음에 넣어주지 않았어도 길이는 5이고, 인덱스별 값들이 저장이 되어 있긴 함.. 무슨 값이 들어있을까??

        // 배열 내부 값 확인
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println(); // 줄바꿈
        System.out.println("================================");

        // 배열 전용 반복문 (향상된 for : Enhanced for Loop) => JS에서의 for of문과 비슷하다
        for (int n : arr) {
            System.out.printf("%d ", n);
        }
        System.out.println();
        System.out.println("================================");

        // 배열 내부값 출력 함수   Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));

//        String s = Arrays.toString(arr);

        // 값 목록을 나열하여 배열 생성하기
        int[] numbers = new int[] {10, 20, 30, 40};

        System.out.println(Arrays.toString(numbers));

        // new String[] 이런 구문은 배열변수 선언시에만 생략가능.
        String[] foods = new String[] {"사과", "복숭아", "파인애플"};
        foods[1] = "수박";

            // 이 때는 생략할 수 없음.
            foods = new String[] {"짜장면", "탕수육", "짬뽕"}; // 원래 있던 값을 변경하려는 시도라 생략 불가.

        System.out.println(Arrays.toString(foods));

        // 배열을 생성만하고 초기화하지 않는다면..? 실시간으로 입력받아서 배열에 넣고 싶을 떄!!
        // -> 해당 타입의 기본값으로 자동초기화됨.
        System.out.println("==================================");

        double[] dArr = new double[3]; // 빈배열을 만들고 싶으면 [0]

        System.out.println("dArr.length = " + dArr.length);
        System.out.println(Arrays.toString(dArr));

    } // end main
} // end class
