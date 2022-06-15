package datastructure.chap07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_애너그램 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());



        for (int i = 0; i < T; i++) {
            String[] sArr = new String[2];
            sArr[0] = br.readLine();
            sArr[1] = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());

            String[] sArr2 = new String[2];
            sArr2[0] = st.nextToken();
            sArr2[1] = st.nextToken();
        }

    } // end main
} // end class
