public class leetcode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
     int max=0;
     int temp=0;
     for (int i=0;i<nums.length;i++){
         if (nums[i]==1) temp++;
         if (nums[i]!=1){
             max=max>temp?max:temp;
             temp=0;
         }
     }
     return max;
    }
}
