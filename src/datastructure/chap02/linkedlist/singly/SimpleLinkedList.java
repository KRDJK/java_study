package datastructure.chap02.linkedlist.singly;

// 단방향 단순 연결 리스트
public class SimpleLinkedList<E> {

    // 연결 리스트는 언제나 헤더노드 같은 감시노드를 갖고 있어야 함.
    private HeaderNode<E> header;
    
    
    // 생성자
    public SimpleLinkedList() {
        //연결 리스트가 처음 생성됐을 때! 헤더노드도 같이 생성되어야 함.
        this.header = new HeaderNode<E>();

    }


    // 리스트의 첫 번째 위치로 노드를 삽입하는 메서드
    public void addFirst(E data) {

//        System.out.printf("\n신규 데이터 %d 맨 앞에 추가!\n", data);

        // 새롭게 추가할 정수 데이터가 있으면 신규 노드 생성 및 데이터에 저장.
        Node<E> newNode = new Node<E>(data); // 객체가 생성되면 객체 자체가 들어가는게 아니라 주소가 들어감.
//        System.out.printf("새로운 노드의 주소: %s\n", newNode);


        // 새로운 노드에게 기존의 첫번째 노드의 주소를 저장.
        Node<E> oldFirstNode = header.getFirstNode(); // 기존의 첫번째 노드 주소 획득
//        System.out.printf("기존 헤더가 감시하던 노드의 주소: %s\n", oldFirstNode);


        // 이러면 되나..?
        newNode.setNextNode(oldFirstNode); // 그 주소를 새로운 첫번째 노드의 다음 노드로 설정
//        System.out.printf("새로운 노드가 감시할 다음 노드 주소: %s\n", newNode.getNextNode());


        // 헤더노드에 새롭게 추가될 노드의 주소를 저장.
        header.setFirstNode(newNode); // 이러면 주소를 주는거네. 연결!
//        System.out.printf("헤더가 새롭게 감시할 첫번째 노드의 주소 %s\n", header.getFirstNode());


    }


        // 리스트의 첫번째 노드 삭제
        public Node<E> removeFirst() {
            // 빈 리스트인지를 확인
            if (!header.isEmpty()) {
                // 삭제 대상 노드를 키핑
                Node<E> tempNode = header.getFirstNode();

                // 삭제 대상 노드의 다음 노드 주소 가져오기.
                Node<E> nextNode = tempNode.getNextNode(); // 야! 지워질 놈아 너 다음 주소 어딨어!

                // 헤더 노드가 다음 노드를 감시하도록 설정
                header.setFirstNode(nextNode);

                // 삭제된 노드를 반환
                return tempNode;

            } else {
                return null; // 빈 리스트면 null 리턴
            }
        }


        /*// 정렬된 리스트에서 특정 위치에 노드 삽입
        public void insert(int data) {

            // 새로운 노드 생성
            Node<E> newNode = new Node<E>(data);

            // 첫 번째 노드를 가져와서 현재 노드로 설정
            Node<E> currunt = header.getFirstNode();
            // 바로 이전 노드를 가져오기
            Node<E> prev = null;


            // 삽입 위치 탐색
            // 빈 리스트가 아니고, 삽입할 데이터가 현재 노드의 데이터보다 클 동안 반복.
            while (currunt != null && data > currunt.getData()) {
                // 현재 노드를 이전 노드에 백업
                prev = currunt;
                // 다음 노드를 현재 노드로 재설정
                currunt = currunt.getNextNode();
            }

            // 빈 리스트일 경우
            if(prev == null) { // header.isEmpty() 썼어도 됨.
                // 새로운 노드를 첫번째 노드로 설정
                header.setFirstNode(newNode);
            }
            // 빈 리스트가 아닐 경우
            else {
                // 이전 노드가 새로운 노드를 다음 노드로 설정.
                prev.setNextNode(newNode);
            }

            // 새로운 노드가 다음 노드를 가리키도록 설정.
            newNode.setNextNode(currunt);

        } // end insert()*/



        /*// 정렬된 리스트에서 특정 위치 노드 삭제
        public Node<E> remove(int data) {
            // 첫 번째 노드를 가져와서 현재 노드로 설정
            Node<E> currunt = header.getFirstNode();
            // 바로 이전 노드를 가져오기
            Node<E> prev = null;


            // 삽입 위치 탐색
            // 빈 리스트가 아니고, 삽입할 데이터가 현재 노드의 데이터보다 '다를 동안' !! 반복.
            while (currunt != null && data != currunt.getData()) {
                // 현재 노드를 이전 노드에 백업
                prev = currunt;
                // 다음 노드를 현재 노드로 재설정
                currunt = currunt.getNextNode();
            }

            // 삭제 대상이 첫번째 노드인 경우
            if (prev == null && currunt != null) {
                // 헤더가 기존의 두번째 노드를 감시하도록 설정.
                Node<E> secondNode = header.getFirstNode().getNextNode(); // currunt가 삭제대상이니까 currunt.nextNode()도 같은 결과다.
                header.setFirstNode(secondNode);
            }
            // 삭제 대상이 중간 어딘가인 경우
            else if (prev != null && currunt != null) {
                // 삭제 대상의 이전노드가 삭제대상의 다음노드를 연결
                prev.setNextNode(currunt.getNextNode());
            }
            return currunt; // 삭제 대상 노드 반환

        } // end remove*/




        // 리스트를 전체 순회하여 완성된 문자열로 반환
        public  String printList() {
            String str = "[ ";
            Node<E> currunt = header.getFirstNode();

            while (currunt != null) {
                str += currunt.getData();
                currunt = currunt.getNextNode();

                if (currunt != null) {
                    str += ", ";
                }
            }

            str += " ]";
            return str;

        } // end printList()


} // end class
