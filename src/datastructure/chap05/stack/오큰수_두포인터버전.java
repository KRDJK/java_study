package datastructure.chap05.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 오큰수_두포인터버전 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }


        int start = 0;
        int end = 1;

//        StringBuilder s = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();

        while (start < A.length - 1) {

//            System.out.println("start = " + start);
//            System.out.println("end = " + end);

            if (A[start] < A[end]) { // end가 오큰수인 경우
                que.add(A[end]);
//                s.append(" ");
                start++;
                end++;

                if (end == A.length) {
                    end = start + 1;

                    if (start == A.length - 1) {
                        que.add(-1);
                        break;
                    }
                }
            } else if (A[start] >= A[end]) { // 오큰수가 아닌 경우
                end++;

                if (end == A.length) {
                    que.add(-1);
//                    s.append(" ");
                    start++;
                    end = start + 1;

                    if (start == A.length - 1) {
                        que.add(-1);
                        break;
                    }
                }
            }
        }// end while

//        String result = String.valueOf(s);


        /*
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (s.charAt(i) == '-') {
                    int c = (s.charAt(i+1) - '0') * -1;
                    que.add(c);
//                    System.out.println(c);
                    i++;
                } else {
                    int c = (s.charAt(i) - '0');
                    que.add(c);
//                    System.out.println(c);
                }
            }
        }
        */

        while (!que.isEmpty()) {
            if (que.size() == 1) {
                System.out.print(que.poll());
            } else {
                System.out.print(que.poll()+ " ");
            }
        }

//        System.out.println(s);

    } // end main
} // end class
