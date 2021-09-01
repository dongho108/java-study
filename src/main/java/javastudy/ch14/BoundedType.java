package javastudy.ch14;

import java.util.ArrayList;

class Fruit{}
class Apple extends Fruit {}
class Grape extends Fruit {}
class Toy {}


class FruitBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<>();
    void add(T fruit) {
        list.add(fruit);
    }

    ArrayList<T> getList() {
        return list;
    }
}

public class BoundedType {

    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();

    }
}
