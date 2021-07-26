package javastudy.ch8;

public class Galaxy implements Phone {

    String phoneNumber = "01012341234";

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
