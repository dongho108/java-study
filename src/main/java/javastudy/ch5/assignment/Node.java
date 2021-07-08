package javastudy.ch5.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private boolean visited;

    public Node() {
        this.left = null;
        this.right = null;
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    //    public int removeNode() {
//
//    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
