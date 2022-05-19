package day02;

public class DataType {

    public static void main(String[] args) {

    // 정수타입
    byte a = 127; // 128이라고 했을 때 범위를 초과해서 에러가 났었음. 최대 범위는 127
    short b = 32767;
    int c = 2147483647;
    long d = 2147483648L; // 2147483648이 왜 에러..? long은 900경까지 저장된다매
                         // why? : 2147483648 리터럴 자체는 int로 된다.
                            // 범위가 int 범위를 넘어가기 때문에 리터럴 자체가 안된 상태.
                            // 이럴 땐 리터럴 하려는 값 뒤에 L을 붙여주면 된다.
        System.out.println("d = " + d); // 뒤에 L이 반영되진 않는다.
        
        int i;
        double n = 0.0;
        for (i=0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println("n = " + n);

        // 실수 타입
        float f1 = 1.2345678901234F; // 4byte 할당
        double d1 = 1.2345678901234; // 8byte 할당

        System.out.println("f1 = " + f1); // 용량의 제약 때문에 소숫점 7번째 자리만 쓴다.
        System.out.println("d1 = " + d1);

        // 논리 타입
        boolean b1 = true;
        boolean b2 = false;
//      JAVA에선,JS랑 다르게 정확히 true, false 아니면 안됨!!
//      JS에선 논리형 결과가 도출이 되면 뭐든 다 됐었는데..

//        아래의 경우 JS에서는 다 됐지만 java에서는 안됨
//        boolean b3 = TRUE;
//        boolean b4 = 0;
//        boolean b5 = "true";

//        while (true) {}

        // 문자 타입
        // 기본 타입 : char ==>> 이게 c언어에서는 정수 타입
        // char는 2byte할당, 음수 개념이 없음!! 글자 1글자만 저장 가능하다.

        char c1 = 'A'; // 한 글자만 저장할 때 무조건 홑따옴표!!
                        // 2글자 이상이면 쌍따옴표!!
        char c2 = 44032;
        System.out.println("c2 = " + c2);


        // 문자열 타입 String
        // String은 기본 타입이 아니다. 객체다. char 배열이 들어있다고 보면 됨.
        String s1 = "hello"; // char가 5개 필요
        String s2 = "hello java"; // 10글자임(공백 포함) char가 10개 필요

        // 문자 + 숫자 = 문자다.
        System.out.println(s1 + 300 + 120);
    }

}
