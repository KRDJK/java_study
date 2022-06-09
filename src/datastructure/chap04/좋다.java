package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 좋다 {
    public static void main(String[] args) {
        /* for ( A의 길이만큼 )
        *     target에 숫자를 하나씩 저장
        *   while  (s < e)
        *   M = A[s] + A[e];
        * if (target == M) // 경우의 수 올리기
        * else if (target < M) ... 어렵네... */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);


        int count = 0; // 좋은 수의 개수 카운트


        for (int i = 0; i < arr.length; i++) {
            int start = 0;

            int end = N-1;

            int target = arr[i];

            System.out.println("target = " + target);

            while (start < end) {

                if (start == i) {
                    start++;
//                    continue;
                } else if (end == i) { // target 2일 때 start = 0, end = 0 이되는 구간이 발생!
                    end--;
//                    continue;
                }

                System.out.println("start = " + start);
                System.out.println("end = " + end);

                int sum = arr[start] + arr[end];
                System.out.println("sum = " + sum);

                if (sum == target) { // 여기서 검사를 하는게 맞다..
                                    // 합한 값이 타겟이랑 같을 때 서로 합하는 값들 중 타겟값이 있으면 안된다.
                    count++;
                    System.out.println("count++");
//                    start++;
//                    end--;
                    break;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }


        System.out.println(count);



    } // end main
} // end class
