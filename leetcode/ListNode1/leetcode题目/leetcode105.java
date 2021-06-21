package leetcode.ListNode1.leetcode题目;

import leetcode.ListNode1.剑指offer.中等题.TreeNode;

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
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }前序遍历 preorder = [3,9,20,15,7]
     *  中序遍历 inorder = [9,3,15,20,7]
     */
    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder,0, preorder.length, inorder,0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        if (p_start==p_end){
            return null;
        }
        int root_val=preorder[p_start];
        TreeNode node=new TreeNode(root_val);
        int index=0;
        for (int i=i_start;i<i_end;i++){
            if (inorder[i]==root_val){
                index=i;
                break;
            }
        }
        int num=index-i_start;
        node.left=buildTreeHelper(preorder,p_start+1,p_start+num+1,inorder,i_start,index);
        node.right=buildTreeHelper(preorder,index+1, p_end, inorder,index+1,i_end);
        return node;
    }
}
