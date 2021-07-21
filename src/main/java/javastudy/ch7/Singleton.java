package javastudy.ch7;

public class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {}

    // 인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static 이어야 합니다.
    public static Singleton getInstance() {
        return s;
    }
}
