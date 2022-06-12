package datastructure.chap05.stack;

import java.util.Stack;

// 백준 1874
public class 백준_스택수열 {

    public static void main(String[] args) {

        int N = 8; // 1 ~ N까지의 자연수

        // 만들어야 할 수열
        int[] A = {4, 3, 6, 8, 7, 5, 2, 1};


        // 자바 api
        Stack<Integer> stack = new Stack<>(); // 인트 스택 생성


        int num = 1; // 자연수값 저장


        // 기호를 저장할 문자열
        String s = "";


        // 수열 배열에서 값을 하나씩 뽑아서 push, pop 여부 확인
        for (int i = 0; i < A.length; i++) {
            int targetNum = A[i]; // 현재 수열 값
            if (targetNum >= num) { // push인 경우
                while (targetNum >= num) {
                    stack.push(num++);
                    s += "+\n";
                } // end while

                // 마지막에 들어간 수를 pop
                stack.pop();
                s += "-\n";

            } else { // pop인 경우
                int n = stack.pop();

                // 스택의 가장 위의 수가 현재 구해야할 수열값보다 크면
                // 수열 출력이 성립이 안된다.
                if (n > targetNum) {
                    s = "NO";
                    break;
                } else {
                    s += "-\n";
                }
            }
        } // end outer-for


        System.out.println(s);


    } // end main

} // end class
