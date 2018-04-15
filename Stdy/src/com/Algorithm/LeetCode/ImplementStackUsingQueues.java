package com.Algorithm.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();

        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            if (q1.isEmpty()) {
                q1.add(x);
                while (!q2.isEmpty()) q1.add(q2.remove());
            } else if (q2.isEmpty()) {
                q2.add(x);
                while (!q1.isEmpty()) q2.add(q1.remove());
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() throws Exception {
            if (q1.isEmpty())
                return q2.remove();
            else return q1.remove();
        }

        /**
         * Get the top element.
         */
        public int top() throws Exception {
            if (q1.isEmpty())
                return q2.peek();
            else return q1.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }


    }

    public void test() throws Exception {
        MyStack obj = new MyStack();
        obj.push(0);
        obj.push(1);
        obj.push(2);

        System.out.println(obj.pop());
        System.out.println(obj.top());

    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
