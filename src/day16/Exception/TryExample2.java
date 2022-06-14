package day16.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.printf("정수1: ");
            int n1 = sc.nextInt(); // warning : 에러 발생 가능성이 있는 코드 구간
//            sc.close();

            System.out.printf("정수2: ");
            int n2 = sc.nextInt(); // warning

            int div = n1 / n2; // warning
            System.out.println("div = " + div);

//        sc = null;
            sc.close(); // sc가 null이면 에러가 발생할 수 있다. // 따라서 warning
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안됩니다.");

        } catch (InputMismatchException e) {
            System.out.println("정수로만 입력하세요!");

        } catch (NullPointerException e) {
            System.out.println("객체 초기화를 확인하세요!");

        } catch (Exception e) { // 약간 else같이 미처 파악하지 못한 에러에도 대처할 수 있도록!!
            e.printStackTrace();
            System.out.println("알 수 없는 예외 발생! 관리자에게 문의하세요!");
        }


        System.out.println("프로그램 정상 종료!");
    } // end main
} // end class
