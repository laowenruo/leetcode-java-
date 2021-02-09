public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {  //暴力破解
        int[] a=new int[2];
      for (int i=0;i< nums.length;i++){
          for (int j=i+1;j<nums.length;j++){
              if (nums[i]+nums[j]==target)
              {
                  a[0]=i;
                  a[1]=j;
                  break;
              }
          }
      }
      return a;
    }
}
