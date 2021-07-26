package javastudy.ch8;

interface InterfaceStatic {

    default void setting() {
        System.out.println("return" + privateMethod());
    }

    static void myMethod() {
        System.out.println("static method");
    }

    private int privateMethod() {
        return 10;
    }

}



public class InterfaceStaticTest {
    public static void main(String[] args) {
        InterfaceStatic.myMethod();
    }
}