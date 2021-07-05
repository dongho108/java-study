package javastudy.ch4;

public class While {
    public static void main(String[] args) {
        
        // for문
        for (int i = 1; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // 위의 for문과 동일한 while문
        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
