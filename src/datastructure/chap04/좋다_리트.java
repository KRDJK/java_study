package datastructure.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class 좋다_리트 {
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
            int target = arr[i];
            int start = 0, end = N-1;

            // 투 포인터 알고리즘
            while (start < end) {
                // 포인터가 지목한 두 수의 합
                long sum = arr[start] + arr[end];

                if (sum == target) { //
                    if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    } else { // 내가 아닌 두 수의 합
                        count++;
                        break;
                    }
                } else if (sum < target) {
                    start++; // 타겟 숫자에 가까워지려면 스타트가 움직여야 함.
                } else {
                    end--; // 반대
                }

            } // end while

        } // end for
        

        System.out.println(count);


    } // end main
} // end class
