package pratice.one.one;

import pratice.one.basic.TreeNode;

public class ncJZ26 {
    private TreeNode pre=null;
    private TreeNode head=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }

    private void inOrder(TreeNode pRootOfTree) {
        if (pRootOfTree==null){
            return;
        }
        inOrder(pRootOfTree.left);
        pRootOfTree.left=pre;
        if (pre!=null){
            pre.right=pRootOfTree;
        }
        pre=pRootOfTree;
        if (head==null){
            head=pRootOfTree;
        }
        inOrder(pRootOfTree.right);
    }
}
