package day07;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {

        String str1 = "가나다";

        Scanner sc = new Scanner(System.in); // Scanner라는 클래스가 만들어져있고
                    // new Scanner() 생성자네?! 매개변수로 System.in을 받는구나.

        // sc.~~는 Scanner 클래스에 정의된 메서드(기능)구나!

        String str2 = sc.next();
        sc.close();

        if (str1.equals(str2)) { // == 비교로 하면 가나다를 똑같이 입력해도 일치하지 않는다고 함.
            System.out.println("두 문자열이 일치함");
        } else
            System.out.println("두 문자열이 일치하지 않음");

    } // end main
} // end class
