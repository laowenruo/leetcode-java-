package leetcode.ListNode1.pratice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ThreadSocket extends Thread{
    private Socket socket;
    public ThreadSocket(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run(){
        try {
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            int ch=0;
            byte[] buffer=new byte[1024];
            ch=inputStream.read(buffer);
            String content=new String(buffer,0,ch);
            System.out.println(content);
            outputStream.write(String.valueOf(content.length()).getBytes());
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
