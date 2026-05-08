package com.dsa;
class ListNode1{
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleOfLinkedList {
    public static ListNode1 findMiddle(ListNode1 head) {
        ListNode1 slow = (ListNode1) head;
        ListNode1 fast = (ListNode1) head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // 1 step
            fast = fast.next.next;  // 2 steps
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(3);
        head.next.next.next = new ListNode1(4);
        head.next.next.next.next = new ListNode1(5);

        ListNode1 middle = findMiddle1(head);
        System.out.println(middle.val); // 3
    }

	private static ListNode1 findMiddle1(ListNode1 head) {
		// TODO Auto-generated method stub
		return null;
	}
}