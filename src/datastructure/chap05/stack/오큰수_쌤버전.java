package datastructure.chap05.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수_쌤버전 {
    public static void main(String[] args) throws IOException {

        /*A   3 5 2 7
        S   5 7 7

        1:  A[0] < A[1] -  S[0] = A[1]
        2:  A[1] > A[2] -  1번인덱스 스킵
        3:  A[2] < A[3] -  S[2] = A[3]
        A[1] < A[3] -  S[1] = A[3]


        A   9 5 4 8
        S  -1 8 8 -1

        1: A[0] > A[1]  - 0번 스킵
        2: A[1] > A[2]  - 1번 스킵
        3: A[2] < A[3]  - S[2] = A[3]
        A[1] < A[3]  - S[1] = A[3]
        A[0] > A[3]  - 0번 스킵*/


        // 스캐너 처음 생성시 선언부랑 역할이 같다. 입력 한 줄당 br.readLine이 같이 나와줘야 함.
        // br.readLine을 쓰면 무조건 String으로 입력을 받아온다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // String으로 받아오기 때문에 정수형으로 변환
        int[] A = new int[N]; // 수열 배열
        int[] answer = new int[N]; // 정답 배열

        StringTokenizer st = new StringTokenizer(br.readLine()); // 토크나이저. 공백을 기준으로 String을 쪼개준다.
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음에는 스택이 비어있으므로 항상 최초값을 추가

        // 3 5 2 7    || 5 7 7 -1
        for (int i = 1; i < N; i++) {

            while (!stack.isEmpty() && A[stack.peek()] < A[i]) { // 최초에는 A[0] < A[1]이 됨.
                answer[stack.pop()] = A[i]; // 정답 배열에 오큰수를 저장
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int n : answer) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);

    } // end main
} // end class
