package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindModeInBinarySearchTree {
    int prev, freq = 0;
    boolean first = true;
    int max = 1;
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> res = new ArrayList<>();
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(2);
        FindModeInBinarySearchTree f = new FindModeInBinarySearchTree();
        System.out.println(Arrays.toString(f.findMode(root)));
        System.out.println(f.max);
    }

    private int[] findMode(TreeNode root){
        int[] ans = {};
        if(root == null) return ans;
        helper(root);
        if(freq == max){
            res.add(prev);
        }
        else if(freq > max){
            res.clear();
            res.add(prev);
        }


        ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void helper(TreeNode root){
        if(root.left != null) helper(root.left);
        if(first){
            prev = root.val;
            first = false;
        }
        if(root.val == prev) {
            freq++;
        }
        else if(freq == max){
            res.add(prev);
            prev = root.val;
            freq = 1;
        }
        else if(freq > max){
            res.clear();
            res.add(prev);
            prev = root.val;
            max = freq;
            freq = 1;
        }
        else {
            prev = root.val;
            freq = 1;
        }
        if(root.right != null) helper(root.right);

    }



}
