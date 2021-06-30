package leetcode.剑指offer;

import javahomework.TreeNode;

public class offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root==null) return null;
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
