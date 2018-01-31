package com.Algorithm.LeetCode.Simple;

public class SubtreeOfAnotherTree {
    public static void main(String[] args){
        TreeNode s = new TreeNode(3);
        s.left = new TreeNode(4);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);
        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);
        System.out.println(compare(s,t));
        System.out.println(isSubtree(s,t));
    }

    public static boolean isSubtree(TreeNode s, TreeNode t){
        if(s.val == t.val) {
            if(compare(s,t)) return true;
        }
        if(s.left != null){
            if(isSubtree(s.left, t)) return true;
        }
        if(s.right != null){
            if(isSubtree(s.right, t)) return true;
        }
        return false;
    }

    public static boolean compare(TreeNode s, TreeNode t){
        if((s.left == null && t.left !=null) || (s.left != null && t.left == null)) return false;
        if((s.right == null && t.right !=null) || (s.right != null && t.right == null)) return false;
        if(s.val != t.val) return false;
        if(s.left != null){
            if(!compare(s.left, t.left)) return false;
        }
        if(s.right != null){
            if(!compare(s.right, t.right)) return false;
        }
        return true;
    }
}
