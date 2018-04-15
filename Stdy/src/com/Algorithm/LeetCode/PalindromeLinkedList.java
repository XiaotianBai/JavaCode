package com.Algorithm.LeetCode;

public class PalindromeLinkedList {
    boolean ended = false;
    ListNode copy;

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        copy = head;
        return helper(head);
    }

    private boolean helper(ListNode head) {
        boolean bool = true;
        if (head.next == null) ended = true;
        while (!ended) bool = helper(head.next);
        return bool && (helper2() == head.val);
    }

    private int helper2() {
        int temp = copy.val;
        copy = copy.next;
        return temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        PalindromeLinkedList test = new PalindromeLinkedList();
        System.out.print(test.isPalindrome(head));
    }
}
