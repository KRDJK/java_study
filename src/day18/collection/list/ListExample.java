package day18.collection.list;

import utility.Util;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // 삽입 삭제가 많이 일어날거 같으면 배열리스트보다 연결리스트를 쓰는게 낫다

        // 배열 리스트 생성 - 초기 생성시 10개 공간이 주어지고
        // 데이터 추가시 동적으로 늘어남
        // 문자열 여러개를 일렬로 저장해서 순차적으로 관리하고 싶을 때!!
        List<String> sList =new ArrayList<>();


        // add(E e) : 리스트의 맨 끝에 객체를 추가
        // 리스트계열은 중복데이터 저장이 가능.
        sList.add("멍멍이");
        sList.add("야옹이");
        sList.add("짹짹이");
        sList.add("두깝이");
        sList.add("개굴이");
        sList.add("야옹이");

        System.out.println(sList.toString());
        
        
        // size() : 저장된 객체의 수 리턴
        int size = sList.size();
        System.out.println("size = " + size);


        // add(int index, E e) : 데이터 중간 삽입
        // (실제로 배열 중간삽입처럼 길이가 +1된 새로운 배열을 만들고 삽입해서 리턴하기 때문에 성능이 별로다.
        // 그러나 탐색은 빠름!!
        sList.add(2, "어흥이");
        System.out.println(sList);



        // set(index, obj) : 객체 수정
        sList.set(3, "메롱이");
        System.out.println(sList);



        // remove(index), remove(obj) : 삭제
        sList.remove(1); // 원래 1번 인덱스에 있던 야옹이가 지워짐
//        String remove = sList.remove(1); // 이건 pop과 유사

        sList.remove("개굴이"); // 이러면 배열 속 개굴이를 지워줌 오호..!!
        System.out.println(sList);



        // get(index) : 객체 참조    peek과 유사
        String s = sList.get(2);
        System.out.println(s);



        // indexOf(obj) : 저장된 객체의 인덱스를 리턴, 없으면 -1
        int idx = sList.indexOf("어흥이"); // 선형으로 탐색해서 최초에 걸리는 인덱스를 리턴해줌. 중복되면 앞에거 ㅇㅇ
        System.out.println("idx = " + idx);



        // contains(obj) : 객체의 저장 유무 확인
        boolean flag = sList.contains("두깝이");
        System.out.println("flag = " + flag);



        Util.line();


        // list의 루프 처리
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }


        Util.line();


        for (String ss : sList) {
            System.out.println(ss);
        }


        
        // clear() : 리스트 내부 전체 삭제
        sList.clear(); // 리스트 자체가 삭제가 되는게 아니라 리스트 내부 데이터들이 전부 삭제되어 사이즈가 0이 됨.
                        // 다시 저장을 시도할 수 있음.
//        sList = null;   // 이렇게 해야 리스트 자체가 사라지는 것!!
        System.out.println(sList);
        System.out.println(sList.size());
        System.out.println(sList.isEmpty());
        
        
        
        // 초기값을 가진 리스트 생성
        // ex) int[] arr = {1, 2, 3};
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 30, 5, 8, 56, 2)
        );
        System.out.println(numbers);


//        Integer[] objects = (Integer[]) numbers.toArray(); // 찐배열로 바꿔준다!!!


        // 오름차 정렬
        numbers.sort(Integer::compareTo); // 괄호 안에 제네릭 타입을 쓰고, ::compareTo
        System.out.println(numbers);
        
        
        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);



        // 2차원 리스트
        List<List<Integer>> list2d = new ArrayList<>();


        // 2차원 리스트에 1차원 리스트를 추가
        list2d.add(new ArrayList<>(Arrays.asList(10,20,30)));
        list2d.add(new ArrayList<>(Arrays.asList(40,50,60)));
        list2d.add(new ArrayList<>(Arrays.asList(70,80,90)));


        // 2차원 리스트 1번째 1차원 리스트에 정수 추가
//        list2d.get(0).add(10);


        for (List<Integer> list : list2d) {
            for (int n : list) { // Integer가 나왔지만 int로 오토 언박싱을 한 것이다.
                System.out.printf("%d ", n);
            }
            System.out.println();
        }


    } // end main
} // end class
