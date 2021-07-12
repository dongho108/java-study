package javastudy.ch2;

public class VariableScopeExam {
    int globalScope = 10; //global variable
    static int staticVal = 7; // class variable

    public void scopeTest(int value){ // value -> local variable
        int localScope = 20; // local variable
    }

    public static void main(String[] args) {
        System.out.println(staticVal);      //사용가능
//        System.out.println(globalScope); // 사용불가능
    }

}