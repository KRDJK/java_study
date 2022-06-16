package day18.collection.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        LinkedList<String> members = new LinkedList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );

        System.out.println("우리반 학생들의 별명: " + members);

//        int idx = -1; // 인덱스 초기값

        while (true) {
            System.out.println("삭제할 학생의 별명을 입력하세요!");
            System.out.print("> ");
            String removeName = sc.nextLine();

            if (members.contains(removeName)) {
                System.out.println(removeName + " 학생의 별명을 삭제합니다.");
                members.remove(removeName);
                break;
            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", removeName);
            }
        } //end while

        System.out.println("* 삭제 후 정보: " + members);
    }
}
