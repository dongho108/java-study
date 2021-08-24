package javastudy.ch12;

interface anno {
    public String method();
}

public class AnnotationEx1 implements anno {

    @Override
    public String method() {
        return "hi";
    }


}
