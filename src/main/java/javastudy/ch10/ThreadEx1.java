package javastudy.ch10;

public class ThreadEx1 {
    public static void main(String[] args) {

        // Thread 상속방식
        ThreadThread t1 = new ThreadThread();

        // Runnable 구현방식
        Runnable r = new ThreadRunnable();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}