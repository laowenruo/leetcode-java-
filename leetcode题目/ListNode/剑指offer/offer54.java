package leetcode题目.ListNode.剑指offer;

import javahomework.TreeNode;

import java.util.ArrayList;

public class offer54 {
    ArrayList<Integer>  list=new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        if (root.left==null||root.right==null) return root.val;
        bianli(root);
        list.stream().sorted();
        return list.get(list.size()-k);
    }
    public TreeNode bianli(TreeNode root){
        if (root.left==null||root.right==null) return root;
        TreeNode left=bianli(root.left);
        TreeNode rigth=bianli(root.right);
        list.add(left.val);
        list.add(rigth.val);
        return root;
    }
}
