package pratice.one.one;

import pratice.one.basic.TreeNode;

public class ncJZ62 {
    private TreeNode ret;
    private int cnt=0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        inOrder(pRoot,k);
        return ret;
    }

    private void inOrder(TreeNode pRoot, int k) {
        if (pRoot==null||cnt>=k){
            return;
        }
        inOrder(pRoot.left,k);
        cnt++;
        if (cnt==k){
            ret=pRoot;
        }
        inOrder(pRoot.right, k);
    }
}
