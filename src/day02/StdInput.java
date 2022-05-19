package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdInput {

    public static void main(String[] args) throws IOException {

//        System.in.read(); // 이랬더니 종료됐다는 코드가 뜨지 않고 눌러보면 깜빡이며 입력할 수 있는 부분이 나옴.
        // 입력값을 변수에 담아서 쓰려고 했는데...

//        int inputData = System.in.read();
//        System.out.println(inputData);

        // 스캐너 api 사용
        Scanner sc = new Scanner(System.in); // main처럼 입력을 받고 싶으면 무조건 앞에 써라.

        // 스캐너의 함수들
        /*
            - next(): 문자열을 입력받을 때, 공백은 처리불가.
            - nextLine(): 문자열 입력, 공백 포함 가능.
            - nextInt() : 정수를 입력.
            - nextDouble(): 실수를 입력.
         */

//        String name = sc.next(); // 공백처리를 못함. 공백 발생 이전까지만 입력 받음.
        System.out.print("이름: "); // 출력문을 따로 위에 적는다. JS에서랑 다름.
        String name = sc.nextLine();// 공백까지 입력받을 수 있음.
        System.out.println("name = " + name);

        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.println("age + 10 = " + (age + 10));

        // 스캐너 메모리 해제
        sc.close();

    }

}
