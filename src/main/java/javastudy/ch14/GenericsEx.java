package javastudy.ch14;

class Box<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

public class GenericsEx {
    public static void main(String[] args) {
        Box<String> b = new Box<String>();
        b.setItem("ABC");
        String item = b.getItem();
    }
}
