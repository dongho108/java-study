package javastudy.ch10;

public class ThreadEx5 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx5();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account2 {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        synchronized (this) {
            if (balance >= money) { // 잔고가 뽑을 돈보다 많을 경우에만 인출 가능
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                balance -= money;
            }
        }
    }
}

class RunnableEx5 implements Runnable {
    Account2 acc = new Account2();

    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300 중의 한 값을 임의로 출금
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}
