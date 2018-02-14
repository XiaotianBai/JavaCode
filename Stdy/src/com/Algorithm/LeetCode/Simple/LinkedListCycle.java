package com.Algorithm.LeetCode.Simple;

public class LinkedListCycle {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode node = new ListNode(3);
        head.next.next = node;
        System.out.print(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode cur = head.next;
        while(cur != null){
            if(cur == head) return true;
            ListNode temp = cur;
            cur = cur.next;
            temp.next = head;
        }

        return false;
    }
}
