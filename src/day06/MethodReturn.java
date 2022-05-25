package day06;

import java.util.Arrays;

public class MethodReturn {

    static int add (int n1, int n2) {
        return n1 + n2;
//        System.out.println("dd"); // return은 종료문(탈출문)이기도 한데 어케 실행해
    }

    static void showAddResult(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1+n2); // 함수 안에 있는 출력이 될뿐.
                                                        // return값이 아님.
    }

    static void callName(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어 즐~~");
            return; // 함수 탈출문
        }
        System.out.printf("%s 하위~~\n", name);
    }

    /*
        # 모든 함수의 리턴값은 반드시 1개다.

        - 5개의 애완동물 이름 목록에서 원하는 숫자를 전달하면
          그 숫자만큼 랜덤으로 애완동물리스트를 뽑아서 리턴하는 함수
            어케 할까?? 배열이든 객체든 그릇을 큰 곳에 담아서 그 그릇을 리턴하자.
     */

    static String[] selectPet(int count) {

        // 매개변수 검증
        if (count < 1 || count > 5) {
            return null; // 그냥 리턴은 에러나는 이유가 string 배열이 아니라서!
                // 줄게 없다! 의도적으로 부여하는 값이라는게 맞네. null!
        }


        String[] petList = {"멍멍이", "짹짹이", "꽥꽥이", "찍찍이", "꾸러긔"};

//        return petList[2], petList[4]; 불가능!! why? 리턴값은 오직 하나!

        // 랜덤 선택한 애완동물이 저장될 배열
        String[] selected = new String[count]; // 여기에 음수 넣는게 안됨! 매개변수 검증 필요!
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random() * petList.length);
            selected[i] = petList[rn];
        }
        return selected; // 배열의 주소가 날아간다.
    }



    public static void main(String[] args) { // 그래서 메인 함수 앞에 void가 있었군.

        int r1 = add(10, 20);
//        System.out.println(n1+n2); 불가능!! why?? 지역변수 개념으로다가 함수 안에서만 유효!
        System.out.println(r1);

        int r2 = r1 * 3 + r1--;

//        void r3 showAddResult(3, 8); 이게 말이 되냐? 놉!
        // 리턴이 없는 void 타입 함수는 변수에 저장할 수 없다.
        showAddResult(3, 8);

        System.out.println(); // void

        double random = Math.random();

        int r4 = add(add(10,20), add(5,5)); // 가능하다! 안쪽부터 호출.
        // add(30, add(5,5)); - 1차 호출
        // add(30, 10); - 2차 호출
        // 40; - 3차 호출
        System.out.println("r4 = " + r4);

        showAddResult(add(4,4), add(3,7)); // 가능
//        add(showAddResult(3,3), add(2,1)); // 불가능 why? showAddResult가 리턴값이 없어서


        System.out.println("================================");

        callName("짝짝이");
        callName("주차왕파킹맨");

        System.out.println("================================");

        String[] selectPet = selectPet(-2);
        System.out.println(Arrays.toString(selectPet));

    } // end main
} // end class
