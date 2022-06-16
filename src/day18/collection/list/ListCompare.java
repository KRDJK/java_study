package day18.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        LinkedList<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(i);
            linked.add(i);
        }


        // 배열리스트에서 데이터 제어
        long s, e; // 시작시간, 끝시간
        s = System.currentTimeMillis();

        int len = array.size();
        for (int i = 0; i < len; i++) {
//            array.remove(0);
            array.get(i);
        }

        e = System.currentTimeMillis();
        System.out.printf("배열리스트 소요시간 : %dms\n", e - s); // 제거는 688ms, 탐색은 0ms



        // 연결리스트에서 데이터 제어
        s = System.currentTimeMillis();

        len = linked.size();
        for (int i = 0; i < len; i++) {
//            linked.remove(0);
            linked.get(i);
        }

        e = System.currentTimeMillis();
        System.out.printf("연결리스트 소요시간 : %dms\n", e - s); // 제거는 0ms, 탐색은 3802ms


        // 자주 찾는 데이터는 앞쪽에 배치하는게 성능상 유리하다.
        // 우선순위 큐 같은거군..

    } // end main
} // end class
