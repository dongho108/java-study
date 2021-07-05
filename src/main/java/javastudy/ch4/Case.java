package javastudy.ch4;

public class Case {
    public static void main(String[] args) {
        int num, result;
        final int ONE = 1;

        result = '1';

        switch (result) {
            case '1':   // OK. 문자 리터럴 ('1'은 아스키코드로 정수 49)
            case ONE:   // OK. 정수 상수
//            case "YES": // OK. 문자열 리터럴. JDK 1.7부터 허용
//            case num:   // 에러. 변수는 불가
//            case 1.0:   // 에러. 실수도 불가
        }
    }
}
