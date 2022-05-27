package baekjoon.coding04_array;

import java.util.Scanner;

public class Quiz04Retry2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10개의 정수를 입력 받아서 저장할 배열 생성.
        int[] numbers = new int[10];

        // numbers 각 인덱스에 입력받은 값을 초기화.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

         // 배열이 잘 만들어졌는지 중간 확인
//        System.out.println("확인용: "+ Arrays.toString(numbers));

        // numbers들의 각 인덱스를 42로 나눈 나머지들을 저장할 배열 생성.
        int[] transform = new int[numbers.length];

        // transform 배열의 모든 인덱스 기본값을 -1로 해보자.
            // why?? 어떤 수를 나눈 나머지가 음수인 경우는 일단 없다!
            // 굳이 -1로?? 애초에 반복문을 돌려서 기존에 추가한 숫자가 배열 안에 있다면
            // 값 변경 자체를 하지 않으려고 함!!
            // 이렇게 되면 양의 정수는 온전히 자기 자신만 존재!
            // 마지막엔 배열 안에 양의 정수가 얼마나 있는지를 찾으면 된다!

        // transform 배열의 모든 인덱스 기본값 -1로 초기화.
        for (int i = 0; i < transform.length; i++) {
            transform[i] = -1;
        }

        // 기존 numbers를 순회하여 인덱스별 42를 나눈 나머지 값으로 transform에 이미 그 값이 있는지 비교
        for (int i = 0; i < numbers.length; i++) {
            int after = numbers[i]%42;
            int j = 0;
            for (j = 0; j < transform.length; j++) {
                if (transform[j] == after) {
                    break;
                }
            }
            // j가 마지막 인덱스까지 온전히 보고 나왔다면 기존에 해당 값이 없는거임.
            if (j == transform.length) {
                transform[i] = after;
            }
        }
//        System.out.println(Arrays.toString(transform));

        // transform 배열이 완성됨. (겹치는 애 없이)
            // 배열을 순회하여 양수가 몇개 있는지 카운트.
        int count = 0;
        for (int n : transform) {
            if(n >= 0) {
                count++;
            }
        }

        System.out.println(count);

    } // end main
} // end class
