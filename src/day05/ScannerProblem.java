package day05;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("정수: ");
        int n = sc.nextInt(); // 100 이라고 입력하면 눈에 보이지 않지만 100\n으로 됨.
                            // 100만 취하고 \n은 buffer라는 공간에 남아있음.
                            // 다음 nextLine()에 후다닥 강제로 소비함.

        // 이 현상을 막으려면? nextInt()의 잔여공백(\n)을 처리하고 넘어가야함. => buffer를 지우고 가야한다는 뜻!
        sc.nextLine(); // 여기서 \n을 소비하게끔 유도.

        System.out.printf("문자열: ");
        String s = sc.nextLine();

        System.out.println("s = " + s);
        sc.close();
    }
}
