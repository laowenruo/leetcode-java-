package leetcode.ListNode1;

import java.util.HashMap;

public class leetcode3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length()==0) {
                return 0;
            }
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int max = 0;
            int n=s.length();
            char[] chars = s.toCharArray();
            for(int end=0,start=0;end<n;end++){
                if(map.containsKey(chars[end])){
                    start=Math.max(start,map.get(chars[end]));
                }
                map.put(chars[end],end+1);
                max=Math.max(max,end-start+1);
            }
            return max;

        }
    }
}
