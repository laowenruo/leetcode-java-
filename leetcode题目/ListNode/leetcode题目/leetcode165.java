package leetcode题目.ListNode.leetcode题目;

import org.junit.Test;

public class leetcode165 {

    class Solution {
        public int compareVersion(String version1, String version2) {
            String[] split = version1.split("\\.");
            String[] split1 = version2.split("\\.");
            int n= split.length;
            int m= split1.length;
            int i=0,j=0;
            while (i<=(n-1)||j<=(m-1)){
                int temp=(i>n-1)?0:Integer.valueOf(split[i]);
                int temp1=(j>m-1)?0:Integer.valueOf(split1[j]);
                if (temp>temp1){
                    return 1;
                }
                else if (temp<temp1){
                    return -1;
                }
                i++;j++;
            }
            return 0;
        }
    }
    @Test
    public void test(){
        System.out.println(new Solution().compareVersion("0.1.1", "1.001.1"));
    }
}
