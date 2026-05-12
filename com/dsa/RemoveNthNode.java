package com.dsa;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNthNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // remove node
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        // create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = removeNthFromEnd(head, 2);

        // print result
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
