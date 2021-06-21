package leetcode.ListNode1.leetcode题目;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    class Solution {
        List<List<Integer>> lists=new ArrayList<>();
        public List<List<Integer>> subsets(int[] nums) {
            if (nums.length==0){
                return lists;
            }
            List<Integer> list=new ArrayList<>();
            dfs(0,list,nums);
            return lists;
        }

        private void dfs(int begin, List<Integer> list,int[] nums) {
            lists.add(new ArrayList<>(list));
            for (int i=begin;i< nums.length;i++){
                list.add(nums[i]);
                dfs(i+1,list,nums);
                list.remove(list.size()-1);
            }
        }
    }

}

