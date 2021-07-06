package javastudy.ch4.assignment2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
    @Test
    @DisplayName("ListNodeTest")
    public void nodeTest() throws Throwable {
        //given
        ListNode head = new ListNode();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        //when
        head.add(head, node1, 1);
        head.add(head, node2, 2);
        head.add(head, node3, 3);
        head.add(head, node4, 4);
        head.add(head, node5, 5);

//        head.print(head);
        head.remove(head, 3);

//        System.out.println("===");
//        head.print(head);

        //then
        assertAll("assertAll",
                () -> assertTrue(head.contains(head, node1)),
                () -> assertTrue(head.contains(head, node2)),
                () -> assertFalse(head.contains(head, node3)),
                () -> assertTrue(head.contains(head, node4)),
                () -> assertTrue(head.contains(head, node5)));
    }

}