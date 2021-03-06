package datastructure.chap04;

public class 투_포인터_01 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};


        int N = arr.length; // 찾아야하는 부분합. 위의 경우! 15가 됨.


        int start = 0, end = 0; // 시작포인터, 끝포인터 선언.

        int M = arr[start]; // 부분합을 저장 (arr[0]도 가능)

        int count = 0; // M이 N이 되는 경우의 수 저장 변수.


        while (end < N) {
//            System.out.printf("start: %d, end: %d, M : %d, count: %d\n", start, end, M, count);
            if (M == N) { // 원하는 합을 발견한 경우
                count++;
                end++;
                if (end < N) { // 마지막 인덱스에서 없는 인덱스로 e를 늘리려고 할 때 에러나기 때문에 그거 막기 위해 장치.
                    M += arr[end];
                }
            } else if (M > N) { // 합이 찾아야하는 값보다 큰 경우
                M -= arr[start];
                start++;
            } else {
                end++;
                M += arr[end];
            }
        } // end while

        System.out.println(count);

    } // end main
} // end class
