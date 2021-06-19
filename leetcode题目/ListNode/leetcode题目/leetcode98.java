package leetcode题目.ListNode.leetcode题目;

import leetcode题目.ListNode.剑指offer.中等题.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode98 {
    int pre=Integer.MIN_VALUE;
    public boolean flag=true;
    public Queue<Integer> queue=new LinkedList();
    public boolean isValidBST(TreeNode root) {
        def(root);
        return flag;
    }
    public void def(TreeNode root){
        if(!flag||root==null) return;
        def(root.right);
        if (!queue.isEmpty()){
            if (queue.peek()> root.val) {
                queue.poll();
                queue.add(root.val);
            }
            else {
                flag=false;
            }
        }
        else {
            queue.add(root.val);
        }
        def(root.left);

    }
    public boolean isValidBST1(TreeNode root){
        if (root==null){
            return true;
        }
        if (!isValidBST1(root.left)){
            return false;
        }
        if (root.val<=pre){
            return false;
        }
        pre=root.val;
        return isValidBST1(root.right);
    }
}
