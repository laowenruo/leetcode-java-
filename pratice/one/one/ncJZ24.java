package pratice.one.one;

import pratice.one.basic.TreeNode;

import java.util.ArrayList;

public class ncJZ24 {
    public ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root==null){
            return lists;
        }
        ArrayList<Integer> list=new ArrayList<>();
        dfs(root,target,list);
        return lists;
    }
    public void dfs(TreeNode root,int target,ArrayList<Integer> list){
        if (root==null){
            return;
        }
        list.add(root.val);
        target=target-root.val;
        if (target==0&&root.left==null&&root.right==null){
            lists.add(new ArrayList<>(list));
        }else {
            dfs(root.left, target, list);
            dfs(root.right,target,list);
        }
        list.remove(list.size()-1);
    }
}
