package javastudy.ch15;

@FunctionalInterface
interface MyFunction {
    public abstract int max(int a, int b);
}

public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };

        MyFunction f = (a, b) -> a > b ? a : b;

        int big = f.max(5, 3);
        System.out.println(big);
    }
}
