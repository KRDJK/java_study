package day01;

public class Variable {

    public static void main(String[] args) {
        
        // 변수의 선언 ( 타입 지정 )
        int score;

        // 변수의 초기화 (값을 처음에 할당하는 행위)
        score = 70;

        System.out.println(score);

        // 선언과 초기화를 동시에 진행할 수 있다.
        int life = 3;
        life = 5; // 변수값 변경

        int triple = score * 3;
        System.out.println(triple);
        // soutv = JS에서의 console.log(`triple = ${triple}`); 처럼 표현해주는 개발툴(인텔리 제이)의 자체 기능
        System.out.println("triple = " + triple);
        
        String nickname = "짹짹이";
        System.out.println("nickname = " + nickname);
        
//        nickname = 5.5; 변수 타입과 다른 값은 저장 불가
        
//        double score = 3.3; 같은 범위 안에선 같은 이름을 쓸 수 없음. const 같은 느낌인듯

        String userName = "홍길동";

        int number = 100;

        double pi = 3.14;

        double random = Math.random();
    }
}
