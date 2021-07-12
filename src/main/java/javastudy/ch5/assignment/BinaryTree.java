package javastudy.ch5.assignment;

import java.util.*;

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

    public void removeNode(Node node) {

    }

    public List<Integer> bfs(Node node) {

        if (node == null) {
            throw new NullPointerException("node is null");
        }

        Queue<Node> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(node);

        while (queue.size() != 0) {
            Node currentNode = queue.poll();
            result.add(currentNode.getValue());

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }

        return result;
    }

    public List<Integer> dfs(Node node) {
        if (node == null) {
            throw new NullPointerException("node is null");
        }

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        List<Integer> result = new ArrayList<>();
        dfs(node, stack, result);
        return result;
    }

    private void dfs(Node node, Stack<Node> stack, List<Integer> result) {
        Node currentNode = stack.pop();
        result.add(node.getValue());

        if (currentNode.getLeft() != null) {
            stack.push(currentNode.getLeft());
            dfs(currentNode.getLeft(), stack, result);
        }

        if (currentNode.getRight() != null) {
            stack.push(currentNode.getRight());
            dfs(currentNode.getRight(), stack, result);
        }
    }
}
