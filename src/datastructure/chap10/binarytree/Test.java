package datastructure.chap10.binarytree;

import utility.Util;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /*
                              50
                27                              68
        12              36              55              82
    7      19      **       49      **      **      76      **

         */
        tree.add(50);
        tree.add(27);
        tree.add(68);
        tree.add(12);
        tree.add(36);
        tree.add(55);
        tree.add(82);
        tree.add(7);
        tree.add(19);
        tree.add(49);
        tree.add(76);

        System.out.println("============ 순회 ============");
        tree.preOrder(tree.getRoot());
        System.out.println();
        tree.inOrder(tree.getRoot());
        System.out.println();
        tree.postOrder(tree.getRoot());

        System.out.println("============ 탐색 ============");

        Node found = tree.find(27);
        System.out.println(found);

        found =  tree.find(100);
        if (found == null) System.out.println("탐색 실패!");


        Util.line();

        tree.add(3);
        tree.add(100);
        System.out.println(tree.findMin()); // 7
        System.out.println(tree.findMax()); // 82


        Util.line();

        tree.delete(82);


        tree.display();
        
        // 트리의 문제점
        BinaryTree tree2 = new BinaryTree();

        tree2.add(50);
        tree2.add(40);
        tree2.add(30);
        tree2.add(20);

        System.out.println("============= 이진 트리의 문제점 =============");
        tree2.display();
        /*
            문제점 1.
            비선형 구조의 데이터 구조를 만드려고 한건데, 선형 구조처럼 되어버렸다..
            이럴 때 재구조화를 통해 억지로 이진트리화를 해줄 수 있긴 하다.

            문제점 2.
            자식은 2개를 초과해서 가질 수 없다..
        */


        Util.line();

        System.out.println("=== API 트리 사용 ===");

        // TreeSet : Set형태로 Tree를 구현. (데이터의 중복이 없다.)
        TreeSet<Integer> treeSet = new TreeSet<>();

        // HashSet은 저장 순서가 없었지만 얘는 있다.
        treeSet.add(50);
        treeSet.add(77);
        treeSet.add(27);
        treeSet.add(7);
        treeSet.add(67);

        System.out.println(treeSet);


        // TreeMap : Map형태로 트리를 구현 key 값을 정렬한다. 사전순!!
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("멍멍이", 30);
        treeMap.put("야옹이", 55);
        treeMap.put("짹짹이", 44);
        treeMap.put("강쥐", 155);

        System.out.println(treeMap);


    } // end  main
} // end class
