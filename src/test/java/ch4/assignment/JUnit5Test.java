package ch4.assignment;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class JUnit5Test {

    @Test
    void test(){
        assertEquals(1, 1);
    }

    @Test
    void assertAllTest() {
        int num = 10;
        assertAll("assertAll test",
                () -> assertEquals(15, num),
                () -> assertEquals(13, num),
                () -> assertEquals(10, num));

    }

    @Test
    void assertThrowsTest() {
        Exception exception = assertThrows(
                IllegalStateException.class, () -> {
                    throw new IllegalStateException("message");
                }
        );

        assertEquals("message", exception.getMessage());
    }


//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("BeforeAll");
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        System.out.println("BeforeEach");
//    }
//
//    @Test
//    @DisplayName("테스트1")
//    void test1() {
//        System.out.println("Test1");
//    }
//
//    @Test
//    @DisplayName("테스트2")
//    void test2() {
//        System.out.println("Test2");
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("AfterAll");
//    }
//
//    @AfterEach
//    void afterEach() {
//        System.out.println("AfterEach");
//    }
}
