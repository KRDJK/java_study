package coding04_array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz04Retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 정수를 10개 입력받아서 저장할 배열 생성.
        int[] arr = new int[10];


        // 2. 정수 10개 입력 받고 배열에 초기화 하기.
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();


        // 3. arr에서 각 인덱스를 42를 나눈 나머지인 수를 저장할 배열 만들기
            // 3-1. 단! 이전에 이미 추가가 되었던 수는 넣지 말기. 이걸 어떻게??
                // 42를 나눈 나머지를 저장할 새로운 배열의 초기값을 전부 -1로 해두기.
                // 왜 -1?? 어떤 수를 나눈 나머지가 음수일 수는 없기 때문에!!
        int[] transform = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};


        // 4.
//        transform[0] = arr[0]%42;

        for (int i = 0; i < arr.length; i++) {
            int result = arr[i]%42;
            for (int j = 0; j < transform.length; j++) {
                if (transform[j] == result) break;
            }
        }
        System.out.println(Arrays.toString(transform));


        // transform 배열이 완성됐으면 거기서 반복문 돌려서 음수가 아닌 수가 몇개인지 찾는다.
        int count = 0;

        for (int num : transform) {
            if (num >= 0) {
                count++;
            }
        }

        System.out.println(count);
    } //end main
} //end class
