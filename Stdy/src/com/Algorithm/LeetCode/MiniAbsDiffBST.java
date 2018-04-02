package com.Algorithm.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class MiniAbsDiffBST {
    public static void main(String[] args){
        TreeNode t1 = new TreeNode(101);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(120);
        t1.right.right = new TreeNode(140);
        t1.right.left = new TreeNode(111);
        t1.left.right = new TreeNode(5);
        Queue<Integer> queue = new LinkedList<>();
        getNodes(t1, queue);
        System.out.println(queue);
        System.out.println(getMinimumDifference(t1));
    }

    public static int getMinimumDifference(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        getNodes(root, queue);
        int first = queue.remove(), next = 0, min =  Integer.MAX_VALUE;
        while(!queue.isEmpty())
        {
            next = queue.remove();
            min = Math.min(Math.abs(next - first), min);
            first = next;
        }
        return min;
    }

    private static void getNodes(TreeNode root, Queue<Integer> queue){
        if(root.left != null) getNodes(root.left, queue);
        queue.add(root.val);
        if(root.right != null) getNodes(root.right, queue);
        return;
    }
}
