package day02;

public class Casting3 {

    public static void main(String[] args) {

        // 타입이 다른 데이터의 연산에서는
        // 작은 쪽을 큰 쪽으로 변환한 후 연산을 진행.
        int a = 10;
        short b = 30;
        int c = a + b; // 이 경우 자바 가상에서 a + (int) b;를 알아서 한 것!!


        // 주의!!
        // 문자열(String) + 숫자 = 문자열.
        // 단일 문자(char) + 숫자 = 숫자.

        char d = 'A'; // 2byte 컴퓨터는 얘를 65로 알고 있다.
        int e = 100; // 4byte
        System.out.println(d + e); // 결과는 165

        char f = (char) (d + e); // d+e는 int라서 다운 캐스팅 해야함.
        System.out.println("f = " + f); // 165에 해당하는 단일문자 반환

        System.out.println(3.0 + 5); // 8.0이 나옴.

        byte b1 = 100;
        byte b2 = 20;

        int result = b1 * b2; // 둘이 더한게 120인데도 안된다고 하네???
                                  // 왜??? 둘이 더한게 int라는데?? why??
        /*
            int보다 작은 데이터 (byte, short, char)
            끼리의 연산은 결과가 자동으로 int로 변환되어 처리.(자바가 자동으로 안전장치를 넣는다.)
                자바 왈: 조그만 애들끼리 연산(덧셈뿐만 아니라 곱셈의 경우에도)을 하다보면
                        금방 너무 커져버릴 위험이 있는데?? 그럼 애초에 int로 해줄게.
            (스택 오버플로우, 언더플로우 방지)
        */

        System.out.println('A' + 'B'); // 결과 131이 나옴. 단일 문자 + 단일 문자
                                        //int보다 작은 애들끼리의 연산이기 때문에 자동 int로 변환되었기 때문!!
        System.out.println("A" + "B"); // AB가 나옴. 문자열 + 문자열 = 결합된 문자

    }

}
