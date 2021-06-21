package leetcode.ListNode1.剑指offer;

import javahomework.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class offer32 {
    List<List<Integer>> list=new ArrayList<>();
    public void bianli(int depth,TreeNode root){
    if (root==null) return ;
    if (list.size()==depth) list.add(new ArrayList<>());
    list.get(depth).add(root.val);
    bianli(depth+1,root.left);
    bianli(depth+1,root.right);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
     bianli(0,root);
     return list;
    }
}
