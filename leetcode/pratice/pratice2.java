package leetcode.pratice;

import leetcode.剑指offer.中等题.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class pratice2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;
    }
    public void dfs(TreeNode root, List<Integer> list){
        if (root==null){
            return;
        }
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }
}
