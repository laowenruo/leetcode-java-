package leetcode题目.数据结构.Tree;

public class ArrayTreeTest {
    public static void main(String[] args) {
        ArrayTree arrayTree=new ArrayTree(5,2);
        arrayTree.add(0,1,true);
        arrayTree.add(0,3,false);
        arrayTree.add(1,4,true);
        arrayTree.add(1,5,false);
        arrayTree.preOrder(0);
    }

}
