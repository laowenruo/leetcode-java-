package pratice.one.one;

public class leetcode121 {
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length==0){
            return 0;
        }
        int result=0;
        int min=prices[0];
        for (int i = 1; i < prices.length; i++) {
            result=Math.max(result,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return result;
    }
}
