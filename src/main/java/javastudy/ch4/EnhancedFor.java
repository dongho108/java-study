package javastudy.ch4;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // 기존 for문 작성법
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }

        // 향상된 for문 작성법
        for (int tmp : arr) {
            System.out.println("arr[i] = " + tmp);
        }
    }
}
