package javastudy.ch4.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeQueueTest {

    @Test
    public void ListNodeQueueTest() throws Throwable {
        //given
        ListNodeQueue queue = new ListNodeQueue();

        for (int i = 0; i < 15; i++) {
            queue.append(i);
        }
        //when
//        queue.print();

        //then
        for (int i = 0; i < 16; i++) {
            if (i == 15) {
                assertEquals(-1, queue.pop());
            } else {
                assertEquals(i, queue.pop());
            }
        }

        for (int i = 0; i < 15; i++) {
            queue.append(i);
        }

        for (int i = 0; i < 16; i++) {
            if (i == 15) {
                assertEquals(-1, queue.pop());
            } else {
                assertEquals(i, queue.pop());
            }
        }

//        queue.print();
    }

}