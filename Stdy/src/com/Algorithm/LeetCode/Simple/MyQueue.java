package com.Algorithm.LeetCode.Simple;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack;
    public static void main(String[] args){
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        //int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
       // System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }

    public MyQueue() {
        this.stack= new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> pushStack = new Stack<>();
        while(!this.stack.empty())
            pushStack.push(this.stack.pop());
        this.stack.push(x);
        while(!pushStack.empty())
            this.stack.push(pushStack.pop());
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return this.stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return this.stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.stack.empty();
    }
}
