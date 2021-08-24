package javastudy.ch11;

public class Card {
    enum Kind {CLOVER, HEARD, DIAMOND, SPADE}
    enum Value {TWO, THREE, FOUR}

    final Kind kind;
    final Value value;

    public Card(Kind kind, Value value) {
        this.kind = kind;
        this.value = value;
    }
}

class CardEx {
    public static void main(String[] args) {
        System.out.println(Card.Kind.CLOVER);
        System.out.println(Card.Value.TWO);
        
    }
}