import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPforServer {
    public static void main(String[] args) {
        try {
            ServerSocket SS = new ServerSocket(8888);
            System.out.println("Server was created");
            while(true) {
                Socket socket = SS.accept();
    
                InputStream IS = socket.getInputStream();
                OutputStream OS = socket.getOutputStream();
    
                int ch = 0;
                while(true) {
                    ch = IS.read();

                    if(ch == -1) {
                        SS.close();
                        System.out.println("Server was Closed");
                        break;
                    }
                        

                    System.out.println((char) ch);
                    OS.write(ch);
                }
            }
    
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
