package datastructure.chap05.stack.solo;

import java.util.Scanner;
import java.util.Stack;

public class 백준_스택수열_혼자도전 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();


        int num = 1;

        String s = "";

        for (int i = 0; i < arr.length; i++) {
            int targetNum = arr[i];
            
            if (targetNum >= num) { // push해야하는 경우
                while (targetNum >= num) { // num++하면서 targetNum과 같아질 때까지 반복
                    stack.push(num++);
                    s += "+\n";
                }

                stack.pop();
                s += "-\n";

            } else { // poll 해야하는 경우
                int m = stack.pop();

                if (m > targetNum) { // 가장 맨 위에 있던 수가
                    s = "NO";
                } else {
                    s += "-\n";
                }
            }
        }

        System.out.println(s);

    } // end main
} // end class
