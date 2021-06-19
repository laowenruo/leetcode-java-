package leetcode题目.数据结构.Tree;

public class Test {
    public static void main(String[] args) {
        Tree tree=new Tree(1,"宋江");
        Tree tree1=new Tree(2,"林冲");
        Tree tree2=new Tree(3,"陈胜");
        Tree tree3=new Tree(4,"貂蝉");
        Tree tree4=new Tree(5,"吕布");
        tree.setLeft(tree1);
        tree.setRight(tree2);
        tree2.setLeft(tree3);
        tree2.setRight(tree4);
//        tree.infixOrder(tree);  //中
//        tree.preOrder(tree); //前
//        tree.lastOrder(tree); //后
//        tree.leverOrder(tree,0);
//        System.out.println(tree.list);
//        tree.lastOrderSearch(tree,3);
//        System.out.println(tree.result.toString());
//        System.out.println(tree.infixOrderSearch(tree,3).toString());
        tree.delete(1,tree);
        tree.preOrder(tree);


    }
}
