package leetcode题目.ListNode.leetcode题目;

import leetcode题目.ListNode.剑指offer.ListNode;
import leetcode题目.ListNode.剑指offer.中等题.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode144 {
    class Solution {
        public List<Integer> preorderTraversal(ListNode.剑指offer.中等题.TreeNode root) {
            List<Integer> list=new ArrayList<>();
            recur(root,list);
            return list;
        }
        public void recur(ListNode.剑指offer.中等题.TreeNode root, List<Integer> list){
            if (root==null){
                return;
            }
            list.add(root.val);
            recur(root.left,list);
            recur(root.right,list);
        }
        public List<Integer> preorderTraversal1(ListNode.剑指offer.中等题.TreeNode root) {
            List<Integer> list=new ArrayList<>();
            Stack<TreeNode> stack=new Stack<>();
            if (root==null){
                return list;
            }
            stack.push(root);
            while (!stack.isEmpty()){
                TreeNode pop = stack.pop();
                list.add(pop.val);
                if (pop.right!=null){
                    stack.push(pop.right);
                }
                if (pop.left!=null){
                    stack.push(pop.left);
                }
            }
            return list;
        }
    }
}
