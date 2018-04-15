package com.Algorithm.LeetCode;

public class LowestCommonAncestorOfABST {
    TreeNode res;
    int curDepth;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        LowestCommonAncestorOfABST l = new LowestCommonAncestorOfABST();
        l.lowestCommonAncestor(root, root.left.left, root.right.left);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LowestCommonAncestorOfABST l = new LowestCommonAncestorOfABST();
        l.findBoth(root, p.val, q.val, 0);
        System.out.print(l.res.val);
        return l.res;
    }


    private boolean find(TreeNode root, int p) {
        if (root == null) return false;
        if (root.val == p) return true;

        if (root.val > p && root.left != null) return find(root.left, p);
        if (root.val < p && root.right != null) return find(root.right, p);
        return false;
    }

    private void findBoth(TreeNode root, int p, int q, int depth) {
        if (root == null) return;
        if (find(root, p) && find(root, q)) {
            if (this.res == null) {
                this.curDepth = depth;
                this.res = root;
            } else if (this.curDepth < depth) {
                this.curDepth = depth;
                this.res = root;
            }
            findBoth(root.left, p, q, depth + 1);
            findBoth(root.right, p, q, depth + 1);
        }
    }

}
