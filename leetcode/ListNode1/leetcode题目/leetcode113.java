package leetcode.ListNode1.leetcode题目;

import leetcode.ListNode1.剑指offer.中等题.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class leetcode113 {
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
    class Solution {
        List<List<Integer>> lists=new ArrayList<>();

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<Integer> list=new ArrayList<>();
            if (root==null){
                return lists;
            }
            dfs(root,targetSum,list);
            return lists;
        }

        private void dfs(TreeNode root, int targetSum, List<Integer> list) {
            if (root==null){
                return;
            }
            targetSum=targetSum-root.val;
            list.add(root.val);
            if (targetSum==0&&root.left==null&&root.right==null){
                lists.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }
            dfs(root.left,targetSum,list);
            dfs(root.right,targetSum,list);
            list.remove(list.size()-1);
        }
    }
}
