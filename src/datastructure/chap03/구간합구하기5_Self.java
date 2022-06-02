package datastructure.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 구간합구하기5_Self {
    public static void main(String[] args) throws IOException {

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()),
                M = Integer.parseInt(st.nextToken());
        // N이 4라고,  M은 3이라고 가정하고 진행해보자.

        int[][] A = new int[N][N];

        // 입력받는다면
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        // 이차원 합배열 S를 만들어야 함. 5x5로 만들어야겠네?? [N+1][N+1]
        int[][] S = new int[N + 1][N + 1];

        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j <= N; j++) {
                S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i-1][j-1];
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()),
                    y1 = Integer.parseInt(st.nextToken()),
                    x2 = Integer.parseInt(st.nextToken()),
                    y2 = Integer.parseInt(st.nextToken());
            System.out.println(S[x2][y2] - S[x1 - 1][y2] - S[x2][y1 - 1] + S[x1 - 1][y1 - 1]);
        }

    } // end main
} // end class
