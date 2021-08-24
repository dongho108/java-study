package javastudy.ch11;

public class EnumEx1 {
    public static void main(String[] args) {
        Direction[] values = Direction.values();

        for (Direction value : values) {
            System.out.printf("%s = %d\n", value.name(), value.ordinal());
        }
    }
}
