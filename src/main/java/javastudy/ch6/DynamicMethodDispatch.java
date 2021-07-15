package javastudy.ch6;


class Super {
    void print() {
        System.out.println("super's print");
    }
}

class Sub1 extends  Super{
    @Override
    void print() {
        System.out.println("sub1's print");
    }
}

class Sub2 extends Super{
    @Override
    void print() {
        System.out.println("sub2's print");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super reference = new Super(); // 1)
        reference.print();
        reference = new Sub1(); // 2)
        reference.print();
        reference = new Sub2(); // 3)
        reference.print();
    }
}
