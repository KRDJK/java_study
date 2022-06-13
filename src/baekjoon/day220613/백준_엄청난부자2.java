package baekjoon.day220613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 백준_엄청난부자2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());

        System.out.println(n/m);
        System.out.println(n%m);
    }
}
