package javastudy.ch12;

@interface TestInfo {
    int count() default 1; // 기본 값을 1로 지정
    String testedBy();
    String[] testTools();
    TestType testType();
    DateTime testDate();
}

@interface DateTime {
    String yymmdd();
    String hhmmss();
}
