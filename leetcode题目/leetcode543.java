package leetcode题目;

import java.util.Stack;
import javahomework.TreeNode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class leetcode543 {
//本题为求左子树最大深度以及右子树的最大深度，两者之和即可得出答案
    class Solution {
    int max = 0; //全局变量
    public int diameterOfBinaryTree1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=dfs(root.left)+1;
        int right=dfs(root.right)+1;
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null){
            return 0;
        }
        dfs(root);
        return max;
    }

}
}

