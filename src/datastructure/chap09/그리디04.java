package datastructure.chap09;


/*
   0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
     <----->          =>   1회
         <--->
   <----------->
             <--->    =>   2회
         <--------->
             <------>
               <------->
                   <------>  =>  3회
                   <--------->
       <------------------------>
                            <-------> => 4회


        주의 ) 2, 2 일 경우 시작하자마자 끝나는 회의이므로 횟수에 추가할 수 있다.
              다만 1, 2가 있을 경우 실제로 2개의 회의가 겹치지 않을 수 있지만
              로직상 1, 2보다 2, 2가 먼저 등장한 경우 나중에 나온 1, 2가 카운팅되지 않는다.
              따라서 종료시간이 같은 경우 시작시간을 먼저 배치하도록 정렬해야 한다.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 백준 1931
public class 그리디04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<List<Integer>> A = new ArrayList<>(); // 2차원 리스트 생성

        /*A.add(new ArrayList<Integer>(Arrays.asList(0, 6)));
        A.add(new ArrayList<Integer>(Arrays.asList(3, 5)));
        A.add(new ArrayList<Integer>(Arrays.asList(1, 4)));
//        A.add(new ArrayList<Integer>(Arrays.asList(0, 4)));
        A.add(new ArrayList<Integer>(Arrays.asList(5, 9)));
        A.add(new ArrayList<Integer>(Arrays.asList(5, 7)));
        A.add(new ArrayList<Integer>(Arrays.asList(3, 8)));
        A.add(new ArrayList<Integer>(Arrays.asList(8, 11)));
        A.add(new ArrayList<Integer>(Arrays.asList(6, 10)));
        A.add(new ArrayList<Integer>(Arrays.asList(2, 13)));
        A.add(new ArrayList<Integer>(Arrays.asList(8, 12)));
        A.add(new ArrayList<Integer>(Arrays.asList(12, 14)));*/

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            A.add(new ArrayList<Integer>(Arrays.asList(a, b)));
        }

        // 종료시간 기준 정렬
        A.sort((nList1, nList2) -> {
            if (nList1.get(1) == nList2.get(1)) {
                return nList1.get(0) - nList2.get(0);
            }
            return nList1.get(1) - nList2.get(1);
        });

//        for (List<Integer> nums : A) {
//            System.out.println(nums);
//        }

        int endTime = A.get(0).get(1); // 4

        int count = 1;

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i).get(0) >= endTime) {
                endTime = A.get(i).get(1);
                count++;
//                System.out.println("endTime = " + endTime);
            }
        }

        System.out.println(count);


    } // end main
} // end class
