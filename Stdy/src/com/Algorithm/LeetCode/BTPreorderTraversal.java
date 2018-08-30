package com.Algorithm.LeetCode;


import java.util.ArrayList;
import java.util.List;

public class BTPreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        helper(root, ans);
        return ans;

    }

    private void helper (TreeNode root, List<Integer> ans) {
        if (root != null) {
            ans.add(root.val);
        }
        else return;
        if (root.left != null) {
            helper(root.left, ans);
        }
        if (root.right != null) {
            helper(root.right, ans);
        }
    }
}
