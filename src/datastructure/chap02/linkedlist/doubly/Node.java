package datastructure.chap02.linkedlist.doubly;

public class Node {

    private int data; // 데이터 저장 (학습용이라서 int로 보기 쉽게 걍 만든거)
    
    private Node nextNode; // 다음 노드의 주소
    
    private Node prevNode; // 이전 노드의 주소


    // 생성자
    public Node(int data) {
        this.data = data;
    }



    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }


} // end class
