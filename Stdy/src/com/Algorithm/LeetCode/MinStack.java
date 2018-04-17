package com.Algorithm.LeetCode;

import java.util.LinkedList;


public class MinStack {
    private class LNode {
        int val;
        LNode next;
        LNode(int x){this.val = x;}
    }
    private LNode head;
    private LNode min;
    private int leng;
    public MinStack() {
        head = new LNode(0);
        min = new LNode(0);
        leng = 0;
    }

    public void push(int x) {
        if(leng == 0) {
            head = new LNode(x);
            min = new LNode(x);
        }
        else {
            LNode a = new LNode(x);
            a.next = head;
            head = a;
            LNode b = new LNode(Math.min(min.val, x));
            b.next = min;
            min = b;
        }
        leng++;
    }

    public void pop() {
        if(leng > 0) {
            head = head.next;
            min = min.next;
            leng--;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return min.val;
    }
}
