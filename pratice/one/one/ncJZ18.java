package pratice.one.one;

import pratice.one.basic.TreeNode;

public class ncJZ18 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot==null){
            return null;
        }
        TreeNode tempNode=pRoot.left;
        pRoot.left=pRoot.right;
        pRoot.right=tempNode;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
