package leetcode题目.ListNode.剑指offer;

public class offer56 {
    public int[] singleNumbers(int[] nums) {  //hashmap较简单，练习下异或
        if (nums==null||nums.length==0) return new int[0];
        int sum=0;
        for (int i=0;i<nums.length;i++){
           sum=sum^nums[i];   //得出最终的异或值
       }
        int flag=1;
        while ((flag&sum)==0)
            flag<<=1; //左移1位，找出最低位为1，则以此分组
        int num1=0,num2=0;
        for (int i=0;i<nums.length;i++){
            if ((nums[i]&flag)==0) num1=num1^flag;
            else num2=num2^flag;
        }
        return new int[]{num1,num2};
    }
}
