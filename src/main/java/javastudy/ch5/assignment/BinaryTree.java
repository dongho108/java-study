package javastudy.ch5.assignment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private Node root;
    private int size;

    public BinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertNode(Node node) {

        this.size += 1;

        if (root == null) {
            root = node;
            return;
        }

        Node parentNode = root;
        Node currentNode = root;
        boolean isLeft = true;

        while (currentNode != null) {
            parentNode = currentNode;
            if (node.getValue() < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
                isLeft = true;
            } else {
                currentNode = currentNode.getRight();
                isLeft = false;
            }
        }

        if (isLeft) {
            parentNode.setLeft(node);
        } else {
            parentNode.setRight(node);
        }

    }

    public void bfs(Node node) {

        if (node == null) {
            throw new NullPointerException("node is null");
        }

        Queue<Node> queue = new LinkedList<>();
        String res = "";

        queue.add(node);

        while (queue.size() != 0) {
            Node currentNode = queue.poll();
            res += (currentNode.getValue() + " -> ");

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }

        System.out.println(res + "end");
    }

    public void dfs(Node node) {
        if (node == null) {
            throw new NullPointerException("node is null");
        }

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        dfs(node, stack);
        System.out.print("end");
    }

    private void dfs(Node node, Stack<Node> stack) {
        Node currentNode = stack.pop();
        System.out.print(node.getValue() + " -> ");

        if (currentNode.getLeft() != null) {
            stack.push(currentNode.getLeft());
            dfs(currentNode.getLeft(), stack);
        }

        if (currentNode.getRight() != null) {
            stack.push(currentNode.getRight());
            dfs(currentNode.getRight(), stack);
        }
    }
}
