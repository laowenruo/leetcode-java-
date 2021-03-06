package leetcode;

import leetcode.剑指offer.中等题.TreeNode;

public class leetcode112 {
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root==null){
                return false;
            }
            if (root.left==null&&root.right==null){
                return targetSum-root.val==0;
            }
            return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
        }
    }
}
