package javastudy.ch4.assignment2;

import java.util.Arrays;

public class ArrayQueue {
    private int[] array = new int[10];
    private int left;
    private int right;

    public ArrayQueue() {
        initializer();
        this.left = 0;
        this.right = -1;
    }

    private void initializer() {
        Arrays.fill(array, -1);
    }

    public void append(int data) {
        if (right == array.length-1) { // 배열이 꽉찼다면 배열의 크기를 두배로 늘림
            int[] newStArr = new int[array.length * 2];
            for (int i = 0; i < array.length * 2; i++) {
                if (left <= i && i <= right) {
                    newStArr[i] = array[i];
                } else {
                    newStArr[i] = -1;
                }

            }
            array = newStArr;
        }

        right += 1;
        array[right] = data;

    }

    public int pop() {
        if (right - left < 0) {
            System.out.println("Queue가 비어있습니다.");
            return -1;
        }

        int res = array[left];
        array[left] = -1;
        left += 1;
        return res;
    }

    public void print() {
        if (right - left < 0) {
            System.out.println("Queue가 비어있습니다.");
            return;
        }

        for (int i = left; i < right + 1; i++) {
            System.out.println(array[i]);
        }
    }
}
