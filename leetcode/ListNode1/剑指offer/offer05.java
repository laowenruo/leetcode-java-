package leetcode.ListNode1.剑指offer;

public class offer05 {
    public String replaceSpace(String s) {
      StringBuilder str=new StringBuilder();
      for (int i=0;i<s.length();i++){
          if (s.charAt(i)==' ')  str.append("%20");
          else str.append(s.charAt(i));
      }
      return String.valueOf(str);
    }
}
