package javastudy.ch5.assignment;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Integer> bfs = tree.bfs(head);
        List<Integer> bfsRes = Arrays.asList(6, 3, 10, 1, 8, 2, 7);

        Assertions.assertEquals(bfs, bfsRes);
        System.out.println(StringUtils.join(bfs, ", "));

        System.out.println("===");

        List<Integer> dfs = tree.dfs(head);
        List<Integer> dfsRes = Arrays.asList(6, 3, 1, 2, 10, 8, 7);
        Assertions.assertEquals(dfs, dfsRes);
        System.out.println(StringUtils.join(dfs, ", "));


    }

}