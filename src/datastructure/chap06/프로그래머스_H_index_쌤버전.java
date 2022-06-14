package datastructure.chap06;

import java.util.Arrays;

public class 프로그래머스_H_index_쌤버전 {
    /*

 논문 5편 중 h번 이상 인용된 논문이 h편 이상이다

 인용횟수(h) 배열 [ 4, 0, 6, 1, 5 ] => [ 0, 1, 4, 5, 6 ]

 인용횟수 h     해당 논문보다 인용횟수가  같거나
                    많은 논문의 편수
 ================================

     0                  5
     1                  4
     4                  3
     5                  2
     6                  1
     */

    public static int solution(int[] citations) {
        int answer = 0;

        // 인용횟수 배열 정렬
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution(citations));

    } // end main
} // end class
