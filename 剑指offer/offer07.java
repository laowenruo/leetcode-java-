package 剑指offer;

import javahomework.TreeNode;
public class offer07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       int preLen= preorder.length;
       int inLen= inorder.length;
       if (preLen!=inLen) System.out.println("数据错误");
       return buildTree(preorder,0,preLen-1,inorder,0,inLen-1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart>preEnd||inStart>inEnd) return null;
        int pivot=preorder[preStart]; //根节点
        TreeNode treeNode=new TreeNode(pivot);
        int pivotIndex=inStart;
        while (inorder[pivotIndex]!=pivot) pivotIndex++;
        treeNode.left=buildTree(preorder,preStart+1,pivotIndex-inStart+preStart,inorder,inStart,pivotIndex-1);
        treeNode.right=buildTree(preorder,pivotIndex-inStart+preStart+1,preEnd,inorder,pivotIndex+1,inEnd);
        return treeNode;
    }
}
