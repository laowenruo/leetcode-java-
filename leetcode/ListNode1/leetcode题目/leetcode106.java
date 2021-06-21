package leetcode.ListNode1.leetcode题目;

import javahomework.TreeNode;

public class leetcode106 {
    public TreeNode buildTree(int[] inorder, int[] postorder)  {
        int postLen= postorder.length;
        int inLen= inorder.length;
        if (postLen!=inLen) System.out.println("数据错误");
        return buildTree(inorder,0,inLen-1,postorder,0,postLen-1);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart>inEnd||postStart>postEnd) return null;
        int pivot=postorder[postEnd];
        int pivotIndex=inStart;
        while (inorder[pivotIndex]!=pivot) pivotIndex++;
        TreeNode root=new TreeNode(pivot);
        root.left=buildTree(inorder,inStart,pivotIndex-1,postorder,postStart,postStart+pivotIndex-inStart-1);
        root.right=buildTree(inorder,pivotIndex+1,inEnd,postorder,postStart+pivotIndex-inStart,postEnd-1);
        return root;
    }


}
