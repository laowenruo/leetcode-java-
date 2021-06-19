package leetcode题目.ListNode.leetcode题目;

import java.util.ArrayList;
import java.util.List;

public class leetcode77 {
    public int k;
    public int n;
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        this.k=k;
        this.n=n;
        List<Integer> list=new ArrayList<>();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=i+1;
        }
        dfs(0,nums,list);
        return lists;
    }
    public void dfs(int start,int[] nums,List<Integer> list){
        if (list.size()==k){
            lists.add(new ArrayList<>(list));
        }
        for (int i=0;i<n;i++){
            list.add(nums[i]);
            dfs(i+1,nums,list);
            list.remove(list.size()-1);
        }
    }
}
