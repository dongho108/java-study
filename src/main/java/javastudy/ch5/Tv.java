package javastudy.ch5;

public class Tv {
    // Tv의 속성(멤버변수)
    private String color;
    private boolean power;
    private int channel;

    // Tv의 기능(메서드)

    public Tv() {
        this("Black");
    }

    public Tv(String color) {
        this.color = color;
    }

    void power() { power = !power; } // TV를 켜거나 끄는 메서드
    int getChannel() { return channel; } // 현재 채널 반환
    void setChannel(int channel) { this.channel = channel; } //채널 수정
    void channelUp() { ++channel; } // TV의 채널을 높이는 기능을 하는 메서드
    void channelDown() { --channel; } // TV의 채널을 낮추는 기능을 하는 메서드
}

class TvTest{
    public static void main(String[] args) {
        Tv t = new Tv(); // TV인스턴스를 생성후 그 주소를 t에 담기
        t.setChannel(7); // TV인스턴스의 channel을 7로하기
        t.channelDown(); // TV 채널 Down
        System.out.println("now channel = " + t.getChannel());
    }
}
