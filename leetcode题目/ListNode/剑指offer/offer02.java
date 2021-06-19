package leetcode题目.ListNode.剑指offer;

import leetcode题目.ListNode.剑指offer.中等题.TreeNode;

import java.util.HashMap;

public class offer02 {
    public HashMap<Integer,Integer> map=new HashMap<>();
    public int[] preorder;
    public ListNode.剑指offer.中等题.TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        return buildTree(0,0,inorder.length-1);
    }
    public ListNode.剑指offer.中等题.TreeNode buildTree(int root, int left, int right){
        if(left>right) return null;
        ListNode.剑指offer.中等题.TreeNode node=new TreeNode(preorder[root]);
        int i=map.get(preorder[root]); //得到下标，开始划分左右子树
        node.left=buildTree(root+1,left,i-1);
        node.right=buildTree(i-left+root+1,i+1,right);
        return node;
    }

    public static void main(String[] args) {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        System.out.println(new offer02().buildTree(preorder, inorder));
    }
}
