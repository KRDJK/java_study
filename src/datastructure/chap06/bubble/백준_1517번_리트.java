package datastructure.chap06.bubble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_1517번_리트 {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            int j = i;
            while (j > 0 && arr[j-1] >= temp) {
                arr[j] = arr[j-1];
                j--;
                count++;
            }
            arr[j] = temp;
        }

        System.out.println(count);

    } // end main
} // end class
