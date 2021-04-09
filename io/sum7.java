package io;

import java.util.Scanner;

public class sum7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNextLine()){
            String[] s = in.nextLine().split(" ");
            Long a = Long.parseLong(s[0]);
            Long b = Long.parseLong(s[1]);
            System.out.println(a+b);
        }
        in.close();
    }
}
