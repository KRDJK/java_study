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
                
            }
            
        }


    } // end main
} // end class
