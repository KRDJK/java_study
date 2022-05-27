package baekjoon.coding06_String;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

//        String s = "";

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(sc.next());
        }
        sc.close();
//        System.out.println("s = " + s);

        System.out.println(sum);

//        // 문자열을 정수로 변환
//        int transform = Integer.parseInt(s);
//
//        while (transform > 0) {
//            sum += transform % 10;
//            transform = transform / 10;
//        }
//
//        System.out.println(sum);

    }
}
