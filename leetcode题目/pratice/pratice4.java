package leetcode题目.pratice;

public class pratice4 {
    public String longestPalindrome(String s) {
        if (s.length()==1) {
            return s;
        }
        char[] chars = s.toCharArray();
        String result="";
        for (int i=0;i< chars.length;i++){
            for (int j=i+1;j< chars.length;j++){
                String str=s.substring(i,j);
                if (isPalindrome(str)&&str.length()>result.length()){
                    result=str;
                }
            }
        }
        return result;
    }
    public boolean isPalindrome(String str){
        char[] chars = str.toCharArray();
        for (int i=0;i< chars.length/2;i++){
            if (chars[i]!=chars[chars.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
