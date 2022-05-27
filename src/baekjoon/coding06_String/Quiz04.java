package baekjoon.coding06_String;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 횟수
//        sc.nextLine();
//        System.out.println(T);
        
//        int R = sc.nextInt(); // 반복 횟수

//        String S = sc.nextLine(); // 하나씩 떼어서 반복할 문자열

//        String P = ""; // 최종 출력해야할 문자열

        /*
            String s = ABC; int R = 3
                AAA
        */


        for (int i = 0; i < T; i++) {
            int R = sc.nextInt(); // 반복횟수 입력 받고.
//            sc.nextLine();
//            System.out.println(R);
            String S = sc.next();
//            System.out.println(S);
                // 문자열도 입력받는다. 왜 nextLine으로 했을 땐 안됐지??
                // next()는 공백 인식 못한다며..
                // 문제에서 문자열 S는 공백으로 구분되어 주어진다해서 nextLine을 사용한건데...

            String P = ""; // 최종 출력할 배열 생성해두기.
            for (int j = 0; j < S.length(); j++) {  // 문자열의 길이만큼 돌건데
                for (int k = 0; k < R; k++) { // 반복횟수 동안 인덱스별 추가 대입.
                    P += String.valueOf(S.charAt(j));
                }
            }
            System.out.println(P);
        }

//        System.out.println("P = " + P);

    } // end main
} // end class
