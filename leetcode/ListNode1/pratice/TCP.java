package leetcode.ListNode1.pratice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP {
    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(65000);
        while(true){
            Socket socket=ss.accept();
            new ThreadSocket(socket).start();
        }
    }
}
