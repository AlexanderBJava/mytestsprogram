import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestHTTPServer {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;

        try {

            //1 zanyat port
            serverSocket = new ServerSocket(8082);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                //2 jdat klienta b poluchit socket
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            new Thread(new SocketDispatcher(socket)).start();


        }
    }
}
