package task.leet75;

import java.util.List;

public class ReverseList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode next = head.next;

        head.next = null;

        while (next != null) {
            ListNode third = next.next;

            next.next = current;
            current = next;

            next = third;
        }

        return current;
    }

    public static void main(String[] args) {
        final ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//        final ListNode head = new ListNode(1, new ListNode(2));
//        final ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        try {
            ListNode current = new ReverseList().reverseList(head);
            while (current != null) {
                System.out.println(current.val);
                current = current.next;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }


    }
}
