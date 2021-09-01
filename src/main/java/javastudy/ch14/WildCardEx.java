package javastudy.ch14;

import java.util.Iterator;

class Juice {
    String name;

    public Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
//    static Juice makeJuice(FruitBox<? extends Fruit> box) {
//        String tmp = "";
//        for (Fruit f : box.getList()) {
//            tmp += f + " ";
//        }
//        return new Juice(tmp);
//    }
    static Juice makeJuice(FruitBox box) {
        String tmp = "";
        Iterator it = box.getList().iterator();
        while(it.hasNext()) {
            tmp += (Fruit) it.next() + " ";
        }
        return new Juice(tmp);
    }
}

public class WildCardEx {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));

    }
}
