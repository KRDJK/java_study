package day06;

import java.util.Arrays;

public class MethodPractice {

    // foods라는 변수를 전역변수처럼 쓰는 방법. 앞에 static 붙이기.
    static String[] foods = {"떡볶이", "치킨", "파스타"};

    // 배열에 마지막 위치에 데이터를 추가하는 함수
    static void push (String newFood) {
        // foods는 메인의 지역변수라서 여기서 쓸 수는 없음.
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    // 배열 내부데이터 출력함수
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // index 찾는 함수
    static int indexOf (String findFood) {
        // 기본값으로 -1을 설정해서 인덱스를 찾지 못하면 그대로 -1이 출력되도록.
        int idx = -1;
        
        // 인덱스 찾기
        for (int i = 0; i < foods.length; i++) {
            if(findFood.equals(foods[i])) {
                idx = i;
            }
        }
        return idx;
    }

    // foods에서 음식 제거하는 함수
    static void remove (String removeFood) {
        // 원래 배열에서 하나 제거된 만큼의 새로운 배열을 만들기.
        String[] temp = new String[foods.length-1];

        // 지우려는 인덱스가 몇번인지 찾기.
        int idx = indexOf(removeFood);

        if (idx == -1) {
            System.out.println("존재하지 않는 음식명입니다.");
            return;
        }

        // 인덱스를 기준으로 원래의 배열에서 하나씩 값들을 당겨서 값 변경해놓기.
        for (int i = idx; i < foods.length - 1; i++) {
            foods[i] = foods[i+1];
        }

        // 수정된 원배열 인덱스들을 새로운 배열의 각 인덱스에 초기화.
        for (int i = 0; i < foods.length - 1; i++) {
            temp[i] = foods[i];
        }

        foods = temp;
    }

    static boolean include (String findFood) {
        int idx = indexOf(findFood);

        if (idx == -1) {
            return false;
        } else {
            return true;
        }
    }

    static void insert (int insertIdx, String insertFood) {
        // 원 배열에서 하나 늘어난 새로운 배열 생성
        String[] temp = new String[foods.length + 1];


        // 삽입을 원하는 인덱스부터 원배열 데이터를 뒤로 하나씩 밀기.
            // 정석으로 하지 않음.
            // 원 배열의 마지막 인덱스 +1 (이게 temp의 마지막 인덱스) 부터 원 배열 인덱스를 temp에 거꾸로 대입해감.
        for (int i = foods.length; i >= insertIdx; i--) {
            temp[i] = foods[i-1];
        }
            // 이러면 지우려는 인덱스 이전 애들은 복사가 안됐기 때무에 다 null임.

        // temp에 수정된 원배열 인덱스 값들을 복사.
            // 이것도 정석으로 하지 않았음.
            // 위에서 지우려는 인덱스 애들까지 복사가 안됐기 때문에 그 이전 애들을 다시 복사했음.
        for (int i = 0; i < insertIdx; i++) {
            temp[i] = foods[i];
        }

        temp[insertIdx] = insertFood;

        foods = temp;
    }

    static void modify (int modifyIdx, String changeFood) {
        foods[modifyIdx] = changeFood;
    }

    static void clear () {
        foods = new String[0];
    }

    // start main
    public static void main(String[] args) {

//        String[] foods = {"떡볶이", "치킨", "파스타"};

        // push함수 만들어서 호출해보자.
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        // idx에 2가 리턴되어야 함.
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);

        // idx에 4가 리턴되어야 함.
        int idx2 = indexOf("김치찌개");
        System.out.println("idx2 = " + idx2);
        
        // idx에 -1이 리턴되어야 함.
        int idx3 = indexOf("짜장면");
        System.out.println("idx3 = " + idx3);


        remove("김치찌개"); // foods 배열에서 김치찌개 제거.
        printFoods(); // 제거됐는지 확인
        remove("망고"); // 존재하지 않는 음식명입니다. 출력.


        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
        System.out.println("flag = " + flag); // 확인용
        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
        System.out.println("flag2 = " + flag2); // 확인용


        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        printFoods(); // 파인애플이 잘 삽입됐는지 확인용


        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
        printFoods(); // 닭갈비로 잘 바뀌는지 확인


        clear();  // foods배열 모든 데이터 삭제
        printFoods(); //다 지워졌는지 확인


    } // end main
} // end class
