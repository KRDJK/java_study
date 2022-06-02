package datastructure.chap02.linkedlist.doubly;

public class DoublyLinkedList { // 양방향 연결리스트 - 이중 연결리스트

    private SentinelNode sentinel;


    // 생성자
    //
    public DoublyLinkedList() {
        sentinel = new SentinelNode(); // 이 이중연결리스트가 생성될 때 하나의 감시 노드(처음과 끝을 감시하는)가 생겨야지!
        // 초기값은 아무것도 없다.
    }

    // 리스트에 노드를 추가하는 메서드
    public void add(int data) {
        // 새로운 노드 생성
        Node newNode = new Node(data);


        // 새로운 노드가 삽입될 위치 탐색
            // 초기 세팅
        Node currnt = sentinel.getFirstNode();
        Node prev = null;

        while (currnt != null && data > currnt.getData()) {
            prev = currnt;
            currnt = currnt.getNextNode();
        }


        // 찾은 후 링크 처리
            // 빈 리스트인 경우
        if (sentinel.isEmpty()) {
            // 감시 노드가 새로운 노드를 기억하도록 설정
            sentinel.setFirstNode(newNode);
            sentinel.setLastNode(newNode);
        }


        // 새로운 노드가 맨 처음 위치에 삽입되는 경우
        else if (sentinel.getFirstNode() == currnt) { // 이 조건식 해석해보자 ==>> 위에 while문 자체를 거치지 않고 내려온 경우임.
                                            // why? while 조건에서 null이 아닌건 통과했지만! 뒤에 조건을 통과하지 못했음.
            // 새로운 노드의 다음 노드로 기존 첫 노드를 설정.
            newNode.setNextNode(sentinel.getFirstNode()); // 얘부터 먼저 해야함! 무조건!
            sentinel.setFirstNode(newNode); // 먼저 옮겨놓고~~ 세팅.
        }


        // 새로운 노드가 맨 마지막 위치에 삽입되는 경우
        else if (currnt == null) {
            prev.setNextNode(newNode);
            newNode.setPrevNode(prev);
            sentinel.setLastNode(newNode);
        }


        // 새로운 노드가 중간 위치에 삽입되는 경우
        else {
            newNode.setNextNode(currnt);
            newNode.setPrevNode(prev);
            prev.setNextNode(newNode);
            currnt.setPrevNode(newNode);
        }

    } // end add


    // 리스트에서 노드를 삭제하는 메서드
    public Node remove(int data) {
        
        // 지울 대상을 찾기 위해 먼저 초기화(초기 세팅)
        Node current = sentinel.getFirstNode();
        Node prev = null;

        while (current != null && data != current.getData()) { // null이 아니면서 지울 data랑 currunt data가 같아지면 멈춰야하기 때문.
            prev = current;
            current = current.getNextNode();
        }

        // 삭제 대상이 맨 첫번째 노드인 경우
        if(sentinel.getFirstNode() == current) { // while문을 거치지 않은 경우
            // 기존 두번째 노드의 이전 노드를 null로
            Node secondNode = current.getNextNode();
            secondNode.setPrevNode(null);

            // 감시 노드의 첫번째 노드를 기존의 두번째 노드로 설정.
            sentinel.setFirstNode(secondNode);
        }


        // 삭제 대상이 마지막 노드인 경우
        else if (current.getNextNode() == null) { // sentinel.getLastNode() == currunt 이것도 되지 않나???
            prev.setNextNode(null);
            sentinel.setLastNode(prev);
        }


        // 삭제 대상이 중간 노드인 경우
        else {
            prev.setNextNode(current.getNextNode());
            current.getNextNode().setPrevNode(prev);
        }

        return current;

    } // end remove


    // 리스트를 전체 순회하여 완성된 문자열로 반환
    public String printList() {
        String str = "[ ";
        Node current = sentinel.getFirstNode();
        // 역방향으로 하고 싶으면 라스트 노드부터

        while (current != null) {
            str += current.getData();
            current = current.getNextNode();
            // 라스트 노드를 현재노드로 삼고 이전 노드들을 더해가며

            if (current != null) {
                str += ", ";
            }
        }
        str += " ]";
        return str;
    }

} // end class
