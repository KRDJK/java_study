package datastructure.chap10.binarytree;

class Node {
    private int data; // 트리에 저장할 데이터
    private Node leftChild; // 왼쪽 자식
    private Node rightChild; // 오른쪽 자식

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return String.format("[ %d ]", data);
    }
} // end Node class


public class BinaryTree {
    private Node root; // 트리의 루트 노드


    // ================ 삽입 ==================== //
    public void add(int data) {
        // 삽입할 데이터 노드 생성
        Node newNode = new Node(data);
        
        
        // 빈 트리면 새로운 노드를 루트로 지정
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            
            while (true) {
                parent = current;
                
                // 삽입할 데이터가 타겟 노드의 데이터보다 작은 경우
                if (data < current.getData()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else { // 큰 경우
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    } // end add



    // ================ 순회 ===================== //

    // 전위 순회 (pre order) - 중전후
    public void preOrder(Node tempRoot) {
        if (tempRoot != null) {
            System.out.printf("%d ", tempRoot.getData());
            preOrder(tempRoot.getLeftChild());
            preOrder(tempRoot.getRightChild());
        }
    }

    // 중위 순회 (in order) - 전중후
    public void inOrder(Node tempRoot) {
        if (tempRoot != null) {
            inOrder(tempRoot.getLeftChild());
            System.out.printf("%d ", tempRoot.getData());
            inOrder(tempRoot.getRightChild());
        }
    }

    // 후위 순회 (in order) - 전후중
    public void postOrder(Node tempRoot) {
        if (tempRoot != null) {
            postOrder(tempRoot.getLeftChild());
            postOrder(tempRoot.getRightChild());
            System.out.printf("%d ", tempRoot.getData());
        }
    }


    // ================ 탐색 ===================== //
    public Node find(int targetData) {
        Node currunt = root;
        
        while (true) {
            if (currunt == null) return null; // 탐색 실패

            // 찾는 값이 현재 노드의 값보다 작은 경우
            if (targetData < currunt.getData()) {
                currunt = currunt.getLeftChild();
            } else if (targetData > currunt.getData()) {
                currunt = currunt.getRightChild();
            } else {
                return currunt; // 탐색 성공
            }
        }
    } // end find


    // ================ 최대, 최소값 탐색 ===================== //
    public Node findMin() {
        Node currunt = root;

        if (isEmpty()) {
            return null;
        } else {
            Node parent = currunt;
            while (currunt != null) {
                parent = currunt;
                currunt = currunt.getLeftChild();
            }
            return parent;
        }
    }

    public Node findMax() {
        Node currunt = root;

        if (isEmpty()) {
            return null;
        } else {
            Node parent = currunt;
            while (currunt != null) {
                parent = currunt;
                currunt = currunt.getRightChild();
            }
            return parent;
        }
    }


    // ================ 삭제 ===================== //
    public boolean delete(int targetData) {
        // 삭제 노드와 해당 삭제노드의 부모노드를 탐색
        Node currunt = root;
        Node parent = currunt;

        while (targetData != currunt.getData()) {
            if (currunt == null) return false;
            
            parent = currunt;
            if (targetData < currunt.getData()) {
                currunt = currunt.getLeftChild();
            } else {
                currunt = currunt.getRightChild();
            }
        }
        
        // 삭제 진행
        // 1. 삭제 대상 노드의 자식이 없는 경우 (삭제 대상이 잎 노드인 경우)
        if (currunt.getLeftChild() == null && currunt.getRightChild() == null) {

            if (currunt == root) { // 삭제 대상이 루트인 경우
                root = null;
            } else if (parent.getRightChild() == currunt) { // 삭제 대상이 부모의 오른쪽 자식이었다면
                parent.setRightChild(null);
            } else {
                parent.setLeftChild(null);
            }
        }

        // 2-1. 삭제 대상 노드의 자식이 하나인 경우 - 왼쪽 자식인 경우
        else if (currunt.getRightChild() == null) {

            // 삭제 대상이 루트
            if (currunt == root) {
                root = currunt.getLeftChild();

            } else if (currunt == parent.getLeftChild()) { // 삭제 대상이 부모의 왼쪽 자식인 경우
                // 부모의 새로운 왼쪽 자식으로 삭제 대상의 자식을 연결
                parent.setLeftChild(currunt.getLeftChild());

            } else { // 삭제 대상이 부모의 오른쪽 자식인 경우
                // 부모의 새로운 오른쪽 자식으로 삭제 대상의 자식을 연결
                parent.setRightChild(currunt.getLeftChild());
            }
        }

        // 2-2. 삭제 대상 노드의 자식이 하나인 경우 - 오른쪽 자식인 경우
        else if (currunt.getLeftChild() == null) {
            // 삭제 대상이 루트
            if (currunt == root) {
                root = currunt.getRightChild();

            } else if (currunt == parent.getLeftChild()) { // 삭제 대상이 부모의 왼쪽 자식인 경우
                // 부모의 새로운 왼쪽 자식으로 삭제 대상의 자식을 연결
                parent.setLeftChild(currunt.getRightChild());

            } else { // 삭제 대상이 부모의 오른쪽 자식인 경우
                // 부모의 새로운 오른쪽 자식으로 삭제 대상의 자식을 연결
                parent.setRightChild(currunt.getRightChild());
            }
        }

        // 3. 삭제 대상 노드의 자식이 둘인 경우
        else {
            // 삭제 노드를 대체할 후보 노드 찾기
            Node candidate = getCandidate(currunt);

            if (currunt == root) { // 삭제 대상이 루트인 경우
                root = candidate;
            } else if (currunt == parent.getLeftChild()) {
                parent.setLeftChild(candidate);
            } else {
                parent.setRightChild(candidate);
            }

            candidate.setLeftChild(currunt.getLeftChild());
        }

        return true;
    } // end delete



    // 후보 노드 찾기
    private Node getCandidate(Node deleteNode) {

        Node candidate = deleteNode.getRightChild();

        // 후보 노드는 삭제 노드의 오른쪽 자식 중에 가장 왼쪽 끝에 있는 자식
        while (candidate.getLeftChild() != null) {
            candidate = candidate.getLeftChild();
        }

        return candidate;
    }




    // 빈 트리인지 확인
    public boolean isEmpty() {
        return root == null;
    }


    public Node getRoot() {
        return root;
    }
}
