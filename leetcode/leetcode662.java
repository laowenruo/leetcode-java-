package leetcode;

import leetcode.剑指offer.中等题.TreeNode;

public class leetcode662 {
    public int widthOfBinaryTree(TreeNode root) {
        int right=dfs(root.right);
        int left=dfs(root.left);
        int result=Math.abs(right-left);
        if (result==0){
            return (int) Math.pow(2,left-1);
        }
        else if (result>=1){
            return Math.max(right,left);
        }
        return -1;
    }
    public int dfs(TreeNode root){
        if (root==null) {
            return 0;
        }
        return Math.max(dfs(root.left)+1,dfs(root.right)+1);
    }
}
