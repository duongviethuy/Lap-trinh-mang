import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Process extends Thread{
    Socket socket;

    public Process(Socket socket) {
        this.socket = socket;
    }

    public Process() {
    }

    public void run() {
        try {
            while(true) {
    
                InputStream IS = socket.getInputStream();
                OutputStream OS = socket.getOutputStream();
    
                while(true) {
                    int n = IS.read();
                    if(n == -1) {
                        break;
                    }                        

                   // System.out.println((char)n);
                    OS.write(n);
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
