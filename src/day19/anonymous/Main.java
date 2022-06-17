package day19.anonymous;

import utility.Util;

public class Main {

    // 내부 클래스 (이 때는 클래스에 static을 붙일 수 있다.)
    public static class SubOperator implements Calculator {
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    } // end SubOperator



    public static void main(String[] args) {

        Calculator addCal = new AddOperator();
        System.out.println(addCal.operate(10,20));


        Calculator subCal = new SubOperator();
        System.out.println(subCal.operate(50, 30));
        


        // 익명 클래스
        Calculator multiCal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }; // 이 중괄호의 의미는 class를 만들겠다는 뜻이다.

        System.out.println(multiCal.operate(5,3));



        // 람다
        Calculator divCal = (n1, n2) -> n1 / n2;
        System.out.println(divCal.operate(100, 50));


        Util.line();


        PowerfulOperator po = (f, s, cal) -> cal.operate(f, s);

        System.out.println(po.powerOperate(300, 500, new AddOperator()));
        System.out.println(po.powerOperate(700, 200, new SubOperator()));
        System.out.println(po.powerOperate(10, 30, new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }));

        System.out.println(po.powerOperate(1000, 200, (n1, n2) -> n1 / n2));

    } // end main
} // end class
