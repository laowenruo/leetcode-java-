package 剑指offer;

import javahomework.TreeNode;
public class offer55 {
    public int maxDepth(TreeNode root) {
     if (root==null) return 0;
     int left=maxDepth(root.left)+1;
     int right=maxDepth(root.right)+1;
     return Math.max(left,right);
    }
}
