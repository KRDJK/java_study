package day17.api.wrapper;

public class Wrapper {
    public static void main(String[] args) {

        // 기본 타입으로는 Object와의 상속 관계가 없다.. 왜?? 객체가 아니잖아!

        Object[] arr = {10, 2.2}; // 여기 10도 그냥 int가 아니라 Integer로 들어간 것이다.

        Integer n = new Integer(10);
        String s = new String("zzz");

        // 원래 문법대로라면 위에처럼 쓰는게 맞지만, 너무 자주 쓰니까 생략 가능하게 만들어 준 것이다.
        // 이런 개념을 오토 박싱이라고 한다.



        int m = n; // 오토 언박싱
        // 원래 문법대로라면 int m = n.IntValue();



        // 객체 지향에서 기본 타입을 썼을 때의 문제점.
        // 캡슐, 상속 이런 객체 지향 개념을 아예 적용할 수 없으니까~~
        // 이런 문제들을 극복하기 위해 기본타입들을 객체화 해주기 위해 Wrapper클래스를 만들었다!


        System.out.println(Integer.MAX_VALUE); // 오호..


        // 기본형과 좀 다른 객체화 클래스 이름은 Character, Integer


        // 필드의 초기값을 null로 잡아야 할 경우에는 객체화된 기본형 타입을 쓰고,
        // 그게 아니라면!!! 그냥 기본형 int, char를 쓰는게  성능상 더 좋다.

    } // end main
} // end class
