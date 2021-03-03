public class leetcode338 {
    public int[] countBits(int num) {
     int[] nums=new int[num];
     int[] result=new int[num];
     for (int i=0;i<=num;i++) nums[i]=i;
     for (int i=0;i<=num;i++){
         int temp=nums[i]%2;
         if (temp==0) result[i]=result[temp];
         else result[i]=result[temp]+1;
     }
     return result;
    }
}
