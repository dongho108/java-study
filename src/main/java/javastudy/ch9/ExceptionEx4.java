package javastudy.ch9;

public class ExceptionEx4 {
}

class MyException extends Exception {
    private final int ERR_CODE;

    MyException(String message) {
        this(message, 100);
    }

    MyException(String message, int errCode) {
        super(message);
        ERR_CODE = errCode;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }

}
