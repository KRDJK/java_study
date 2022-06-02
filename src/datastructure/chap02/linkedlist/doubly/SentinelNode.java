package datastructure.chap02.linkedlist.doubly;

public class SentinelNode { // 감시 노드 (헤더와, 테일 역할을 같이 부여)

    // 처음과 끝 노드의 주소만 저장할 뿐 얘 자체는 어떤 데이터 값을 저장하지 않는다.
    private Node firstNode; // 첫번째 노드 주소

    private Node lastNode; // 마지막 노드 주소


    // 리스트가 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return firstNode == null && lastNode == null;
    }


    // setter / getter
    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }


} // end class
