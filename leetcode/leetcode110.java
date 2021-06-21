package leetcode;

import javahomework.TreeNode;
public class leetcode110 {
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
    public boolean isBalanced1(TreeNode root){
        return recur(root)!=-1;
    }

    private int recur(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=recur(root.left);
        if (left==-1){
            return -1;
        }
        int right=recur(root.right);
        if (right==-1){
            return -1;
        }
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }
}
