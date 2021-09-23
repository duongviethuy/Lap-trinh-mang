import java.net.ServerSocket;
import java.net.Socket;

public class TCPforServer2 {
    
    public static void main(String[] args) {
        try {
            ServerSocket SS = new ServerSocket(8888);
            System.err.println("Second Server was creatad");

            while(true) {
                Socket socket = SS.accept();
                Process process = new Process(socket);
                process.start();                
            }

        } catch (Exception e) {
            //TODO: handle exception
        }
    }


}
