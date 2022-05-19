package day02;

import java.util.Scanner;

public class InputQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");

        System.out.print("- 상품의 가격: ");

        int price = sc.nextInt();

        System.out.print("- 상품의 수량: ");

        int ea = sc.nextInt(); // 수량 : amount

        System.out.println("============================");

        // 재고 총액을 계산해서 담을 변수
        int total = price * ea;

        System.out.printf("- 상품 재고 총액: %d원\n", total);
//        System.out.printf("- 상품 재고 총액: %d원\n", price * ea);


    }
}
