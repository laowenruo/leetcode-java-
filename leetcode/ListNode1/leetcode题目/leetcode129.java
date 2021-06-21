package leetcode.ListNode1.leetcode题目;

import leetcode.ListNode1.剑指offer.中等题.TreeNode;

public class leetcode129 {
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
    static class Solution {
        static int sum;
        public int sumNumbers(TreeNode root) {
            sum = 0;
            childSum(0, root);
            return sum;
        }
        public static void  childSum(int val, TreeNode root) {
            if(root == null) {
                return;
            }
            int k = (val * 10 + root.val) ;
            if(root.left == null && root.right == null) {
                sum += k;
            }
            childSum(k, root.left);
            childSum(k, root.right);
        }
    }
}
