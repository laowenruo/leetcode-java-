package pratice.one.one;

import pratice.one.basic.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ncJZ60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            int cnt= queue.size();
            while (cnt-->0){
                TreeNode node=queue.poll();
                if (node==null){
                    continue;
                }
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if (list.size()!=0){
                ret.add(list);
            }
        }
        return ret;

    }
}
