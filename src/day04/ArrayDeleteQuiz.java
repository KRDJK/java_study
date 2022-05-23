package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("우리반 학생들의 별명: " + Arrays.toString(members));

        int idx = -1; // 인덱스 초기값

        while (true) {
            System.out.println("삭제할 학생의 별명을 입력하세요!");
            System.out.print("> ");
            String removeName = sc.nextLine();

            for (int i = 0; i < members.length; i++) {
                if (members[i].equals(removeName)) {
                    idx = i;
                    break;
                }
            }

            if (idx != -1) {
                System.out.println( members[idx] + "의 별명을 삭제합니다.");

                String[] temp = new String[members.length-1];

                // idx를 기준으로 한칸씩 땡겨야 함
                for (int i = idx; i < members.length-1; i++) {
                    members[i] = members[i+1]; // 만약에 idx가 1번이면 1번에 2번 값을, 2번에 3번 값을, 3번에 4번 값으로!! 4번은 length-1
                                                //
                }

                for (int i = 0; i < members.length-1; i++) {
                    temp[i] = members[i];
                }

                members = temp;
                temp = null;
                break;
            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", removeName);
            }
        } //end while
        System.out.println("* 삭제 후 정보: " + Arrays.toString(members));
    }
}
