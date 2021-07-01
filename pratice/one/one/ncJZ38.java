package pratice.one.one;

import pratice.one.basic.TreeNode;

public class ncJZ38 {
    public int TreeDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        return Math.max(left,right)+1;
    }
}
