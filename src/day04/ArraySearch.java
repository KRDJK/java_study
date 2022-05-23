package day04;

public class ArraySearch {
    public static void main(String[] args) {

        // 배열 탐색 알고리즘
        // 인덱스 찾기, 유무 확인 (JS에서의 함수 : indexof~, includes~)

        String[] foods = {"치킨", "피자", "삼겹살", "파스타"};
        String target = "삼겹살";

//        boolean includes = false;
        int index = -1; // 찾은 인덱스를 저장할 변수.
        // index에서 -1은 존재할 수 없으니!! 최소 0번부터니까! 상징적으로 -1 부여.
        // int 타입이라서 null을 부여할 수 없음.

        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        } // end for
        System.out.println("찾은 인덱스: " + index);

        boolean hasFood = index != -1;
        System.out.println("존재 유무: " + hasFood);
    } //end main
} //end class
