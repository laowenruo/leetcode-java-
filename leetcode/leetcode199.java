package leetcode;

import leetcode.剑指offer.中等题.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class leetcode199 {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            if (root==null){
                return list;
            }
            dfs(root,list,0);
            return list;
        }
        public static void dfs(TreeNode root,List<Integer> list,int i){
            if (root==null){
                return;
            }
            if (list.size()==i) {
                list.add(root.val);
            }
            dfs(root.right,list,i+1);
            dfs(root.left,list,i+1);
        }
    }
}
