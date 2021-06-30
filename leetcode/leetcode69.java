package leetcode;

public class leetcode69 {
    class Solution {
        public int mySqrt(int x) {
            if (x==1||x==0){
                return x;
            }
            long a=x/2;
            while (a*a>x){
                a=(a+x/a)/2;
            }
            return (int) a;
        }
    }
}
