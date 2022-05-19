package day02;

public class Casting1 {

    public static void main(String[] args) {

        byte a = 100; // 1byte 할당

        int b = a; // 에러는 안나지만 엄청난 오류가 있다. why????
                    // a가 int로 자동 형 변환되었기 때문!!! JAVA 가상 머신이 해준다.(묵시적 형변환)

//        묵시적 형변환은!! 그렇게 해도 전혀 문제가 없을 때 된다고 보면 된다.
        double c = b; // b가 double로 자동 형 변환됨.
        System.out.println("c = " + c);


    }

}
