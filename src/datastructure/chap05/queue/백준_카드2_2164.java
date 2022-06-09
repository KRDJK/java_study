package datastructure.chap05.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준_카드2_2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        // 큐 생성
        Queue<Integer> que = new LinkedList<>();


        // 큐에 카드 리스트 만들기
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }


        while (que.size() > 1) {

            // 일단 제일 앞에서 한장 버린다.
            que.poll();

            // 앞에서 한번 더 버리면서 그걸 저장해놓는다.
            // why?? 다시 넣어줄거니까
            int temp = que.poll(); // 지움과 동시에 리턴해주기 때문에 가능함.

            // 앞에 카드를 뒤에 다시 집어넣음.
            que.add(temp);
            
        }

//        System.out.println(que.toString());
        System.out.println(que.poll());

    } // end main
} // end class
