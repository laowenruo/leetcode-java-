package leetcode.ListNode1.数据结构.Tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private int no;
    private String name;
    private Tree left;
    private Tree right;
    List<List<Integer>> list=new ArrayList<>();
    Tree result;
    public Tree() {
    }

    public Tree(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
    public void preOrder(Tree root){  //前
        if (root==null) return;
        System.out.println(root.toString());  //操作
        preOrder(root.left);
        preOrder(root.right);
    }
    public void infixOrder(Tree root){  //中
        if (root==null) return;
        infixOrder(root.left);
        System.out.println(root.toString());  //操作
        infixOrder(root.right);
    }
    public void lastOrder(Tree root){  //后
        if (root==null) return;
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.println(root.toString());  //操作
    }
    public void leverOrder(Tree root, int depth){
        if (root==null) return;
        if (list.size()==depth) list.add(new ArrayList<>());
        list.get(depth).add(root.no);
        leverOrder(root.left,depth+1);
        leverOrder(root.right,depth+1);
    }
    public Tree preOrderSearch(Tree root, int id){  //前
        if (root==null) return null;
        if (root.no==id) return root;
        Tree left=preOrderSearch(root.left,id);
        if (left!=null) return left;
        Tree right=preOrderSearch(root.right,id);
        if (right!=null) return right;
        return null;
    }
    public Tree infixOrderSearch(Tree root, int id){  //中
        if (root==null) return null;
        Tree left=infixOrderSearch(root.left,id);
        if (root.no==id) return root;
        Tree right=infixOrderSearch(root.right,id);
//        if (left==null&&right!=null) return right;
//        if (right==null&&left!=null) return left;
//        return null;
        return left==null?(right==null?null:right):left;
    }
    public void lastOrderSearch(Tree root, int id){  //后
        if (root==null) return ;
        if (root.no==id) result=root;
        lastOrderSearch(root.left,id);
        lastOrderSearch(root.right,id);
    }
    public void delete(int id, Tree root){
        Tree temp=root;
        if (root!=null) {
            if (root.no == id) {
                System.out.println("不能删除头节点");
            }
            else {
                deleteNode(id,root);
            }
        }
        else{
            System.out.println("不能删除空树");
        }
    }
    public void deleteNode(int id, Tree root){
        if (root==null) return;
        if (root.left!=null) {
            if (root.left.no==id) {
                root.setLeft(null);
                return;
            }
             deleteNode(id,root.left);
        }
        if (root.right!=null) {
            if (root.right.no==id) {
                root.setRight(null);
                return;
            }
            deleteNode(id,root.right);
        }
        return;
    }
}
