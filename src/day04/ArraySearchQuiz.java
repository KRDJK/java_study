package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        Scanner sc = new Scanner(System.in);

        System.out.println("* 변경 전 정보: " + Arrays.toString(members));

        int index = -1; // 초기 인덱스값.

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print(">> ");
            String name = sc.nextLine();

            for (int i = 0; i < members.length; i++) {
                if (name.equals(members[i])) {
                    index = i;
                    break;
                }
            }

            boolean result = index != -1;

            if (result) {
                System.out.printf("%s의 별명을 변경합니다.\n>> ", name);
                String naming = sc.nextLine();
                members[index] = naming;
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", name);
            }
        } //end while
        sc.close();
        System.out.println("변경 완료!!");
        System.out.println("* 변경 후 정보: " + Arrays.toString(members));
    }
}