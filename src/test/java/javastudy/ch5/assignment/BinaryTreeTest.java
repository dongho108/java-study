package javastudy.ch5.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    public void BinaryTreeTest() throws Exception {
        //given

        BinaryTree tree = new BinaryTree();

        Node head = new Node(6);

        tree.insertNode(head);
        tree.insertNode(new Node(3));
        tree.insertNode(new Node(10));
        tree.insertNode(new Node(1));
        tree.insertNode(new Node(2));
        tree.insertNode(new Node(8));
        tree.insertNode(new Node(7));
        //when

        //then
        tree.bfs(head);

        System.out.println("===");
        tree.dfs(head);
    }

}