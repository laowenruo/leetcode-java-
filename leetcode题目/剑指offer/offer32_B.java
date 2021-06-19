package leetcode题目.剑指offer;

import javahomework.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class offer32_B {
    Queue<TreeNode> queue=new LinkedList<>();
    ArrayList<Integer> list=new ArrayList<>();
    public int[] levelOrder(TreeNode root) {
    if (root==null) return new int[0];
    queue.add(root);
    while (queue.size()!=0){
        TreeNode poll = queue.poll();
        list.add(poll.val);
        if (poll.left!=null) queue.add(poll.left);
        if (poll.right!=null) queue.add(poll.right);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
