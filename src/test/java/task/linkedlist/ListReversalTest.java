package task.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListReversalTest {
    ListReversal reversal = new ListReversal();

    @Test
    void addTwoNumbers() {
        final ListNode result = reversal.addTwoNumbers(
            new ListNode(2, new ListNode(4, new ListNode(3, null))),
            new ListNode(5, new ListNode(6, new ListNode(4, null)))
        );

        assertEquals(
            new ListNode(7, new ListNode(0, new ListNode(8, null))),
            result
        );
    }

    @Test
    void addTwoNumbers2() {
        final ListNode result = reversal.addTwoNumbers(
            new ListNode(2, new ListNode(4, new ListNode(7, new ListNode(7, null)))),
            new ListNode(5, new ListNode(6, new ListNode(4, null)))
        );

        assertEquals(
            new ListNode(7, new ListNode(0, new ListNode(2, new ListNode(8, null)))),
            result
        );
    }

    @Test
    void reverse() {
        ListNode ordered = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode reversedExpected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, null)))));

        final ListNode reversed = reversal.reverse(ordered);

        assertEquals(reversedExpected, reversed);
    }

    @Test
    void reverse2() {
        ListNode ordered = new ListNode(1, new ListNode(2, null));

        ListNode reversedExpected = new ListNode(2, new ListNode(1, null));

        final ListNode reversed = reversal.reverse(ordered);

        assertEquals(reversedExpected, reversed);
    }
}