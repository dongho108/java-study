package javastudy.ch8;

public interface MyInterface {
    void method();
    default void newMethod() {}
//    public default void newMethod() {}
}
