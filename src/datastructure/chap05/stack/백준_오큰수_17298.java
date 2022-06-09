package datastructure.chap05.stack;

import java.util.Scanner;
import java.util.Stack;

public class 백준_오큰수_17298 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        // 스택 생성
        Stack<Integer> stack = new Stack<>();


        StringBuilder s = new StringBuilder();



        // 스택에 값 넣기    // 값을 넣으면서 동시에 진행해볼 수 있을까??
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (!stack.isEmpty()) {
                int temp = stack.pop(); // 기존에 있던 수

                if (temp < num) { // 오큰수면
                    s.append(num);
                    stack.push(num); // 이래야 어쨌든 계속 볼 수 있다..
                    
                } else { // 오큰수가 아니면
                    stack.push(num);
                }
            }

            stack.push(num);



        } // end for

//        System.out.println(stack.peek()); 확인용
//        while (!stack.empty()) {
//            int result = stack.pop();
//            System.out.println(result);
//        }







    } // end main
} // end class
