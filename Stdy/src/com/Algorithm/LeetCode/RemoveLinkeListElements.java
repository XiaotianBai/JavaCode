package com.Algorithm.LeetCode;

public class RemoveLinkeListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        while (head.val == val) {
            if (head.next != null) head = head.next;
            else return null;
        }
        ListNode cur = head;
        while (cur.next != null && cur.next != head) {
            if (cur.next.val == val) {
                if (cur.next.next != null) cur.next = cur.next.next;
                else cur.next = null;
                continue;
            }
            cur = cur.next;
        }
        return head;
    }
}
