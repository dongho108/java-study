package javastudy.ch14.wildcard;

class Box<T>{
    private T object;

    public void set(T object){
        this.object = object;
    }

    public T get() {
        return object;
    }
}

class Toy{
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

class BoxHandler {
    public static void outBox(Box<? extends Toy> box) {
        Toy t = box.get();
//        box.set(new Toy()); // 프로그래머가 실수로 작성한 코드
        System.out.println(t);
    }

    public static void inBox(Box<? super Toy> box, Toy n) {
        box.set(n);
//        Toy myToy = box.get();
    }
}


public class BoundedWildCardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);

    }
}
