package leetcode题目.剑指offer;

public class offer58_A {
    public String reverseWords(String s) {
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        String[] s1 = s.split(" ");
        StringBuilder str=new StringBuilder();
        for (int i = s1.length-1; i >=0; i--) {
            if (i==0){
                str.append(s1[i]);
            }
            else str.append(s1[i]+" ");

        }
        return String.valueOf(str);
    }
}
