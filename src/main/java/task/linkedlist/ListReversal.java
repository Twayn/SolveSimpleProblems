package task.linkedlist;

public class ListReversal {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        LinkedListAppender appender = new LinkedListAppender();

        int remainder = 0;

        while (head1 != null || head2 != null) {
            var val1 = head1 != null ? head1.getValue() : 0;
            var val2 = head2 != null ? head2.getValue() : 0;

            appender.append((val1 + val2 + remainder) % 10);

            remainder = val1 + val2 > 9 ? 1 : 0;

            head1 = head1 != null ? head1.getNext() : null;
            head2 = head2 != null ? head2.getNext() : null;
        }

        if (remainder > 0) {
            appender.append(remainder);
        }

        return appender.getHead();
    }

    public ListNode reverse(ListNode head) {
        ListNode previous = null;

        while (head != null) {
            ListNode next = head.getNext();
            head.setNext(previous);

            previous = head;
            head = next;
        }

        return previous;
    }

    private static class LinkedListAppender {
        ListNode head;
        ListNode last;

        void append(int value) {
            if (head == null) {
                head = new ListNode(value, null);
                last = head;
            } else {
                last.setNext(new ListNode(value, null));
                last = last.getNext();
            }
        }

        ListNode getHead() {
            return head;
        }
    }

    public static void main(String[] args) {
        LinkedListAppender appender = new LinkedListAppender();

        appender.append(3);
        appender.append(2);
        appender.append(1);

        System.out.println(appender.getHead());
    }
}


