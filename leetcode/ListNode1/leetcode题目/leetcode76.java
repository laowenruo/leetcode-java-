package leetcode.ListNode1.leetcode题目;

public class leetcode76 {
    class Solution {
        public String minWindow(String s, String t) {
            if (s.length()==0||s==null||t.length()==0||t==null){
                return null;
            }
            int[] need=new int[128];
            //记录需要记录的字符
            for (int i=0;i<t.length();i++){
                need[t.charAt(i)]++;
            }
            int l=0,r=0,count=t.length(),start=0,size=Integer.MAX_VALUE;
            while (r<s.length()){
                char c=s.charAt(r);
                if (need[c]>0){
                    count--;
                }
                need[c]--;
                if (count==0){
                    while (l<r&&need[s.charAt(l)]<0){
                        need[s.charAt(l)]++;
                        l++;
                    }
                    if (r-l+1<size){
                        size=r-l+1;
                        start=l;
                    }
                    need[s.charAt(l)]++;
                    l++;
                    count++;
                }
                r++;
            }
            return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
        }
    }
}
