package com.Algorithm.LeetCode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(3);
        ListNode ans = deleteDuplicates(head);
        System.out.println(ans.val);
        System.out.println(ans.next.val);
        System.out.println(ans.next.next.val);
    }

    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        if (head.next.val == head.val) {
            ListNode next = head.next;
            while (head.val == next.val) {
                if (next.next != null)
                    next = next.next;
                else {
                    next = null;
                    break;
                }
            }
            head.next = next;
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }

}
