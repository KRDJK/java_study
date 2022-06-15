package datastructure.chap07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_애너그램_리트 {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            StringTokenizer st = new StringTokenizer(s, " ");

            StringTokenizer st2 = new StringTokenizer(s, " ");

//            String[] strings = new String[2];
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            char[] c1 = new char[s1.length()];
            char[] c2 = new char[s2.length()];

            for (int j = 0; j < c1.length; j++) {
                c1[j] = s1.charAt(j);
            }

            for (int j = 0; j < c2.length; j++) {
                c2[j] = s2.charAt(j);
            }

            Arrays.sort(c1);
            Arrays.sort(c2);

            StringBuilder sb1 = new StringBuilder();
            for (int j = 0; j < c1.length; j++) {
                sb1.append(c1[j]);
            }

            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < c2.length; j++) {
                sb2.append(c2[j]);
            }

            if (sb1.equals(sb2)) {
                System.out.println(st2.nextToken() + " & " + st.nextToken()
                        + " are anagrams.");
            } else {
                System.out.println(st2.nextToken() + " & " + st.nextToken()
                        + " are NOT anagrams.");
            }
        }


    } // end main
} // end class
