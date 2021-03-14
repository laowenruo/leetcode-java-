package leetcode题目;

public class leetcode151 {
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
    public String reverseWords1(String s) {
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }

}
