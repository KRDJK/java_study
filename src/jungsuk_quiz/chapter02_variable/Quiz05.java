package jungsuk_quiz.chapter02_variable;

public class Quiz05 {
    public static void main(String[] args) {
        /*
        문제 : 출력결과를 적으세요. 오류가 있다면, 오류라고 적으세요.
        System.out.println(“1” + “2”) ( ) → 12
        틀림. System.out.println(true + “”) ( ) → 오류가 아닌 true
        System.out.println(‘A' + 'B') ( ) → 131
        틀림. System.out.println('1' + 2) ( ) → 3이 아닌 51
        틀림. System.out.println('1' + '2') ( ) → 3이 아닌 99
        System.out.println('J' + “ava”) ( ) → Java
        System.out.println(true + null) ( ) → 오류일듯.
        */

        System.out.println("1" + "2");
        System.out.println(true + "");
        System.out.println('A' + 'B');
        System.out.println('1' + 2);
        System.out.println('1' + '2');
        System.out.println('J' + "ava");
//        System.out.println(true + null);
    }
}
