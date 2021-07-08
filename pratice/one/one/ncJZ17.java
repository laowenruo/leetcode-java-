package pratice.one.one;

import pratice.one.basic.TreeNode;

public class ncJZ17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1==null||root2==null){
            return true;
        }
        return isSub(root1,root2)||isSub(root1.left,root2)||isSub(root1.right,root2);
    }

    private boolean isSub(TreeNode root1, TreeNode root2) {
        if (root2==null){
            return true;
        }
        if (root1==null){
            return false;
        }
        if (root1.val!= root2.val){
            return false;
        }
        return isSub(root1.left,root2.left)&&isSub(root1.right,root2.right);
    }
}
