package datastructure.chap05.stack;

import java.util.Scanner;
import java.util.Stack;

// 백준 1874
public class 백준_스택수열_제출용 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 1 ~ N까지의 자연수

        // 만들어야 할 수열
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 자바 api
        Stack<Integer> stack = new Stack<>(); // 인트 스택 생성


        int num = 1; // 자연수값 저장


        // 기호를 저장할 문자열
//        String s = "";
        StringBuilder s = new StringBuilder(); // () 안에 문자를 넣어놓고 시작할 수도 있고
                                                // 비워두면 빈문자열이 된다.


        // 수열 배열에서 값을 하나씩 뽑아서 push, pop 여부 확인
        for (int i = 0; i < A.length; i++) {
            int targetNum = A[i]; // 현재 수열 값
            if (targetNum >= num) { // push인 경우
                while (targetNum >= num) {
                    stack.push(num++);
//                    s += "+\n";
                    s.append("+\n");
                } // end while

                // 마지막에 들어간 수를 pop
                stack.pop();
//                s += "-\n";
                s.append("-\n");

            } else { // pop인 경우
                int n = stack.pop();

                // 스택의 가장 위의 수가 현재 구해야할 수열값보다 크면
                // 수열 출력이 성립이 안된다.
                if (n > targetNum) {
//                    s = "NO";
                    s = new StringBuilder("NO");
                    break;
                } else {
//                    s += "-\n";
                    s.append("-\n");
                }
            }
        } // end outer-for


        System.out.println(s);


    } // end main

} // end class
