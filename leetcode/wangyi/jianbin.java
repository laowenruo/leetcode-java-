package leetcode.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class jianbin {
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        String[] s;
        //数量
        int count=0;
        //零钱表
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        hashMap.put(5,2);
        hashMap.put(10,0);
        hashMap.put(20,0);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            s = bufferedReader.readLine().split(" ");
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<s.length;i++) {
            list.add(Integer.parseInt(s[i]));
        }
        for (Integer pay : list) {
            if (pay==5) {
                count++;
                hashMap.put(5,hashMap.get(5)+1);
            }
            else if (pay==10){
                if (hashMap.get(5)>=1){
                    hashMap.put(10,hashMap.get(10)+1);
                    hashMap.put(5,hashMap.get(5)-1);
                    count++;
                }
                else {
                    break;
                }
            }
            else if (pay==20){
                if (hashMap.get(5)>=3){
                    hashMap.put(5,hashMap.get(5)-3);
                    count++;
                }
                else if (hashMap.get(10)>=1&&hashMap.get(5)>=1){
                    hashMap.put(5,hashMap.get(5)-1);
                    hashMap.put(10,hashMap.get(10)-1);
                    count++;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
