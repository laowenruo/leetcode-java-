public class offer21 {
    public int[] exchange1(int[] nums) {
     int[] result=new int[nums.length];
     int n=0,m= nums.length-1;
     for (int i=0;i< nums.length;i++){
         if (nums[i]%2==0) result[m--]=nums[i];
         else result[n++]=nums[i];
     }
     return result;
    }   //笨蛋方法，空间复杂度O（N），时间复杂度也是
        public int[] exchange(int[] nums) {  //双指针大法好，实现类似快排
            int i=0,j= nums.length-1;
            int temp;
            while (j>=i){
                while (j>i&&nums[i]%2!=0) i++;
                while (j>i&&nums[j]%2==0) j--;
                temp=nums[i];
                nums[i++]=nums[j];
                nums[j--]=temp;
            }
            return nums;
        }
    }

