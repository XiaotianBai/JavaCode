package com.Algorithm.LeetCode.Simple;

public class DeleteNodeInALinkedList {
    public static void main(String[] args){

    }

    public static void deleteNode(ListNode node){
        while(node.next != null){
            node.val = node.next.val;
            if(node.next.next == null) node.next =null;
            node = node.next;
        }
    }

    public static void bestSolution(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
