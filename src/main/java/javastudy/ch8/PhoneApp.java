package javastudy.ch8;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Galaxy();
        phone = (Galaxy) phone;
    }
}
