package leetcode题目;

import 剑指offer.中等题.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode98 {
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
}
