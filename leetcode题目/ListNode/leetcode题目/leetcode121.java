package leetcode题目.ListNode.leetcode题目;

public class leetcode121 {
//    public int maxProfit(int[] prices) {
//      int max=0;
//      int temp;
//      for (int i=0;i<prices.length;i++){
//          for (int j=i;j<prices.length;j++){
//              if (prices[i]<prices[j]){
//                  temp=(prices[j]-prices[i]);
//                  max=max>temp?max:temp;
//              }
//          }
//      }
//      return max;
//    }    //超过时间限制
public int maxProfit(int[] prices) {
    int max=0;
    int min=prices[0];
    for (int i=1;i<prices.length;i++){
     max=Math.max(prices[i]-min,max);
     min=Math.min(prices[i],min);
}
    return max;
}
}
