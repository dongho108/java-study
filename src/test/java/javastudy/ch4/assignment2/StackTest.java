package javastudy.ch4.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    @DisplayName("StackTest")
    public void stackTest() throws Exception {
        //given
        Stack st = new Stack();

        for (int i = 0; i < 15; i++) {
            st.push(i);
        }

        //when


        //then
        for (int i = 14; i >= -1; i--) {
            assertEquals(i, st.pop());
        }
    }

}