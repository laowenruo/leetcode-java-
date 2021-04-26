package pratice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 65000);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
        int ch=0;
        byte[] buffer=new byte[1024];
        ch=inputStream.read(buffer);
        String content=new String(buffer,0,ch);
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
