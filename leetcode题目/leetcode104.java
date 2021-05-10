package leetcode题目;

import javahomework.TreeNode;

public class leetcode104 {
    class Solution {
        public int maxDepth(TreeNode root) {
             if (root==null) return 0;
             return  Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        public int maxDepth1(TreeNode root){
            if (root==null){
                return 0;
            }
            return Math.max(maxDepth1(root.left)+1,maxDepth1(root.right)+1);
        }
    }
}
