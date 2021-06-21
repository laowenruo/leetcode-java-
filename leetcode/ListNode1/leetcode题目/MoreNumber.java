package leetcode.ListNode1.leetcode题目;

public class MoreNumber {
    public int[] findClosedNumbers(int num) {
        int s = count1(num);
        int[] result=new int[]{-1,-1};
        for (int i = num + 1; i <= 2147483647; i++) {
                if (count1(i) == s) {
                    result[0] = i; break;
                }
            }
        for (int i = num - 1; i >= 0; i--) {
            if (count1(i) == s) {
                result[1] = i; break;
            }
        }
        return result;
    }
    public int count1(int num) {
        int cnt = 0;
        while (num>0) {
            ++cnt;
            num=(num-1)&num;
        }
        return cnt;
    }
}
