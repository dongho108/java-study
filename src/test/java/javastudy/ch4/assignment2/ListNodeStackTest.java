package javastudy.ch4.assignment2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    @Test
    @DisplayName("ListNodeStackTest")
    public void test() throws Throwable {
        //given

        ListNodeStack st = new ListNodeStack();


        for (int i = 1; i < 15; i++) {
            st.push(i);
        }
        //when


        //then
        for (int i = 14; i > -1; i--) {
            if (i == 0) {
                assertEquals(-1, st.pop());
            } else {
                assertEquals(i, st.pop());
            }
        }
    }

}