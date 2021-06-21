package leetcode;

import java.util.HashMap;
import java.util.Map;

public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int length=0; //定义最长长度
        Map<Character,Integer> hashmap=new HashMap<>(); //定义存放一个字符的表
        for (int start=0,end=0;end<n;end++){
            Character a=s.charAt(end);
            if (hashmap.containsKey(a)){
                start=Math.max(hashmap.get(a),start);
            }
            length=Math.max(end-start+1,length);
            hashmap.put(a,end+1); //方便后期比较相同字符串的时候定位起始位置
        }
        return length;
    }

}
