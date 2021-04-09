package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum6 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // ... do something with line
                String[] str=line.split(" ");
                int sum=0;
                for (int i=0;i<str.length;i++){
                    sum+=Integer.parseInt(str[i]);
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            // ... handle IO exception
        }
    }
}
