package leetcode题目;

import 剑指offer.中等题.TreeNode;

import java.util.Arrays;

public class leetcode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        if(preorder.length == 0){
            return root;
        }
        int rootval=preorder[0];
        root = new TreeNode();
        root.val=rootval;
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==rootval){
                index=i;
                break;
            }
        }
        root.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        root.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return root;
    }
}
