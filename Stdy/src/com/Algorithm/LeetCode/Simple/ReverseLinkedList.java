package com.Algorithm.LeetCode.Simple;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode ans = reverseList2(head);
        System.out.print(ans.val);
        System.out.print(ans.next.val);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode copy = head;
        Stack<Integer> stack = new Stack<>();
        while (copy != null) {
            stack.push(copy.val);
            copy = copy.next;
        }
        copy = head;

        while (copy != null) {
            copy.val = stack.pop();
            copy = copy.next;
        }
        return head;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        System.out.print(newHead.next.val);

        return newHead;

    }
}
