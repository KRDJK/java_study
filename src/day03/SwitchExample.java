package day03;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요. ]");
        System.out.print(">> ");
        String season = sc.next();
        sc.close(); // 입력 받기 및 입력된 값을 가지고 활용하는 것을 그만하려고 할 때 달아주면 될듯

        // 겨울을 입력하면 바로 겨울로 점프해서 가볼 수는 없을까 => 그걸 switch로 할 수 있다.

        // switch 괄호 안에는 정수, 문자형 '변수!!!'를 씁니다.
        // 분기를 나눌 데이터가 있는 변수
        switch (season) {
            // case에는 switch변수에 들어갈 경우의 수 값들을 배치. 계절은 보통 4계절이니까!!
            // 단, 변수는 배치 불가능, 상수나 리터럴만 가능.
            case "봄": // spring이라고 쳤을 때도 해주고 싶을 땐.. else if 에서는 가능하지만 여기서는 불가능하다.. 조건식을 넣는게 아니기 때문!!
                // 현재 케이스에서 실행할 코드 작성
            case "spring":
                System.out.println("봄에는 여의도로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지.
            case "여름": case "summer": case "夏":
                System.out.println("여름에는 낙산으로 가보세요~");
                break;
            case "가을":
                System.out.println("가을에는 춘천으로 가보세요~");
                break;
            case "겨울":
                System.out.println("겨울에는 홍천으로 가보세요~");
                break;
            default: // else 기능
                System.out.println("[ 봄, 여름, 가을, 겨울 중 입력하세요! ]");
        }

    }
}
