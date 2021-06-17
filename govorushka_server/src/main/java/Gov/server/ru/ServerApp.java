package Gov.server.ru;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            Socket socket= serverSocket.accept();
            while (true){
                int data= socket.getInputStream().read();
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

