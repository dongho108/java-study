package javastudy.ch11;

import java.util.EnumSet;

enum Color {
    RED, YELLOW, GREEN, BLUE, BLACK, WHITE
}
public class EnumDemo {
    public static void main(String[] args) {
        EnumSet<Color> set1, set2, set3, set4, set4_1, set5;

        set1 = EnumSet.allOf(Color.class);
        set2 = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        set3 = EnumSet.complementOf(set2);
        set4 = EnumSet.range(Color.YELLOW, Color.BLACK);
        set5 = EnumSet.noneOf(Color.class);

        set5.add(Color.BLACK);
        set5.add(Color.BLUE);
        set5.remove(Color.BLACK);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set3 = " + set3);
        System.out.println("set4 = " + set4);
        try {
            set4_1 = EnumSet.range(Color.BLACK, Color.YELLOW);
            System.out.println("set4_1 = " + set4_1);
        } catch (IllegalArgumentException e) {
            System.out.println("set4_1은 오류가 발생합니다 : " + e.getMessage());
        }
        System.out.println("set5 = " + set5);
    }
}
