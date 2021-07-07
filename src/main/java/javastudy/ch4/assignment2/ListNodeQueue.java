package javastudy.ch4.assignment2;

public class ListNodeQueue {
    private ListNode head;
    private ListNode ptr;

    public ListNodeQueue() {
        head = new ListNode();
        this.ptr = head;
    }

    public void append(int data) {
        ListNode newNode = new ListNode(data);
        ptr.nextNode = newNode;
        ptr = newNode;
    }

    public int pop() throws Throwable {
        if (head == ptr) {
            System.out.println("Queue가 비어있습니다.");
            return -1;
        }

        int res = head.nextNode.node;

        if (head.nextNode == ptr) {
            ptr = head;
        }

        head.remove(head, 1);
        return res;
    }

    public void print() {
        ListNode currentNode = head;
        System.out.println("HEAD");

        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            System.out.println(currentNode.node);
        }
    }

}
