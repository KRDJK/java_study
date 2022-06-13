package datastructure.chap06.bubble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_1517번_버블소트 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = arr.length-1; i > 0; i--) {
//            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) { // 왼쪽이 더 큰 수라면
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
//            if (!flag) break;
        }

        System.out.println(count);

    } // end main
} // end class
