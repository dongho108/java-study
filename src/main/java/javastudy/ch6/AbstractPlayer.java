package javastudy.ch6;

abstract class Player {
    abstract void play(int pos);
    abstract void stop();
}

abstract class AudioPlayer extends Player {
    void play(int pos) {
        // 내용 생략
    }
    void stop() {
        //내용 생략
    }
}



public class AbstractPlayer {
}
