package leetcode.ListNode1.leetcode题目;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class leetcode93 {


    public class Solution {

        public List<String> restoreIpAddresses(String s) {
            int n=s.length();
            List<String> list=new ArrayList<>();
            if (n<4||n>12){
                return list;
            }
            Deque<String> path = new ArrayDeque<>(4);
            dfs(s,n,0,4,path,list);
            return list;
        }

        private void dfs(String s, int len, int begin, int residue, Deque<String> path, List<String> list) {
            if (begin==len){
                if (residue==0){
                    list.add(String.join(".",path));
                }
                return;
            }
            for (int i=begin;i<begin+3;i++){
                if (i>=len){
                    break;
                }
                if (residue*3<len-i){
                    continue;
                }
                if (judge(s,begin,i)){
                    String current=s.substring(begin,i);
                    path.addLast(current);
                    dfs(s,len,i,residue-1,path,list);
                    path.removeLast();
                }
            }
        }

        private boolean judge(String s, int left, int right) {
            int len=right-left+1;
            if (len>1&&s.charAt(left)=='0'){
                return false;
            }
            int res=0;
            while (left<=right){
                res=res*10+s.charAt(left)-'0';
                left++;
            }
            return res>=0&&res<=255;
        }

    }

}
