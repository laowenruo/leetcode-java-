package leetcode题目.src;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<String, String> pre=new HashMap<>();
    public static HashMap<String, String> after=new HashMap<>();
    public static String[] preString={"anti","post","pre","re","un"};
    public static String[] afterString={"er","ing","ize","tion","ful"};
    static {
        pre.put("anti","against <word>");
        pre.put("post","after <word>");
        pre.put("pre","before <word>");
        pre.put("re","<word> again");
        pre.put("un","not <word>");
        after.put("er","one who <word>s");
        after.put("ing","to actively <word>");
        after.put("ize","change into <word>");
        after.put("tion","the process of <word>ing");
        after.put("ful","full of <word>");
    }
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String unwangdulize(String word) {
        if (word==null) {
            return null;
        }
        String result = null;
        //前缀匹配
        while (true) {
            int count=0;
            for (String s : preString) {
                if (word.startsWith(s)) {
                    String temp=word;
                    String str = pre.get(s);
                    word = word.replaceFirst(s, "");
                    if (result!=null){
                        result = result.replace(temp,str.replace("<word>", word));
                    }
                    else {
                        result = str.replace("<word>", word);
                    }
                }
                else {
                    count++;
                }
            }
            if (count== pre.size()){
                break;
            }
        }
        //后缀匹配
        while (true){
            int count=0;
            for (String s : afterString) {
                if (word.endsWith(s)){
                    String temp=word;
                    String str=after.get(s);
                    word = word.replaceFirst(s, "");
                    if (result!=null){
                        result = result.replace(temp,str.replace("<word>", word));
                    }
                    else {
                        result = str.replace("<word>", word);
                    }
                }else {
                    count++;
                }
            }
            if (count== after.size()){
                break;
            }
        }
        return result;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _word;
        try {
            _word = in.nextLine();
        } catch (Exception e) {
            _word = null;
        }

        res = unwangdulize(_word);
        System.out.println(res);
    }
}
