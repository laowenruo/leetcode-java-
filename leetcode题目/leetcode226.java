package leetcode题目;

import javahomework.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class leetcode226 {
    public TreeNode invertTree1(TreeNode root) {
          if (root==null) return null;
          TreeNode left=invertTree1(root.left);
          TreeNode right=invertTree1(root.right);
          root.left=right;
          root.right=left;
          return root;
    }
    public TreeNode invertTree(TreeNode root){
        if (root==null){
            return null;
        }
        TreeNode left=invertTree(root.right);
        TreeNode right=invertTree(root.left);
        root.left=right;
        root.right=left;
        return root;
    }
}