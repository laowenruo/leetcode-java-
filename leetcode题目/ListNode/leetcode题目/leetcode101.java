package leetcode题目.ListNode.leetcode题目;

import javahomework.TreeNode;

public class leetcode101 {
//    List<Integer> list=new ArrayList<>();
//    public void bianli(TreeNode root){
//        if (root!=null) {
//            bianli(root.left);
//            list.add(root.val);
//            bianli(root.right);
//        }
//    }
//    public boolean isSymmetric1(TreeNode root) {  //中序遍历判断  有错误
//        bianli(root);
//        int n=list.size()-1;
//        for (int i=0;i<n/2;i++){
//            if (list.get(i)!=list.get(n-i)) return false;
//        }
//        return true;
//    }
//public boolean isSymmetric1(TreeNode root) {   //递归
//    if (root==null) return true;
//    return cmp(root.left,root.right);
//}
//public boolean cmp(TreeNode node1,TreeNode node2){
//    if (node1==null&&node2==null) return true;
//    if (node1==null||node2==null||node1.val!=node2.val) return false;
//    return cmp(node1.left,node2.right)&&cmp(node1.right,node2.left);
//}
    public boolean isSymmetric(TreeNode root){
        if (root==null){
            return false;
        }
        boolean cmp = cmp(root.left, root.right);
        return cmp;
    }
    public boolean cmp(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null){
            return true;
        }
        if (root1==null||root2==null||root1.val!= root2.val){
            return false;
        }
        return cmp(root1.left,root2.right)&&cmp(root1.right, root2.left);
    }
}
