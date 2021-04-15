package ListNode;

import 剑指offer.中等题.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeTest {
    List<List<Integer>> lists=new ArrayList<>();
    public void dfs(TreeNode treeNode,List<Integer> list){
        if (treeNode==null) return;
        list.add(treeNode.val);
        lists.add(new ArrayList<>(list));
        dfs(treeNode.left,list);
        dfs(treeNode.right,list);
        list.remove(list.size()-1);
    }
}
