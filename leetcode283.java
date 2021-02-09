import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class leetcode283 {
    class Solution {
        public void moveZeroes(int[] nums) {
          if (nums==null||nums.length<=1) return;
          int index=0;
          for (int i=0;i< nums.length;i++){
              if (nums[i]!=0) {
                  nums[index++]=nums[i];
              }
          }
          for (int i=index;i<nums.length;i++) nums[i]=0;
        }
    }
}
