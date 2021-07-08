package pratice.one.one;

import pratice.one.basic.TreeNode;

public class ncJZ58 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot==null){
            return true;
        }
        return isSymmetrical(pRoot.left,pRoot.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        if (left.val!=right.val){
            return false;
        }
        return isSymmetrical(left.left,right.right)&&isSymmetrical(left.right,right.left);
    }
}
