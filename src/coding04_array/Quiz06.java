package coding04_array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수 받기.
        int test = sc.nextInt();


        // 테스트 케이스 개수만큼 문자열 배열 만들기.
        String[] s = new String[test];


        // 테스트 케이스 수만큼 반복하여 입력받고 순차적으로 배열에 초기화.
        for (int i = 0; i < test; i++) {
            s[i] = sc.next(); // nextLine();은 안되네??
        }
        sc.close();

            // s 배열이 잘 들어왔는지 중간 확인
//        System.out.println("s = " + Arrays.toString(s));


        // s 배열을 순회하여 인덱스별로 나누면.. ex) OOXXOXXOOO 으로 나옴.
            // OOXXOXXOOO 얘 또한 char배열.
            // 1+2+0+0+1+0+0+1+2+3 = 10점..


        for (int i = 0; i < s.length; i++) {
            int sum = 0; // 총점을 저장할 변수.
            int count = 0; // 연속으로 O가 나올 경우 카운트할 변수.

            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == 'O') { // char는 단일 문자라서 홑따옴표인듯
                    sum += 1 + count;
                    count++;
                } else if (s[i].charAt(j) == 'X'){
                    sum += 0;
                    count = 0;
                }
            } // end inner for
            System.out.println(sum);
        } // end outer for

    } // end main
} // end class
