package javastudy.ch3;

class A{}

public class AssignOperator {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);

        obj1 = obj2;
        System.out.println("=====");
        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
    }
}
