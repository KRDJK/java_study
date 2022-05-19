package day02;

public class RandomExample {

    public static void main(String[] args) {

        // 난수 생성
        double rn = Math.random(); // 0.0 ~ 1.0 미만의 양수의 실수들을 리턴하기 때문.
        System.out.println("rn = " + rn);

        // 1이상 10이하의 랜덤 정수를 받고 싶을 땐??
        /*
            Math.random()                   -> 0.0 <= ~ < 1.0
            Math.random() * 10              -> 0.0 <= ~ < 10.0
            (int) (Math.random() * 10)      -> 0 <= ~ < 10  0부터 9까지
            (int) (Math.random() * 10) +1   -> 1 <= ~ < 11  1부터 10까지
        */

        int num = (int) (Math.random() * 10) +1;
//        int num2 = (int) Math.random() * 10 +1;
//                  이러면 영원히 1만 나옴 우선순위에 따라서! (int)는 형 변환하라는 단항연산자!
        System.out.println("num = " + num);
    }

}
