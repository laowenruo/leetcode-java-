package leetcode题目.ListNode.剑指offer;

import javahomework.TreeNode;

public class offer55_B {
    public boolean isBalanced(TreeNode root) {
     if (root==null) return true;
     if (!isBalanced(root.left)) return false;
     if (!isBalanced(root.right)) return false;
     int l=digui(root.left);
     int r=digui(root.right);
        if(Math.abs(r - l) > 1){//如果左右子树的深度相差超过一返回false
            return false;
        }
        return true;
    }
    public int digui(TreeNode root){
      if (root==null) return 0;
      int l=digui(root.left)+1;
      int r=digui(root.right)+1;
      return r>l?r:l;
    }
}
