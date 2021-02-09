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
public boolean isSymmetric1(TreeNode root) {   //递归
    if (root==null) return true;
    return cmp(root.left,root.right);
}
public boolean cmp(TreeNode node1,TreeNode node2){
    if (node1==null&&node2==null) return true;
    if (node1==null||node2==null||node1.val!=node2.val) return false;
    return cmp(node1.left,node2.right)&&cmp(node1.right,node2.left);
}

}
