package datastructure.chap02.linkedlist.singly;

public class Test {
    public static void main(String[] args) {

        SimpleLinkedList<Integer> integerList = new SimpleLinkedList<>();
        integerList.addFirst(2);
        integerList.addFirst(3);
        integerList.addFirst(4);

        System.out.println(integerList.printList());

        SimpleLinkedList<String> stringList = new SimpleLinkedList<>();
        stringList.addFirst("쭈꾸미");
        stringList.addFirst("불고기");
        stringList.addFirst("도시락");

        System.out.println(stringList.printList());


        SimpleLinkedList<Double> dList = new SimpleLinkedList<>();

        dList.addFirst(3.5);
        dList.addFirst(5.5);
        dList.addFirst(6.5);

        System.out.println(dList.printList());
    }
}
