package pratice.one.one;

public class offer03 {
        public int findRepeatNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                while (i!=nums[i]){
                    if (nums[i]==nums[nums[i]]){
                        return nums[i];
                    }
                    swap(i,nums[i],nums);
                }
            }
            return -1;
        }
        public void swap(int i,int j,int[] nums){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}
