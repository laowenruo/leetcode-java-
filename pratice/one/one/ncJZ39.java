package pratice.one.one;

import pratice.one.basic.TreeNode;

public class ncJZ39 {
    public boolean flag=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        height(root);
        return flag;
    }

    private int height(TreeNode root) {
        if (root==null||!flag){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        if (Math.abs(left-right)>1){
            flag=false;
        }
        return Math.max(left,right)+1;
    }
}
