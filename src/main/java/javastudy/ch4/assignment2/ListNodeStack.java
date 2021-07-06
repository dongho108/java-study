package javastudy.ch4.assignment2;

public class ListNodeStack {
    private ListNode head;

    public ListNodeStack() {
        this.head = new ListNode();
    }

    public void push(int data) {
        ListNode currentNode = head;

        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }

        ListNode newNode = new ListNode(data);
        currentNode.nextNode = newNode;
    }

    public int pop() throws Throwable {
        int res = -1;
        ListNode currentNode = head;
        ListNode preNode = currentNode;

        while (currentNode.nextNode != null) {
            preNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        if (currentNode == head) {
            System.out.println("HEAD는 pop할 수 없습니다.");
            return res;
        }

        res = currentNode.node;
        preNode.nextNode = null;

        return res;
    }

    public void print() {
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
