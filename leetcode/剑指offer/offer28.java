package leetcode.剑指offer;

import javahomework.TreeNode;

public class offer28 {
    public boolean isSymmetric(TreeNode root) {
      if (root==null) return true;
      else return cmp(root.left,root.right);
    }

    private boolean cmp(TreeNode node1, TreeNode node2) {
        if (node1==null&&node2==null) return true;
        if (node1==null||node2==null||node1.val!=node2.val) return false;
        return cmp(node1.left,node2.right)&&cmp(node1.right,node2.left);
    }
}
