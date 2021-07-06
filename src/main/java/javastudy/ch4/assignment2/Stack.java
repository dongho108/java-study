package javastudy.ch4.assignment2;

public class Stack {
    private int[] stArr = new int[10];
    private int top = -1;

    public Stack() {
        initializer();
    }

    private void initializer() {
        for (int i = 0; i < stArr.length; i++) {
            stArr[i] = -1;
        }
    }

    public void push(int data) {
        if (top == stArr.length-1) { // 배열이 꽉찼다면 배열의 크기를 두배로 늘림
            int[] newStArr = new int[stArr.length * 2];
            for (int i = 0; i < stArr.length * 2; i++) {
                if (i < stArr.length) {
                    newStArr[i] = stArr[i];
                } else {
                    newStArr[i] = -1;
                }

            }
            stArr = newStArr;
        }

        top += 1;
        stArr[top] = data;

    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack이 비어있습니다");
            return -1;
        }

        int res = stArr[top];
        stArr[top] = -1;
        top -= 1;
        return res;
    }

    public void print() {
        String data = "";
        for (int i = 0; i < stArr.length; i++) {
            data += (stArr[i] + ", ");
        }

        System.out.println("data = " + data);
        System.out.println("top = " + top);

    }
}
