package datastructure.chap10.binarytree;

import utility.Util;

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

    } // end  main
} // end class
