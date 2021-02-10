import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    class Solution {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        int len;

        public List<List<Integer>> subsets(int[] nums) {
            //对于每个元素，两个选择，包含，不包含
            ArrayList<Integer> list=new ArrayList<>();
            len = nums.length;
            lists.add(new ArrayList<>());//直接把空集先放入，不然后面会多次放入空集
            dfs(0, list, nums);
            return lists;
        }

        void dfs(int index, List<Integer> list, int[] nums) {
            lists.add(new ArrayList<>(list));// 注意：Java 的引用传递机制，这里要 new 一下
            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                dfs(i + 1,list,nums);
                list.remove(list.size() - 1);// 组合问题，状态在递归完成后要重置
            }
        }
        void huisu(int index,List<Integer> list,int[] nums){
            lists.add(new ArrayList<>(list));
            for (int i=index;i< nums.length;i++){
                list.add(nums[i]);
                huisu(i+1,list,nums);
                list.remove(list.size()-1);
            }
        }
    }
}

