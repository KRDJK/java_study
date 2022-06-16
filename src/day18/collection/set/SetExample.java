package day18.collection.set;

import utility.Util;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        // Set : 중복 저장을 허용하지 않는다. 데이터 삽입속도가 빠름. 순서없이 저장.
        Set<String> set = new HashSet<>();

        
        // add(E e) : 객체 추가   중복되지 않아서 정상적으로 add가 됐으면 true, 중복이라 안됐으면 false를 반환한다.
        set.add("김말이");
        set.add("닭꼬치");
        set.add("단무지");
        boolean b1 = set.add("김말이");// 이미 있는데 추가하려고 하는거니 무시된다.
        boolean b2 = set.add("김밥");

        System.out.println(set.size());
        System.out.println(set.toString()); // 순서 개판..
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);


        Util.line();

        // set의 루프 처리 : 무조건 전체 순회를 해야함.. 왜?? 저장될 때 순서란게 없이 저장되니까
        for (String s : set) {
            System.out.println(s);
        }



        // remove(obj) : 객체 삭제. 인덱스가 없기 때문에 직접 지정해야만 함.
        set.remove("단무지");
        System.out.println(set);


        set.clear();
        System.out.println(set.isEmpty());


        Util.line();


        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(2,2,2,4,5,5,6,6,6,9,9));

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numbers);

        System.out.println(numberSet); // 중복 알아서 피해준 후 반환

        numbers.clear();
        numbers.addAll(numberSet); // 중복이 사라진 버전을 다시 원 리스트에 저장

        System.out.println(numbers);

        // 오름차 정렬
        numbers.sort(Integer::compareTo);

        System.out.println(numbers);

    } // end main
} // end class
