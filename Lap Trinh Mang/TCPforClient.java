import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPforClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            System.out.println("Client was created");

            InputStream IS = socket.getInputStream();
            OutputStream OS = socket.getOutputStream();

            for(int i ='0' ;  i<='9' ;i++) {
                OS.write(i);

                int ch = IS.read();
                System.out.println((char) ch);

                Thread.sleep(2000);
            }
            
            if (socket!=null) 
                socket.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
