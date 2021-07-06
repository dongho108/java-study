package javastudy.ch4.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {

    @Test
    @DisplayName("ArrayQueueTest")
    public void test() throws Exception {
        //given
        ArrayQueue queue = new ArrayQueue();

        for (int i = 0; i < 15; i++) {
            queue.append(i);
        }

//        queue.print();

        //when

        //then
        for (int i = 0; i < 16; i++) {
            if (i == 15) {
                assertEquals(-1, queue.pop());
            } else {
                assertEquals(i, queue.pop());
            }
        }

        queue.print();

    }

}