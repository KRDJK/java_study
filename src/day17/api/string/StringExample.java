package day17.api.string;

import utility.Util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {
//        String s = "라면 떡볶이 보쌈 짜장면";
        String s = "1 2 3 4";
        // 문자열 쪼개기 - 1번

        String[] sArr = s.split(" "); // 공백을 기준으로 끊어서 배열에 담아준다.
        int[] numbers = new int[sArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sArr[i]);
        }
//        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(numbers));


        Util.line();


        // 문자열 쪼개기 - 2번
        s = "짜장면,짬뽕,탕수육,볶음밥,라면";
        StringTokenizer st = new StringTokenizer(s, ",");

//        st.nextToken(); // que.poll 개념과 유사

//        System.out.println(st.countTokens()); // que.size() 개념과 유사

        // s.split은 배열에 담아주지만.. 얘는 약간 Queue같은 공간에 담아준다.
//        while (st.hasMoreTokens()) { // st.nextToken()을 할게 있는 동안에~~
//            System.out.print(st.nextToken() + " ");
//        }

        String[] foods = new String[st.countTokens()];

        for (int i = 0; st.hasMoreTokens(); i++) { // 가운데는 조건식 : true, false가 나올 수 있는 식만 들어오면 된다.
            foods[i] = st.nextToken();
        }
        System.out.println(Arrays.toString(foods));


        Util.line();


        // String의 성능에 대하여
        long ss = System.currentTimeMillis();

//        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
//            str += (i+1);
            sb.append(i+1);
        }

        long ee = System.currentTimeMillis();

        System.out.println((ee - ss) + "ms"); // String은 3093ms 3.1초정도 // StringBuilder는 0초



    } // end main
} // end class
