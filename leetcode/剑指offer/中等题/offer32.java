package leetcode.剑指offer.中等题;
import javahomework.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32 {
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        level(root,0);
        return lists;
    }
    public void level(TreeNode root,int n){
        if (root==null) return;
        if (n>=lists.size()) lists.add(new ArrayList<>());
        if (n%2==1) lists.get(n).add(0, root.val);
        else lists.get(n).add(root.val);
        level(root.left,n+1);
        level(root.right,n+1);
    }
    public List<List<Integer>> levelOrder1(TreeNode root) {   //双端队列实现方法
        List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root!=null) queue.offer(root);
        while (!queue.isEmpty()){
          LinkedList<Integer> list=new LinkedList<>();
          for (int i=queue.size();i>0;i--){
              TreeNode node=queue.poll();
              if (lists.size()%2==0) list.addLast(node.val);
              else list.addFirst(node.val);
              if (node.left!=null) queue.offer(node.left);
              if (node.right!=null) queue.offer(node.right);
          }
          lists.add(list);
        }
        return lists;
    }
}
