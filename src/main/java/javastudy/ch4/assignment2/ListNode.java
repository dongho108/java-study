package javastudy.ch4.assignment2;

public class ListNode {
    int node;
    ListNode nextNode = null;


    public ListNode() {
    }

    public ListNode(int node) {
        this.node = node;
    }

    public ListNode(int node, ListNode nextNode) {
        this.node = node;
        this.nextNode = nextNode;
    }

    public void add(ListNode head, ListNode nodeToAdd, int position) {
        if (position == 0) {
            System.out.println("HEAD는 추가할 수 없습니다.");
            return;
        }

        ListNode currentNode = head;
        ListNode preNode = currentNode;
        for (int i = 0; i < position; i++) {
            preNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        preNode.nextNode = nodeToAdd;
        nodeToAdd.nextNode = currentNode;
    }

    public void remove(ListNode head, int positionToRemove) throws Throwable {
        if (positionToRemove == 0) {
            System.out.println("HEAD는 삭제할 수 없습니다.");
            return;
        }

        ListNode currentNode = head;
        ListNode preNode = currentNode;



        for (int i = 0; i < positionToRemove; i++) {
            if (currentNode == null) {
                System.out.println("지우려는 위치에 노드가 없습니다.");
                return;
            }

            preNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        preNode.nextNode = currentNode.nextNode;
        currentNode = null;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck) {
        ListNode currentNode = head;

        while (currentNode.nextNode != null) {
            if (currentNode == nodeToCheck) {
                return true;
            }
            currentNode = currentNode.nextNode;
        }

        if (currentNode == nodeToCheck) {
            return true;
        } else {
            return false;
        }
    }

    public void print(ListNode head) {
        ListNode currentNode = head;
        System.out.println("HEAD");

        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            if (currentNode != null) {
                System.out.println(currentNode.node);
            }
        }
    }
}
