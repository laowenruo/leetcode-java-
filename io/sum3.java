package io;

import java.io.*;
import java.util.Scanner;

public class sum3 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // ... do something with line
                String[] string = line.split(" ");
                int n=Integer.parseInt(string[0]);
                if (n==0) {
                    break;
                }
                int sum=0;
                for (int i=1;i<n+1;i++){
                    sum+=Integer.parseInt(string[i]);
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            // ... handle IO exception
            System.out.println("发生错误");
        }
    }
}
