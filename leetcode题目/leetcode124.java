package leetcode题目;

import 剑指offer.中等题.TreeNode;

import java.util.Stack;

public class leetcode124 {
    public static int max=0;
    public int maxPathSum(TreeNode root) {
        if (root==null){
            return 0;
        }
        dfs(root);
        return max;
    }
    public static int dfs(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftMax=Math.max(dfs(root.left),0);
        int rightMax=Math.max(dfs(root.right),0);
        max=Math.max(max,root.val+leftMax+rightMax);
        return root.val+Math.max(leftMax,rightMax);
    }
}
