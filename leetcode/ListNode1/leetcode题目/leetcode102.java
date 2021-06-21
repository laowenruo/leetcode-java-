package leetcode.ListNode1.leetcode题目;

import javahomework.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class leetcode102 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        List<List<Integer>> list=new ArrayList<>();
        public List<List<Integer>> levelOrder(TreeNode root) {
            bianli(0,root);
            return list;
        }
        public void bianli(int depth,TreeNode root){
            if (root==null) return ;
            if (list.size()==depth) list.add(new ArrayList<>());
            list.get(depth).add(root.val);
            bianli(depth+1,root.left);
            bianli(depth+1,root.right);
        }
}
