package datastructure.chap09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그리디04_쌤버전 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> A = new ArrayList<>();

        // 2차원 리스트에 데이터 입력받기
        for (int i = 0; i < N; i++) {
            A.add(new ArrayList<>());
            A.get(i).add(sc.nextInt()); // 1차원에 숫자 한번 추가 자연히 0번 인덱스
            A.get(i).add(sc.nextInt()); // 1차원에 한번 더 추가 자연히 1번 인덱스
        }
        sc.close();

        // 정렬
        A.sort((o1, o2) -> {
            if (o1.get(1) == o2.get(1)) { // 종료 시간이 같으면
                return o1.get(0) - o2.get(0); // 시작 시간으로 정렬
            }
            return o1.get(1) - o2.get(1); // 종료시간으로 정렬
        });

        int count = 0;  // 회의 횟수
        int end = -1;   // 종료시간 저장, -1은 단순 초기값
        for (int i = 0; i < N; i++) {
            if (A.get(i).get(0) >= end) { // 시작시간이 기존 종료시간보다 크거나같으면
                end = A.get(i).get(1); // 종료시간을 갱신
                count++;
            }
        }
        System.out.println(count);
    }
}
