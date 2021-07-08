package pratice.one.one;

import pratice.one.basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ncJZ22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int cnt=queue.size();
            while (cnt-->0){
                TreeNode t=queue.poll();
                if (t==null){
                    continue;
                }
                list.add(t.val);
                queue.add(t.left);
                queue.add(t.right);
            }
        }
        return list;
    }
}
