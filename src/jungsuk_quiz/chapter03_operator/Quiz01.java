package jungsuk_quiz.chapter03_operator;

public class Quiz01 {
    public static void main(String[] args) {
        // 문제 : 다음의 연산 결과를 적으세요.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65


        System.out.println(1 + x << 33); // 내 답: true
        // 정답:6 why?? 비트연산자였다..
        // 근데 3 << 33이 어케 6..?? 2 << 33부터 하나?? 그래도 어케 6??

        System.out.println(y >= 5 || x < 0 && x > 2); // 내 답: false
        // 정답 : true.. 왜지??

        System.out.println(y += 10 - x++); // 내 답: 15-2 = 13
        // 정답 : 13!!

        System.out.println(x+=2); // 내 답: 4
        // 정답 : 5!! why?? 위에서 ++ 됐으니까..

        System.out.println( !('A' <= c && c <='Z') ); // 내 답: false
        // 정답 : false!!

        System.out.println('C'-c); // 내 답: 2
        // 정답 : 2!!

        System.out.println('5'-'0'); // 내 답: 5
        // 정답 : 5!!

        System.out.println(c+1); // 내 답: 66
        // 정답 : 66!!

        System.out.println(++c); // 내 답: 66
        // 정답 : B

        System.out.println(c++); // 내 답: B
        // 정답 : B!!

        System.out.println(c); // 내 답 : C
        // 정답 : C!!

    }
}
