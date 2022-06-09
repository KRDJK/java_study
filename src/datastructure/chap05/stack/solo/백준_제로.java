package datastructure.chap05.stack.solo;

import java.util.Scanner;
import java.util.Stack;

public class 백준_제로 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        // 스택 생성
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int n = sc.nextInt();
            if (n != 0) {
                stack.add(n);
            } else {
                stack.pop();
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            int result = stack.pop();
            sum += result;
        }

        System.out.println(sum);

    } // end main
} // end class
